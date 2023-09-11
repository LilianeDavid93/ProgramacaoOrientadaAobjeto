package br.com.poo.analisedecredito;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.analisedecredito.entidades.Analista;
import br.com.poo.analisedecredito.entidades.Cartao;
import br.com.poo.analisedecredito.entidades.Produto;
import br.com.poo.analisedecredito.entidades.Solicitacao;
import br.com.poo.analisedecredito.entidades.Usuario;
import br.com.poo.analisedecredito.enums.StatusAnalise;

public class AnaliseCredito {

	static Logger logger = Logger.getLogger(AnaliseCredito.class.getName());
	static Scanner sc = new Scanner(System.in);
	static List<Produto> produtos = new ArrayList<>();
	static Analista analista = new Analista(16, "Paulo");
	static List<Solicitacao> solicitacoes = new ArrayList<>();
	static List<Solicitacao> solicitacoesEncerradas = new ArrayList<>();

	public static void main(String[] args) {

		carregarProdutos();
		int opcao;

		do {

			logger.log(Level.INFO, "Menu");
			logger.log(Level.INFO, "1- Visao usuario");
			logger.log(Level.INFO, "2- Visao analista");
			logger.log(Level.INFO, "0- Sair");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				fluxoUsuario();
				break;

			case 2:
				fluxoAnalista();
				break;

			default:
				logger.log(Level.WARNING, "Opcao invalida");
			}

		} while (opcao != 0);

	}

	public static void fluxoUsuario() {
		logger.log(Level.INFO, "===============Fluxo Usuario===============");
		logger.log(Level.INFO, "1 - Solicitar analise de credito.");
		logger.log(Level.INFO, "0 - Voltar");
		int opcao = sc.nextInt();

		if (opcao == 1) {
			// fluxo de analise de credito
			Usuario solicitante = new Usuario();
			solicitante.setUsuarioId(new Random().nextInt());
			logger.log(Level.INFO, "Digite seu nome completo");
			solicitante.setNomeCompleto(sc.next());
			logger.log(Level.INFO, "Digite sua renda mensal");
			solicitante.setRendaMensal(sc.next());
			logger.log(Level.INFO, "Digite seu cpf");
			solicitante.setCpf(sc.next());
			logger.log(Level.INFO, "Digite seu telefone");
			solicitante.setTelefone(sc.next());
			logger.log(Level.INFO, "Digite seu endereco");
			solicitante.setEndereco(sc.next());
			logger.log(Level.INFO, "Selecione o produto desejado");

			for (Produto produto : produtos) {
				logger.log(Level.INFO, produto.toString());
			}

			int produtoId = sc.nextInt();

			Produto produtoSelecionado = null;
			for (Produto produto : produtos) {
				if (produto.getProdutoId() == produtoId) {
					produtoSelecionado = produto;
				}
			}

			if (produtoSelecionado == null) {
				logger.log(Level.WARNING, "Produto nao localizado");
				return;
			}

			Solicitacao solicitacao = new Solicitacao(new Random().nextInt(), new Date(),
					StatusAnalise.EM_PROCESSAMENTO, solicitante.getUsuarioId(), analista.getAnalistaId(),
					produtoSelecionado.getProdutoId(), solicitante, produtoSelecionado, analista);

			solicitante.getSolicitacoes().add(solicitacao);
			analista.getAnalises().add(solicitacao);

			solicitacoes.add(solicitacao);
			logger.log(Level.INFO, "Solicitacao criada com sucesso");
			return;

		}else if (opcao == 0) {
			return;
		} else {
			logger.log(Level.WARNING, "Opcao invalida");
			return;
		}

	}

	public static void carregarProdutos() {
		produtos.add(new Produto(1, "Convencional", 100.0, "Visa", 1000.0));
		produtos.add(new Produto(2, "Internacional", 200.0, "Mastercard", 1000.0));
		produtos.add(new Produto(3, "Platinum", 250.0, "Visa", 1000.0));
		produtos.add(new Produto(4, "Infinity Black", 800.0, "Mastercard", 1000.0));
		produtos.add(new Produto(5, "Gold", 400.0, "Visa", 1000.0));

	}

	public static void fluxoAnalista() {
		logger.log(Level.INFO, "============Analises pendentes============");

		for (Solicitacao solicitacao : solicitacoes) {
			if (solicitacao.getAnalista().getAnalistaId() == analista.getAnalistaId()) {
				logger.log(Level.INFO, solicitacao.toString());
			}
		}

		int opcao;
		do {
			logger.log(Level.INFO, "1 - Aprovar analise.");
			logger.log(Level.INFO, "2 - Reprovar analise.");
			logger.log(Level.INFO, "3 - Visualizar analises encerradas.");
			logger.log(Level.INFO, "0 - Voltar.");
			opcao = sc.nextInt();

			int solicitacaoId;

			switch (opcao) {

			case 1:
				logger.log(Level.INFO, "Informe o ID da solicitacao que deseja aprovar");
				solicitacaoId = sc.nextInt();
				logger.log(Level.INFO, "Informe a data de fechamento de ciclo");
				String fechamentoCiclo = sc.next();
				logger.log(Level.INFO, "Informe o limite de credito");
				double limiteCredito = sc.nextDouble();
				aprovarSolicitacao(solicitacaoId, fechamentoCiclo, limiteCredito, analista);
				break;

			case 2:
				logger.log(Level.INFO, "Informe o ID da solicitacao que deseja reprovar");
				solicitacaoId = sc.nextInt();
				reprovarSolicitacao(solicitacaoId, analista);
				break;
			case 3:
				for(Solicitacao solicitacao : solicitacoesEncerradas) {
					logger.log(Level.INFO, solicitacao.toString());
				}
				break;
			case 0:
				return;
			default:
				logger.log(Level.WARNING, "Opcao invalida!");
			}

		} while (opcao != 0);
	}

	public static void aprovarSolicitacao(int solicitacaoID, String fechamentoCiclo, double limiteCredito,
			Analista analista) {

		Solicitacao solicitacaoAprovar = null;
		for (Solicitacao solicitacao : solicitacoes) {
			if (solicitacao.getSolicitacaoId() == solicitacaoID
					&& solicitacao.getStatus() == StatusAnalise.EM_PROCESSAMENTO
					&& limiteCredito < solicitacao.getProduto().getLimiteTotalCredito()) {

				solicitacaoAprovar = solicitacao;				
			}
		}

		if (solicitacaoAprovar == null) {
			logger.log(Level.WARNING, "Solicitacao nao pode ser aprovada!");
			return;
		}
		
		solicitacoes.remove(solicitacaoAprovar);

		Calendar dataVencimento = Calendar.getInstance();
		dataVencimento.add(Calendar.YEAR, +10);

		Cartao cartao = new Cartao(new Random().nextInt(), fechamentoCiclo, String.valueOf(new Random().nextInt()),
				String.valueOf(100 + (Math.random() * 100)), dataVencimento.getTime(), limiteCredito,
				solicitacaoAprovar.getUsuariId(), solicitacaoAprovar.getProdutoId(),
				solicitacaoAprovar.getSolicitacaoId(), solicitacaoAprovar.getUsuario(), solicitacaoAprovar,
				solicitacaoAprovar.getProduto());

		solicitacaoAprovar.setStatus(StatusAnalise.APROVADO);
		solicitacaoAprovar.setAtualizacaoData(new Date());
		solicitacaoAprovar.getUsuario().getCartoes().add(cartao);
		solicitacaoAprovar.setDataFinalizacao(new Date());
		solicitacoesEncerradas.add(solicitacaoAprovar);
		
		logger.log(Level.INFO, "Cartao gerado com sucesso. Analista: " + analista.getNome());
	}

	public static void reprovarSolicitacao(int solicitacaoID, Analista analista) {
		Solicitacao solicitacaoReprovar = null;
		for (Solicitacao solicitacao : solicitacoes) {
			if (solicitacao.getSolicitacaoId() == solicitacaoID
					&& solicitacao.getStatus() == StatusAnalise.EM_PROCESSAMENTO) {

				solicitacaoReprovar = solicitacao;
			}
		}

		if (solicitacaoReprovar == null) {
			logger.log(Level.WARNING, "Solicitacao nao pode ser aprovada!");
			return;
		}
		
		solicitacoes.remove(solicitacaoReprovar);

		solicitacaoReprovar.setStatus(StatusAnalise.REPROVADO);
		solicitacaoReprovar.setAtualizacaoData(new Date());
		solicitacaoReprovar.setDataFinalizacao(new Date());
		solicitacoesEncerradas.add(solicitacaoReprovar);
		logger.log(Level.INFO, "Solicitacao reprovada. Analista: " + analista.getNome());
	}
}

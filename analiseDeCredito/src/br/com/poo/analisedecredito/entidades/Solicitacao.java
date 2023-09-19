package br.com.poo.analisedecredito.entidades;

import java.util.Date;

import br.com.poo.analisedecredito.enums.StatusAnalise;

public class Solicitacao {

	private int solicitacaoId;
	private Date dataCriacao;
	private StatusAnalise status;
	private Date atualizacaoData;
	private Date dataFinalizacao;
	private int usuariId;
	private int analistaId;
	private int produtoId;
	private Usuario usuario;     //relacionamento de classes
	private Produto produto;
	private Analista analista;
	private Cartao cartao;
	
	
	public Solicitacao(int solicitacaoId, Date dataCriacao, StatusAnalise status, int usuariId, 
			int analistaId, int produtoId, Usuario usuario, Produto produto, Analista analista) {
		super();
		this.solicitacaoId = solicitacaoId;
		this.dataCriacao = dataCriacao;
		this.status = status;
		this.atualizacaoData = null;
		this.dataFinalizacao = null;
		this.usuariId = usuariId;
		this.analistaId = analistaId;
		this.produtoId = produtoId;
		this.usuario = usuario;
		this.produto = produto;
		this.analista = analista;
		this.cartao = null;
	}

	public int getSolicitacaoId() {
		return solicitacaoId;
	}

	public void setSolicitacaoId(int solicitacaoId) {
		this.solicitacaoId = solicitacaoId;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public StatusAnalise getStatus() {
		return status;
	}

	public void setStatus(StatusAnalise status) {
		this.status = status;
	}

	public Date getAtualizacaoData() {
		return atualizacaoData;
	}

	public void setAtualizacaoData(Date atualizacaoData) {
		this.atualizacaoData = atualizacaoData;
	}

	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public int getUsuariId() {
		return usuariId;
	}

	public void setUsuariId(int usuariId) {
		this.usuariId = usuariId;
	}

	public int getAnalistaId() {
		return analistaId;
	}

	public void setAnalistaId(int analistaId) {
		this.analistaId = analistaId;
	}

	public int getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Analista getAnalista() {
		return analista;
	}

	public void setAnalista(Analista analista) {
		this.analista = analista;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		return "\nSolicitacaoID " + solicitacaoId  + "\nData Criacao: " + dataCriacao + "\nStatus: " + status
				+ "\nAtualizacao Data: " + atualizacaoData + "\nData Finalizacao: " + dataFinalizacao + "\nUsuariId="
				+ usuariId + "\n analistaId=" + analistaId + "\nProdutoId=" + produtoId + "\nUsuario=" + usuario
				+ "\nProduto=" + produto + "\nAnalista=" + analista + "]";
	}	
	
}

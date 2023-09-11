package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralInt {

	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
		
	private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private static Logger logger = Logger.getLogger(BalancoTrimestralInt.class.getName());

	public int soma() {
		String mensagem = String.format("O balanço trimestral é de R$ %d", somaTotal);
		logger.log(Level.INFO, mensagem);
		return somaTotal;
	}

	public int soma(int janeiro) {
		String mensagem = String.format("Os gastos de janeiro foi R$ %d", janeiro);
		logger.log(Level.INFO, mensagem);
		return janeiro;
	}

	public int soma(int janeiro, int fevereiro) {
		int somaBi = janeiro + fevereiro;
		String mensagem = String.format("O balanço bimestral é de R$ %d", somaBi);
		logger.log(Level.INFO, mensagem);
		return somaBi;
	}

	public int soma(int janeiro, int fevereiro, int marco) {
		int somaTri = janeiro + fevereiro + marco;
		String mensagem = String.format("O balanço trimestral é de R$ %d", somaTri);
		logger.log(Level.INFO, mensagem);
		return somaTri;
	}

}

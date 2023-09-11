package br.com.poo.balanco;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralBig {

	private BigDecimal gastosJaneiro = new BigDecimal(15000.00);
	private BigDecimal gastosFevereiro = new BigDecimal(23000.00);
	private BigDecimal gastosMarco = new BigDecimal(17000.00);
	
	private BigDecimal somaTotal = gastosJaneiro.add(gastosFevereiro.add(gastosMarco));
	private static Logger logger = Logger.getLogger(BalancoTrimestralBig.class.getName());
	
	public BigDecimal soma() {
		String mensagem = String.format("O balanço trimestral é de R$ %2.f", somaTotal);
		logger.log(Level.INFO, mensagem);
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal janeiro) {
		String mensagem = String.format("O balanço trimestral é de R$ %2.f", janeiro);
		logger.log(Level.INFO, mensagem);
		return janeiro;		
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro) {
		BigDecimal somaBi = janeiro.add(fevereiro);
		String mensagem = String.format("O balanço trimestral é de R$ %2.f", somaBi);
		logger.log(Level.INFO, mensagem);
		return somaBi;
	}
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		BigDecimal somaTri = janeiro.add(fevereiro.add(marco));
		String mensagem = String.format("O balanço trimestral é de R$ %2.f", somaTri);
		logger.log(Level.INFO, mensagem);
		return somaTri;
	}
}

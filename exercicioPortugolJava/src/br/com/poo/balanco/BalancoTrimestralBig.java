package br.com.poo.balanco;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.bancoIndividual.Util;

public class BalancoTrimestralBig {

	private BigDecimal gastosJaneiro = new BigDecimal(15000.00);
	private BigDecimal gastosFevereiro = new BigDecimal(23000.00);
	private BigDecimal gastosMarco = new BigDecimal(17000.00);
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private static Logger customLogger = Util.setupLogger();	
	private BigDecimal somaTotal = gastosJaneiro.add(gastosFevereiro.add(gastosMarco));
	private static Logger logger = Logger.getLogger(BalancoTrimestralBig.class.getName());
	
	public BigDecimal soma() {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O balanço trimestral é de R$ " + df.format(somaTotal));
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O gasto de janeiro foi de R$ " + df.format(janeiro));
		return janeiro;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro) {
		Util.customizer();
		BigDecimal somaBi = janeiro.add(fevereiro);
		somaTotal = janeiro;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro bimestre foi de R$ " + df.format(somaBi));
		return somaBi;
	}
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		Util.customizer();
		BigDecimal somaTri = janeiro.add(fevereiro.add(marco));
		customLogger.log(Level.INFO, () -> "O gasto do primeiro trimestre foi de R$ " + df.format(somaTri));
		return somaTri;
	}
}

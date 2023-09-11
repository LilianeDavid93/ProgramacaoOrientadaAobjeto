package br.com.poo.balanco;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestral {

	public static Logger logger = Logger.getLogger(BalancoTrimestral.class.getName());

	public static void main(String[] args) {
		
				BalancoTrimestralInt bti = new BalancoTrimestralInt();
				bti.soma();
				bti.soma(10000);
				bti.soma(10, 50);	
				bti.soma(10, 50, 2900);
				logger.log(Level.INFO, "A soma e  " + bti.soma());
				
				BalancoTrimestralDoub btd = new BalancoTrimestralDoub();
				btd.soma();
				btd.soma(258);
				btd.soma(5000, 3000);
				btd.soma(0, 0, 10);
				logger.log(Level.INFO, "A soma dos meses sao: " + btd.soma());
				
				BalancoTrimestralBig big = new BalancoTrimestralBig();
				big.soma();
				big.soma(new BigDecimal(10000));
				big.soma(new BigDecimal(100), new BigDecimal(50));
				big.soma(new BigDecimal(100), new BigDecimal(50), new BigDecimal(50000));
				logger.log(Level.INFO, "A soma dos meses sao: " + big.soma());
			}
}

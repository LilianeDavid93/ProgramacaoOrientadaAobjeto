package br.com.poo.balanco;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestral {

	public static Logger logger = Logger.getLogger(BalancoTrimestral.class.getName());

	public static void main(String[] args) {

//		BalancoTrimestralInt bti = new BalancoTrimestralInt();
//
//		bti.soma();
//		bti.soma(1);
//		bti.soma(10, 50);
//
//		logger.log(Level.INFO, "A soma e  " + bti.soma());
//
//		BalancoTrimestralDoub btd = new BalancoTrimestralDoub();
//
//		btd.soma();
//		btd.soma(100.000, 10);
//		btd.soma(10, 50);
//
//		logger.log(Level.INFO, "A soma dos meses sao: " + btd.soma());
//
//		BalancoTrimestralBig big = new BalancoTrimestralBig();
//
//		big.soma();
//		big.soma(new BigDecimal(100.00));
//		big.soma(new BigDecimal(50.00),new BigDecimal(550.00));
//		big.soma(new BigDecimal(100.00),new BigDecimal(50.00),new BigDecimal(1000));
//
//		logger.log(Level.INFO, "A soma dos meses sao: " + big.soma());

		BalancoAnual bs = new BalancoAnual();
		
		
		System.out.println(bs);	
		
	}

}

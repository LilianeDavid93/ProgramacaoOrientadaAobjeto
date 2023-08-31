package br.com.poo.balanco;

import java.math.BigDecimal;

public class BalancoTrimestralBig1 {

	BigDecimal gastosJaneiro = new BigDecimal(1.5000);   
	BigDecimal gastosFevereiro = new BigDecimal(2.3000);
	BigDecimal gastosMarco = new BigDecimal(1.7000);
	BigDecimal gastosTrimestrais = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
	
	System.out.printf("Os gastos trimestrais foram " + gastosTrimestrais);
}

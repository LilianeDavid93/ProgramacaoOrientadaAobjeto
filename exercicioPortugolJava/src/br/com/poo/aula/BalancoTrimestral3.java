package br.com.poo.aula;

import java.math.BigDecimal;
import java.util.Scanner;

public class BalancoTrimestral3 {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		BigDecimal gastosJaneiro = new BigDecimal(1.5000);   
		BigDecimal gastosFevereiro = new BigDecimal(2.3000);
		BigDecimal gastosMarco = new BigDecimal(1.7000);
		BigDecimal gastosTrimestrais = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
		
		System.out.println("Os gastos trimestrais foram " + gastosTrimestrais);
		
	}

}

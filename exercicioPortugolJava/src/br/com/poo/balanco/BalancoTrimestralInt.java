package br.com.poo.balanco;

public class BalancoTrimestralInt {

	public static void main(String[] args) {
		
		Integer gastosJaneiro = 15000;
		Integer gastosFevereiro = 23000;
		Integer gastosMarco = 17000;
		Integer soma;
		
		soma = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		Integer gastosTrimestre = soma;		
		System.out.println("Os gastos trimestrais foram: " + soma);
		

	}

}

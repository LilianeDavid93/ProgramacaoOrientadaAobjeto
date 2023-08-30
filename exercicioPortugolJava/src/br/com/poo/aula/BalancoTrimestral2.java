package br.com.poo.aula;

public class BalancoTrimestral2 {

	public static void main(String[] args) {
		Double gastosJaneiro = 15000.0;
		Double gastosFevereiro = 23000.0;
		Double gastosMarco = 17000.0;
		Double soma;
		
		soma = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		Double gastosTrimestre = soma;
		
		System.out.printf("Os gastos trimestrais foram: R$" + soma);

	}

}

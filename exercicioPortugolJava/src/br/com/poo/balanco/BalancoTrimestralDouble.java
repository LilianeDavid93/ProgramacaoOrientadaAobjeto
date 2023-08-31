package br.com.poo.balanco;

public class BalancoTrimestralDouble {

	Double gastosJaneiro = 15000.0;
	Double gastosFevereiro = 23000.0;
	Double gastosMarco = 17000.0;
	Double soma;
	
	soma = gastosJaneiro + gastosFevereiro + gastosMarco;
	
	Double gastosTrimestre = soma;
	
	System.out.println("Os gastos trimestrais foram:  R$" + soma);

}
}

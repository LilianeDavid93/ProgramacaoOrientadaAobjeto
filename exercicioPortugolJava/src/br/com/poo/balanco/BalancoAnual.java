package br.com.poo.balanco;

public class BalancoAnual {
	
	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
	private Integer gastosAbril = 15000;
	private Integer gastosMaio = 2000;
	private Integer gastosJunho = 2000;
	private Integer gastosJulho = 5000;
	
	//private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho;
	
	public BalancoAnual(Integer janeiro, Integer fevereiro, Integer marco, Integer abril, Integer maio, Integer junho, Integer julho) {
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		this.gastosMarco = marco;
		this.gastosAbril = abril;
		this.gastosMaio = maio;
		this.gastosJunho = junho;
		this.gastosJulho = julho;
	}
	
	@Override
	public String toString() {
		return "Gasto janeiro = " + gastosJaneiro + "\n gastos fevereiro = " + gastosFevereiro
				+ "\n gastos marco = " + gastosMarco + "\n gastos abril = " + gastosAbril + "\n gastos maio = " + gastosMaio
				+ "\n gastos junho = " + gastosJunho + "\n gastos de julho = " + gastosJulho;
	}
	public BalancoAnual() {
		
	}
	
	
	
}


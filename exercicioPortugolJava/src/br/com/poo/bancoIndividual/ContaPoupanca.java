package br.com.poo.bancoIndividual;

import java.text.DecimalFormat;

public class ContaPoupanca extends Conta{
	
	private double taxa = 0.1;
	private double rendimento;	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	public ContaPoupanca() {
		super();	
	}
	
	public ContaPoupanca(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
		 //this.rendimento = rendimento;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Conta Poupanca\nTitular = " + getTitular() + "\nNumero da conta = " + getNumero() + 
                "\nSaldo = " + df.format(getSaldo()) + "\nRendimento = " + df.format(getRendimento());
	}

	public double rendimento(){
		this.rendimento = this.getSaldo() * taxa;
		setSaldo(this.getSaldo() + rendimento);
		return rendimento;
	}
	
	

}

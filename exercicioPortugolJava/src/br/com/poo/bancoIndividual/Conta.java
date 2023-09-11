package br.com.poo.bancoIndividual;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conta {
	Logger logger = Logger.getLogger(Conta.class.getName());

	// atributos da classe
	private int numero;
	private String titular;
	private double saldo;

	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public Conta() {

	}

	// metodos da classe
	public boolean depositar(double valor) {

		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			logger.log(Level.WARNING, "Valor invalido para deposito");
			return false;
		}
	}

	public boolean sacar(double valor) {

		if (valor > 0 && valor < saldo) {

			this.saldo -= valor;
			return true;
		} else {
			logger.log(Level.WARNING, "Valor indisponivel para saque. ");
			return false;
		}
	}
	// transferir(conta, valorTransferencia);

	public boolean transferir(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			logger.log(Level.WARNING, "Valor invalido para deposito");
			return false;
		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}

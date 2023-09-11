package br.com.poo.bancoIndividual;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoIndividual {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(BancoIndividual.class.getName());

		Conta minhaConta = new Conta("Liliane", 1256, 1000.00);
		Conta minhaConta2 = new Conta("Abner", 456, 1500.00);

		logger.log(Level.INFO, "Saldo atual: " + minhaConta.getSaldo());

		minhaConta.depositar(100.00);
		logger.log(Level.INFO, "Saldo atual: " + minhaConta.getSaldo());

		minhaConta.sacar(2000.00);
		logger.log(Level.INFO, "Saldo atual:" + minhaConta.getSaldo());

		ContaPoupanca cp = new ContaPoupanca("Marcos", 25684, 1500.00);
		logger.log(Level.INFO, cp::toString);
		cp.rendimento();
		logger.log(Level.INFO, cp::toString);

		// logger.log(Level.INFO,"Saldo atual e: " + minhaConta.getSaldo());

//		minhaConta.sacar(50);
//		logger.log(Level.INFO, "Valor transferido com sucesso." + minhaConta.getSaldo());
//		
//		logger.log(Level.INFO, "Saldo atual: " + minhaConta.getSaldo());
//		
//		minhaConta2.depositar(200.00);
//		logger.log(Level.INFO, "Saldo atual: " + minhaConta2.saldo);
//		

	}

}

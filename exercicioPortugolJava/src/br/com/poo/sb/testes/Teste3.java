package br.com.poo.sb.testes;

public class Teste3 {

	public static void main(String[] args) {

		// OPERACAO SPLIT RECORTAR STRING

		String s = "Limao Mamao batata";

		String[] vetor = s.split(" ");
		String ex1 = vetor[0];
		String ex2 = vetor[1];
		String ex3 = vetor[2];

		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);

	}

}

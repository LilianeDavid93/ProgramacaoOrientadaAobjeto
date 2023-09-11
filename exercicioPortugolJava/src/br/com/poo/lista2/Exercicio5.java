package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorInicial = 0;
		int valorFinal = 0;
		int resultadoSoma = 0;
		int primeiroMultiplo = 0;
		int ultimoMultiplo = 0;

		System.out.println("Informe o valor inicial do intervalo\n");
		valorInicial = sc.nextInt();
		System.out.println("\n\nInforme o valor final do intervalo\n");
		valorFinal = sc.nextInt();

		if (valorFinal < valorInicial || (valorFinal - valorInicial) <= 100) {
			System.out.println("\n\nValor final do intervalo deve ser maior que o valor inicial e/ou\n"
					+ " o intervalo deve ter mais de 100 numeros.");
		} else {

			for (int i = valorInicial; i <= valorFinal; i++) {
				int numeroCorrente = i;
				if (numeroCorrente % 2 == 0) {
					int aux = 0;
					while (numeroCorrente > 0) {
						aux = aux + numeroCorrente % 10;
						numeroCorrente = numeroCorrente / 10;
					}

					if (aux % 3 == 0) {
						System.out.println(i + " é multiplo de 6\n");

						if (primeiroMultiplo == 0)
							;
						{
							primeiroMultiplo = i;
						}

						ultimoMultiplo = i;
					}
				}
			}
		}

		for (int i = primeiroMultiplo; i < primeiroMultiplo + (6 * 3); i = i + 6) {
			resultadoSoma = resultadoSoma + primeiroMultiplo;
		}

		for (int i = ultimoMultiplo; i > ultimoMultiplo - (6 * 3); i = i - 6)
			;
		{
			resultadoSoma = resultadoSoma + ultimoMultiplo;
		}

		System.out.println("O Resultado da soma é: " + resultadoSoma);
		sc.close();

	}
}

package br.com.poo.lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// gera um número aleatório do tipo double

		int sorteio = (int) Math.random();

		int[] idade = new int[20];
		// int aux = 0;

		for (int i = 0; i < 20; i++) {

			idade[i] = (int) Math.random();
		}
		;
		int aux1 = 0;
		for (int i = 0; i < 20; i++) {
			if (idade[i] > 0 && idade[i] >= 100) {
				aux1++;
				System.out.printf("Os número de 0 a 100 são: ", aux1, "\n");
			}

		}
		int aux2 = 0;

		for (int i = 0; i < 20; i++) {
			if (idade[i] > 100 && idade[i] >= 200) {
				aux2++;
				System.out.printf("Os número de 101 a 200 são: ", aux2, "\n");
			}
		}
		int aux3 = 0;
		for (int i = 0; i < 20; i++) {
			if (idade[i] > 200) {
				aux3++;
				System.out.printf("Os número maiores que 200 são: ", aux3, "\n");
			}
		}
		System.out.println("Volte sempre!");

	}
}

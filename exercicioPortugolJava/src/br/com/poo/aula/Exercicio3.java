package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDaSoma1;
		int numeroDaSoma2;
		int soma;
		double divisao;
		
		System.out.println("Digite um numero: \n");
		numeroDaSoma1 = sc.nextInt();
		System.out.println("Digite outro numero: \n");
		numeroDaSoma2 = sc.nextInt();
		
		soma = numeroDaSoma1 + numeroDaSoma2;
		
		divisao = (double)numeroDaSoma1 / (double)numeroDaSoma2;
		
		System.out.println("A soma destes numeros e " + soma + " " + "e a divisao e " + divisao);

		sc.close();
	}

}

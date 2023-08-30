package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int saida;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		saida = n1 + n2;
		
		System.out.println("A soma dos numeros e igual a\t" + saida);
		
		sc.close();
	}

}

package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] idade = new int[6];
		int total = 0;
		
		for(int i =0; i < 5; i++) {
			System.out.printf("Qual a idade do colega: %d ", i +1);
			idade[i] = sc.nextInt();
	};
		System.out.println("Qual é a minha idade? ");
		idade[5] = sc.nextInt();
		
		for(int i = 0; i < 6; i++) {
			total = total + idade[i];
		};
		System.out.println("O tempo total de via meu e dos meus colegas e: " + total);
			
		sc.close();
}
}

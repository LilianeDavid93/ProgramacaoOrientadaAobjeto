package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		String sobrenome;
		int opcaoEscolhida;

		System.out.println("================Bem vindo ao Poseidon.===============\n\n");
		System.out.println("Qual seu nome? ");
		nome = sc.next();
		System.out.println("Qual seu sobrenome? \n");
		sobrenome = sc.next();
		System.out.println("Escolha uma das opções a baixo.\n\n");

		System.out.println(1 + " ===============Facebook=============\n");
		System.out.println(2 + " ==============Instagram=============\n");
		System.out.println(3 + " ===============Twitter==============\n");
		System.out.println(4 + " ==============Lindekin==============\n");
		opcaoEscolhida = sc.nextInt();

		switch (opcaoEscolhida) {
		case 1:
			System.out.println("*****Bem vindo ao Facebook*****" + "\n" + nome + " " + sobrenome);
			break;

		case 2:
			System.out.println("*****Bem vindo ao Instagram*****" + "\n " + nome + " " + sobrenome);
			break;

		case 3:
			System.out.println("*****Bem vindo ao Twitter *****" + "\n" + nome + " " + sobrenome);
			break;

		case 4:
			System.out.println("*****Bem vindo ao Linkedin*****" + "\n " + nome + " " + sobrenome);
			break;

		default:
			System.out.println("Opcao invalida!");
			break;
		}
		if (opcaoEscolhida < 1 || opcaoEscolhida > 4) {
			sc.close();
		}
		;
	}

}

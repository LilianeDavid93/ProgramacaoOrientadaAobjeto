package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		
		System.out.print("Olá Mundo!\n");
		
		System.out.printf("Digite seu nome: \n");
		nome = sc.next();
		System.out.print("Digite seu sobrenome: \n");
		sobrenome = sc.next();
		
		System.out.println("Meu nome " + nome + "\t " + sobrenome);
	
	}

};
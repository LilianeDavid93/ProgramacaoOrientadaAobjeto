package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double F;
		double C;
		
		System.out.println("Digite a temperatura em graus celsius a ser convertida para fahrenheit:  \n");
		C = sc.nextDouble();

		F = (C * 1.8) + 32;
		System.out.println(C + "º Celsius é igual a " + F + "º Fahrenheit. \n");

	}

}

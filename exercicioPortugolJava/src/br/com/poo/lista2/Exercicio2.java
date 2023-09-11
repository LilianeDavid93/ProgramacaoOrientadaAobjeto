package br.com.poo.lista2;

import java.util.Scanner;
import java.util.Calendar;


public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();

		int dia;
		int mes;
		int ano;
		int idade;

		System.out.println("Digite seu dia de nascimento: ");
		dia = sc.nextInt();
		System.out.println("Digite o mes de seu nascimento: ");
		mes = sc.nextInt();
		System.out.println("Digite o ano de seu nascimento: ");
		ano = sc.nextInt();

		idade = (c.getWeekYear() - ano);

		if (mes >= Calendar.MONTH) {
			if (dia >= Calendar.DATE) {
				idade = idade - 1;

			}
		}

		System.out.print("Sua idade é: " + idade);
		sc.close();
	}

}

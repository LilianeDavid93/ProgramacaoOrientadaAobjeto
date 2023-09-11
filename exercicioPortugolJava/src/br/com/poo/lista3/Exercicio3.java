package br.com.poo.lista3;

import java.util.Scanner;

public class Exercicio3 {
	Scanner sc = new Scanner(System.in);

	int numeros[];
	int resultado = 0;

	for(
	int contador = 0;contador<numeros;contador++)
	{
		int entrada;
		System.out.println("Digite um número: \n");
		sc.nextInt(entrada);

		if (entrada < 0) {
			System.out.println("Volte ao inicio e digite um valor válido.\n\n");
			contador--;
			return;
		} else {
			numeros[contador] = entrada;
		}
	}

	for(
	int cont = 0;cont<numeros;cont++)
	{
		resultado = resultado + numeros[cont];
	}

	System.out.println("O resultado da soma é: " + resultado);
}
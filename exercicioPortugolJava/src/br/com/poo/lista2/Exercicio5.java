package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio5 {
	Scanner sc = new Scanner(System.in);
	
	
	static double hora = 0.0;
	static double segundo;
	static double resultado;
	


public static void main(String[] args) {

	pergunta(h);
	while(hora <=0){
		hora = hora * (-1);
		System.out.println("Digite um numero de valor positivo.\n");
		
		resultado = hora * 3600;
			
			System.out.println(hora + " hora(s) "+" x  " + 3600 );
			System.out.println(" é: " + resultado + " segundos.\n\n\n");
	}
}

public double pergunta(double h){
	
	System.out.println("\nQual a hora que você deseja converter?\n");
	hora = sc.nextDouble();
	return hora;
}

}


package br.com.poo.sb.testes;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// aplicacao comum : verificar bit
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		int mascara = 32;
		//int mascara = 0b100000;
		int n = sc.nextInt();
		
		if((n & mascara) != 0) {
			System.out.println("6 byte e verdadeiro");
		}else {System.out.println("6 byte e falso");
		}
	}
}

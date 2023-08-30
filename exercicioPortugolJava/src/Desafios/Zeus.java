package Desafios;

import java.util.Scanner;

public class Zeus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.println("Digite um numero: \n");
		n1 = sc.nextInt();
		System.out.println("Digite outro numero: \n");
		n2 = sc.nextInt();
		
		System.out.printf("A soma é: " + (n1 + n2) + "\n");
		System.out.printf("A subtração é: " + (n1 - n2)+  "\n");
		System.out.printf("A multiplicação é: "+ (n1 * n2) + "\n");
			
		if(n1 == 0 || n2 == 0) {
			
			System.out.println("Não é possível fazer esta divisão!");
		}else {System.out.printf("O valor desta divisão é: ", n1 / n2);
				
	}
	}
}

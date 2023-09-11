package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double angulo1;
		double angulo2;
		double angulo3;

		System.out.println("Digite primeiro lado: ");
		angulo1 = sc.nextDouble();
		System.out.println("Digite segundo lado: ");
		angulo2 = sc.nextDouble();
		System.out.println("Digite terceiro lado: ");
		angulo3 = sc.nextDouble();

		if (angulo1 + angulo2 + angulo3 == 180) {
			if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
				System.out.println("Esse é um triângulo Acutângulo");

			} else if (angulo1 > 90 && angulo1 < 180 || angulo2 > 90 && angulo2 < 180
					|| angulo3 > 90 && angulo3 < 180) {
				System.out.println("Esse é um triângulo Obtusângulo ");
			} else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
				System.out.println("Esse é um triângulo Retângulo");
			}
		} else {
			System.out.println("Esse não é um triângulo válido.");

		}
		sc.close();
	}

}

package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double alunosgeral;
		double disciplina1;
		double disciplina2;
		double media;

		System.out.println("Quantos alunos tem na turma? \n");
		alunosgeral = sc.nextDouble();
		System.out.println("Na primeira disciplina temos: \n");
		disciplina1 = sc.nextDouble();
		System.out.println("Na segunda disciplina temos: \n");
		disciplina2 = sc.nextDouble();

		media = disciplina1 * alunosgeral / 100;
		System.out.println("A media de alunos que estudam na madrugada é: \n\n" + media);

		sc.close();
	}
}
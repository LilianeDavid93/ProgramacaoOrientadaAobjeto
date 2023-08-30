
package br.com.poo.lista1;

import java.util.Scanner;

//programa do portugol
public class Exercicio1 {

	//funcao inicio
	// no portugol agora -> metodo no java

	public static void main(String[] args) {
		
		String nome;
		String sobrenome;
		int senha;
		
		//instancia
		Scanner sc = new Scanner(System.in);//Scanner e a biblioteca chamada no inicio
		
		//funcao escreva no portugol
		System.out.println("Por favor digite seu nome: ");//somente o print ele escreve na mesma linha da pergunta
		nome = sc.next();
		//chamando
		//
		limpa();
		System.out.println("Agora informe seu sobrenome: ");
		sobrenome = sc.next();
		limpa();
		
		
		System.out.println("Digite sua senha: ");
		senha = sc.nextInt();
		limpa();
	
		
	
		if(senha == 123) {
			System.out.println("Seja bem vindo " + nome +" "+ sobrenome);
		}else{
			System.out.println("ACESSO NEGADO");
		};
		sc.close();
		
		
	}
	public static void limpa() {
		for(int i=0; i < 2 ; i++) {
			System.out.println();     //pulando linha
			
			
		}
	
	}
	

}

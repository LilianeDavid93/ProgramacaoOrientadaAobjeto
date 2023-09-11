package Desafios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] matriz = new String[][] {
			
			{"Camisa", "10"},{"Calça", "5"},{"Sapatilha", "0"},
        	{"Camiseta", "20"},{"Saia", "12"}, {"Meia", "0"},
        	{"Tenis", "0"}, {"Chinelo", "0"}
	};
	
	//menu
	System.out.println("Bem vindo ao sistema!\n");
	System.out.println("==============MENU==============\n");
	System.out.print("1 - Listar produtos com estoque.\n");
	System.out.print("2 - Listar produtos sem estoque.\n");
	System.out.print("0 - Sair do sistema.\n");
    opcao = sc.nextInt;
   

    while(opcao)
    {
    	case 1:
    		System.out.println("==============Lista de Produtos Com Estoque==============\n")
    		
    		int produtos;
			for(int linha = 0; linha < numero_linhas(produtos); linha++)
    		{
    			int numeroConvertido = cadeia_para_inteiro(produtos[linha][1], 10)
    			if(numeroConvertido > 0)
    			{
    				System.out.print("PRODUTO: " + produtos[linha][0] + " | QUANTIDADE: " + produtos[linha][1] + "\n")
    			}
    		}
    		pare
    	case 2:
			System.out.println("==============Lista de Produtos Sem Estoque==============\n")
    		for(int linha = 0; linha < (produtos); linha++)
    		{
    			int numeroConvertido = (produtos[linha][1], 10)
    			if(numeroConvertido == 0)
    			{
    				escreva("PRODUTO: " + produtos[linha][0] + " | QUANTIDADE: " + produtos[linha][1] + "\n")
    			}
    		}
			break;
    	case 0:
    		System.out.println("==============Saindo do sistema==============\n")
    		System.out.println("Volte sempre...\n")
			break;
    		
    	case contrario:
    		System.out.println("Opção inválida")			
    }

	if(opcao > 0)
	{
		inicio()
	}        	
}


}
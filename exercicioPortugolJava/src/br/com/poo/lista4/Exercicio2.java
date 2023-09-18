package br.com.poo.lista4;

public class Exercicio2 {

	
	int[] numero; 
	int impresso;

	for(int i =0; i <20; i ++)
	{	
		numero[i] = 
	}	
	para(inteiro i = 0; i <20; i++)
	{
		para(inteiro j = i +1; j <20; j++)
		{
			se(numero[i] > numero[j])
			{
				inteiro aux
				aux = numero[i]
				numero[i] = numero[j]
				numero[j] = aux
			}
		}
	}
	escreva("Elementos não repetidos: ")		
	
	para(inteiro i = 0; i <20; i++)
	{
		inteiro contador = 0
		para(inteiro j = 0; j <20; j++)
		{
			se(numero[i] == numero[j])
			{
				contador++
			}
		}

		se(contador == 1)
		{
			escreva(numero[i] + " " )
		}
	}
}
}

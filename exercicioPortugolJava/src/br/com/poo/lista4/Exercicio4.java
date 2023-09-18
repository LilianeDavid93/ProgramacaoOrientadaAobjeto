package br.com.poo.lista4;

public class Exercicio4 {


	inteiro numero[4][4], aux[4]
	
	para(inteiro i = 0; i < 4;  i++)
	{
		para(inteiro j = 0; j < 4; j++)
		{
			numero[i][j] = u.sorteia(0, 20)
		}
	}
	para(inteiro i = 0; i < 4; i++)
	{
		para(inteiro j = 0; j < 4; j++)
		{
			se(i == j)
			{
				aux[i] = numero[i][j]
			}
		}
	}
	escreva("MATRIZ\n")
	para(inteiro i =0; i < 4; i++)
	{
		para(inteiro j = 0; j < 4; j++)
		{
			escreva("[" + numero[i][j] + "]")
		}
		escreva("\n")
	}	

	escreva("VETOR\n")
	para(inteiro i = 0; i <4; i++)
	{
		escreva("[" +aux[i]+ "]")
	}
}

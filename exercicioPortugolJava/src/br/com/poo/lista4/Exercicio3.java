package br.com.poo.lista4;

public class Exercicio3 {
	public static void main(String[] args) {
		
		
		real numero[5]
				inteiro codigo

				para(inteiro i = 0; i <5; i++)
				{
					escreva("Digite um numero real: \n")
					leia(numero[i])
				}
				
				para(inteiro i = 0; i < 5; i++ )
				{	
					para(inteiro l = i + 1; l <5; l++ )
					{
						se(numero[i] > numero[l])
						{
							real aux
							aux = numero[i]
							numero[i] = numero[l]
							numero[l] = aux
						}
					}
				}

				escreva("MENU\n")
				escreva("1 - Imprimir vetor em ordem crescente.\n")
				escreva("2 - Imprimir vetor em ordem decrescente.\n")		
				leia(codigo)

				escolha(codigo)
				{
					caso 1:
						para(inteiro i = 0; i <5; i++)
						{
							escreva(numero[i] + " ")
						}
						pare
					caso 2:
						para(inteiro i = 4; i >= 0; i--)
						{
							escreva(numero[i] + " ")
						}
						pare
					caso contrario:
						escreva("Opcao invalida")
					
				}
				
			}
		
	}
}


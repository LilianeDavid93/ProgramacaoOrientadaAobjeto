package br.com.poo.lista4;

public class Exercicio5 {

	cadeia posicoes[8][10]
			inteiro opcao
			
			funcao inicio()
			{		
				para(inteiro i = 0; i < 8;  i++)
				{
					para(inteiro j = 0; j <10; j++)
					{
						posicoes[i][j] = "LIVRE"
					}
				}
				faca
				{

					escreva("MENU\n")
					escreva("1 - Vender ingresso.\n")
					escreva("2 - Visualizar posicoes.\n")
					escreva("0 - Sair.\n")
					leia(opcao)
					limpa()

					escolha(opcao)
					{
						caso 1:
							venderIngresso()
						pare
						caso 2:
							exibirposicoes()
						pare
						caso 0:
						escreva("Volte Sempre!")
						pare
						caso contrario:
						escreva("Opcao Invalida!")
					}
				}enquanto(opcao != 0)
					
			}
			
			funcao exibirposicoes()
			{
				para(inteiro i = 0; i < 8;  i++)
				{
					para(inteiro j = 0; j <10; j++)
					{
						escreva("[" + posicoes[i][j] + "]")
					}
					escreva("\n")
				}
			}

			funcao venderIngresso()
			{
				cadeia nome
				inteiro fileira, cadeira
				escreva("Fileira: \n")
				leia(fileira)
				escreva("Cadeira: \n")
				leia(cadeira)
				escreva("Nome: \n")
				leia(nome)
				posicoes[fileira][cadeira] = nome
				limpa()
			}
}

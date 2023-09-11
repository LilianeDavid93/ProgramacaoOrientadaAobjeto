package br.com.poo.lista4;

public class Exercicio1 {
	
	public static void main(String[] args) {

	int[] numero = new int[10];
	int impresso = -1;

	for(int i = 0; i < 10; i++);
	{
		numero[i] = (int) Math.random();
	}

	for(int in = 0;i < 10; i++){
		for(int j = i +1; j <10; j++){
			if(numero[i] > numero[j]){
				
				int aux;
				aux = numero[i];
				numero[i] = numero[j];
				numero[j] = aux;
			}
		}
	}

	System.out.println("Os valores que se repetem são: ");

	impresso = 	numero[0]-1;
	
		for(int i = 0;i < 10; i++){
			for(int j = i + 1; j <10; j++){
				if(numero[i] == numero[j] && numero[i] != impresso){
					
					impresso = numero[i];
					System.out.print(numero[i] + " ");
				}
			}
		}
}
}


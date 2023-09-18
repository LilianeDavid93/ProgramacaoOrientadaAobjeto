package br.com.poo.lista3;

import java.util.Random;

public class Exercicio4 {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int aux;
        int contador = 0;

        for (int i = 0; i < 20; i++) {
            numero[i] = new Random().nextInt();

            if (numero[i] % 2 == 0) {
                contador++;
            }
        }
        
        System.out.printf("Neste array, possuímos " + contador + " números pares.");
    }
}


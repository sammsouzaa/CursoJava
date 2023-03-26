package conceitosBasicos.vetores;

import java.util.Arrays;

//import java.util.Scanner;

public class metodosdosarray{
    public static void main(String [] args){

        final int tam = 10;
        int[] num = {9, 2, 7, 1, 8, 5, 3, 4, 0, 6};
        int[] numeros = new int[tam];
        int p = 3;
        int pos;
        
        Arrays.sort(num); // ordena/organiza os numeros de uma array(crescente).

        Arrays.fill(numeros, 10); //Preenche o Array com numeros especificos.

        System.arraycopy(num, 0, numeros, 0, tam); //Copia os elementos de uma array para outra array.
        //Dentro do copy: (origem, a partir da posição 0, destino, a partir da posição 0, numero de elementos que serão copiado).

        Arrays.equals(num, numeros); //Compara um array com outro e retorna um "boolean" se forem iguais retorna true, se forem diferentes retorna false/null.
        System.out.printf("Os arrays são iguais? %s ", Arrays.equals(num, numeros) ? "Sim" : "Não" );

        pos = Arrays.binarySearch(numeros, p); //verifica se o elemento p esta no array, e retorna um inteiro, se estiver no array retorna a posição, se nao retorna um numero<0;
        //CONDIÇÃO: Para o binarysearch dar certo, antes precisamos ordenar nosso array;
        System.out.printf("O elemento %d? esta no array? %s na posição %d", p , pos > 0 ? "Esta no array" : "Não esta no array", pos );


        //"FOR" especifico para ler os elementos de um array;
        for(int n:numeros){

            System.out.printf("%d - ", n);
        }

    }
}
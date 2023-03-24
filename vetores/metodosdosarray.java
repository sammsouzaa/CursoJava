package vetores;

import java.util.Arrays;

//import java.util.Scanner;

public class metodosdosarray{
    public static void main(String [] args){

        final int tam = 10;
        int[] num = {9, 2, 7, 1, 8, 5, 3, 4, 0, 6};
        int[] numeros = new int[tam];

        
        Arrays.sort(num); // ordena/organiza os numeros de uma array(crescente)
        Arrays.fill(numeros, 10); //Preenche o Array com numeros especificos

        for(int n:numeros){

            System.out.printf("%d - ", n);
        }

    }
}
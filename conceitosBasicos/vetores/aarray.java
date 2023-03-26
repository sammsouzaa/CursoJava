package conceitosBasicos.vetores;

import java.util.Scanner;

public class aarray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int tam = 5;
        char[] gabarito = {'a','a','d','b','c'};
        char[] respostas = new char[tam];
        int nota=0;

        for(int i=0; i<tam; i++){
            System.out.printf("Informe a %d respota: %n",i+1);
            respostas[i] = entrada.nextLine().charAt(0);
        }

        for(int i=0; i<tam; i++){
            if (respostas[i] == gabarito[i]){
                nota++;
            }
        }

        System.out.printf("%nNota do aluno: %d %n",nota);

    }
}

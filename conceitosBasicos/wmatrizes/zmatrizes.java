package conceitosBasicos.wmatrizes;
import java.security.SecureRandom;

public class zmatrizes {
    public static void main (String[] args){

        final int linhas = 3;
        final int colunas = 5;

        //Criando uma matriz para declarar os valores depois;
        int [] [] numeros = new int [linhas][colunas];

        //Criando uma matriz ja com os valores declarados;
        int [] [] num = {{10, 20, 30, 40, 50}, {1, 2, 3, 4, 5}, {100, 200, 300, 400, 500}};

        //FOR para declarar os valores da matriz numeros;
        for (int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                numeros[l][c]=new SecureRandom().nextInt(100);
            }
        }

        //FOR para ler todos as variaveis dentro da matriz.
        /*
        for (int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                System.out.printf("%2d | ", numeros[l][c]);
            }
            System.out.printf("%n");
        }
        */

        //Imprimindo a matriz "numeros"
        for (int[]n:numeros){
            for(int v:n){
                System.out.printf("%2d | ", v);
            }
            System.out.printf("%n");
        }

        //Um print para pular uma linha na saida
        System.out.printf("%n");

        //Imprimindo a matriz "num"
        for (int[]n:num){
            for(int v:n){
                System.out.printf("%3d | ", v);
            }
            System.out.printf("%n");
        }
    }
}

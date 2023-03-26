package metodos;

import java.util.Scanner;
//Criamos uma classe
public class metodoss{

    //Para criar um metodo é necessario seguir a seguinte estrutura:
    //(modificador de acesso) (tipo de retorno) (o nome) (o conjunto de parametros do metodo)
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        int n1 = entrada.nextInt();

        System.out.println("Digite o valor 2: ");
        int n2 = entrada.nextInt();

        int r = soma(n1, n2);

        msg(r, n1, n2);
    }
    public static int soma(int n1, int n2){
        int res = n1 + n2;
        return res;
    }
    public static void msg(int r, int n1, int n2){

        System.out.printf("%n %d + %d = %d", n1, n2, r);
        
    }
}
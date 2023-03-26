package conceitosBasicos.entradadedados;

//Primeiramente importamos o "Scanner" da classe Java.util
import java.util.Scanner;

public class asomaSimples {
    public static void main(String[] args) {

        //criamos uma variavel "Entrada" do tipo Scanner
        Scanner entrada = new Scanner(System.in);

        /*criamos 3 variaveis do tipo Inteiro
        e damos os respectivos valores a elas
        */

        int n1 = 0, n2 = 0, res = 0;

        //Criamos um Println simples somente para fazer a pergunta
        System.out.println("Digite um numeral: ");
        /*
         Aqui indicamos que a variavel n1 irá receber o valor digitado
         pelo teclado do usuario
         */
        n1 = entrada.nextInt();

        //Novamente criamos outro println pra pedir outro numero ao usuario
        System.out.println("Digite outro numeral: ");
        //E indicamos que o n2 recebera outro valor digitado pelo usuario
        n2 = entrada.nextInt();

        //aqui fazemos o calculo basico dos dois numeros digitados acima
        res = n1 + n2;
        //e fazemos um print do valor da soma.
        System.out.printf("Soma de %d e de valor %d é: %d", n1, n2, res);
        System.out.print("\nFim do programinha");

    }
}

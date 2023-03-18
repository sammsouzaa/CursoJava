package EntradaDosDados;

import java.util.Scanner;

public class somaSimples {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1 = 0, n2 = 0, res = 0;

        System.out.println("Digite um numeral: ");
        n1 = entrada.nextInt();

        System.out.println("Digite outro numeral: ");
        n2 = entrada.nextInt();

        res = n1 + n2;
        System.out.println(res);

        System.out.printf("Soma de %d e de valor %d é: %d", n1, n2, res);

    }
}

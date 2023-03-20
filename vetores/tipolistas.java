package vetores;

import java.util.Scanner;

public class tipolistas {

    public static void main(String[] args) {

        int num[] = new int[2];
        Scanner entrada = new Scanner(System.in);
        /*
         * while (i >= 5) {
         * 
         * System.out.printf("Digite o %d numero: ", i + 1);
         * num[i] = entrada.nextInt();
         * i++;
         * }
         */
        System.out.printf("Digite o %d° numero: ", 1);
        num[0] = entrada.nextInt();
        System.out.printf("Digite o %d° numero: ", 2);
        num[1] = entrada.nextInt();
        System.out.printf("Digite o %d° numero: ", 3);
        num[2] = entrada.nextInt();
        System.out.printf("Digite o %d° numero: ", 4);

        System.out.println(num);
        System.out.println("Fim do programinha");
        
    }
}

package conceitosBasicos.entradadedados;

import java.util.Scanner;

public class mediaaluno {
    public static void main(String[] args) {

        int n1 = 0, n2 = 0, n3=0, n4=0, mediadoaluno = 0;
        final int MEDIA = 60;
        String nome = "", status = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = entrada.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextInt();

        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextInt();

        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextInt();

        System.out.println("Digite a quarta nota: ");
        n4 = entrada.nextInt();

        mediadoaluno = (n1 + n2 + n3 + n4) / 4;

        if (mediadoaluno >= MEDIA){
            status = "Aprovado";
        }
        else if (mediadoaluno >= 40){
            status = "De recuperação";
        }
        else{
            status = "Reprovado";
        }
        System.out.printf("O aluno %s foi %s com a nota %d", nome, status, mediadoaluno);

        System.out.print("\nFim do programinha");

    }
}

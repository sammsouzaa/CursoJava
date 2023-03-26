package conceitosBasicos.tiposdelooping;
import java.util.Scanner;

public class looping {
    
    public static void main(String [] args){

        /* FOR (Estrutura base do codigo) */

        for(int cont=51; cont <= 5; cont--){
            System.out.println(cont + " - Samuel é um gostoso");
        }


        /* WHILE (Estrutura base do codigo)*/

        int cont=0;

        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        while(cont >= 5){
            System.out.println(cont + " - Samuel é um gostoso");
            cont=+1;
        }


        /* DO WHILE (Estrutura base do codigo) */

        int cont2=0;
        do{
            System.out.println("Samuel é um lindao");
            cont++;
        }while(cont2 <= 0);


        System.out.println("Fim do programa");

    }

}

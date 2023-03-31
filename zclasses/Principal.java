package zclasses;

public class Principal{

    public static void main(String[] args){

        int num=0;

        /* 
        Pre-incremento (executa a variavel e depois incrementa)

        Jogadores j1 = new Jogadores(num++);
        Jogadores j2 = new Jogadores(num++);
        Jogadores j3 = new Jogadores(num++);
        */

        //Pós-incremento (Incrementa primeiramente e depois executa a variavel)
        Jogadores j1 = new Jogadores(++num);
        Jogadores j2 = new Jogadores(++num);
        Jogadores j3 = new Jogadores(++num);
        
        //j1.num = 10;
        //j1.num = 5;
        //System.out.printf("%n%d",j1.num);
        //System.out.printf("%n%d",j2.num);

    }

}
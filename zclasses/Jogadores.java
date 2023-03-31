package zclasses;

//Quando criamos um metodo construtor, ele é executado automaticamente quando instanciamos ele como um novo objeto na classe main.

public class Jogadores{

    int num=0;

    public Jogadores(int num){ //Metodo construtor, é declarado com o mesmo nome da classe

        this.num = num;

        System.out.printf("Jogador numero %d Criado%n", num);
    }
}
package zclasses;

//Quando criamos um metodo construtor, ele é executado automaticamente quando instanciamos ele como um novo objeto na classe main.

public class Jogadores{
    public Jogadores(int n){ //Metodo construtor, é declarado com o mesmo nome da classe

        System.out.printf("%nJogador numero %d Criado%n", n);
    }
}
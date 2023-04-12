package zclasses;

//Quando criamos um metodo construtor, ele é executado automaticamente quando instanciamos ele como um novo objeto na classe main.

public class Jogadores{

    private final int maxvidas=3;
    private int num=0;
    private int vidas=0;

    public Jogadores(int num){ //Metodo construtor, é declarado com o mesmo nome da classe

        this.num = num;
        this.vidas = 1;
        System.out.printf("Jogador numero %d Criado%n", num);
    }

    //metodo do tipo "GET" que tem como objetivo mostrar algum valor de uma variavel do tipo private
    public int getVidas(){

        return this.vidas;
    }

    //metodo do tipo "SET" que tem como objetivo dar um valor a uma variavel do tipo private
    private void setVidas(int vidas){

        if (vidas > maxvidas){

            this.vidas = maxvidas;
        }
        else if(vidas<0){

            this.vidas = 0;
        }
        else{

            this.vidas = vidas;
        }
    }
    //metodo do tipo "SET" que tem como objetivo dar um valor a uma variavel do tipo private
    public void addVidas(){
        
        if(this.vidas < maxvidas){
            this.vidas++;
        }
    }
}
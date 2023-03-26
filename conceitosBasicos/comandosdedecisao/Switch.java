package conceitosBasicos.comandosdedecisao;

//Primeiramente iniciamos a class publica do programa
public class Switch {

    //Criamos o publicstatic void, que sera o primeiro metodo que iniciara nosso programa
    //O static indica que não precisaremos criar um objeto pra ligar a classe, que ele sera ativada automaticamente.
    public static void main(String[] args){

        //Hipoteticamente criamos uma situação de corrida com corredores

        //Criamos uma variavel int e damos um valor a ela
        int pos = 3;

        //corredor ficou na posição 1

        //vamos criar casos possiveis para essa variavel

        switch(pos){
            //iniciamos as comparaçôes

            //caso corredor ficou posição 1
            case 1:
                //Faça isso
                System.out.println("Primeiro Lugar");
                break; //Pare

            //caso corredor ficou posição 2
            case 2:
                //Faça isso
                System.out.println("Segundo Lugar");
                break; //Pare

            //Caso corredor ficou posição 3
            case 3:
                //Faça isso
                System.out.println("Terceiro Lugar");
                break; //Pare
            
            //Caso o corredor ficou na posição 4, 5 ou 6
            case 4: case 5: case 6:
                //Faça isso
                System.out.println("Premio de participação");
                break; //Pare

            //Caso todas as comparações acima derem "False"
            //criamos uma condição "padrao" se não for nenhum dos casos acima
            //Qualquer valor que não for "1, 2 ou 3", entrara no default

            default:
                //Faça isso
                System.out.println("Não ganhou premio");
                break; //Pare
        }
        //Print para indicar "fim do codigo"
        System.out.println("Fim do codigo");

        //FIM
    }
}

package conceitosBasicos.comandosdedecisao;

//Primeiramente iniciamos a class publica do programa
public class IFeELSE {

    //Criamos o publicstatic void, que sera o primeiro metodo que iniciara nosso programa
    //O static indica que não precisaremos criar um objeto pra ligar a classe, que ele sera ativada automaticamente.

    public static void main(String[] args) {

        //Criamos a variavel 'int' e damos um valor a ela

        int nota = 80;
        int media = 60;
        int faltas = 20, maxfaltas = 50;

        //Criamos a variavel 'string' e damos um valor a ela

        String aluno = "Samuel";

        //Fazemos um IF e Else basico para comparação
        /*
         Primeiro fazemos a comparação "SE" entre parenteses
         Depois dentro das Chaves, dizemos o que ela devera fazer se a comparação indicar "True"
        */
        if ((nota >= media) && (faltas <= maxfaltas)) {
            //Aqui simplesmente fazemos um Print fomatado
            System.out.printf("O aluno: %s %nEsta aprovado!!", aluno);
        }
        //Fazemos outra comparação "SE NAO SE"
        else if((nota >= 40) && (faltas <= maxfaltas)){
            //Outro print formatado simples
            System.out.printf("\nO aluno: %s %nEsta de Recuperação!!", aluno);
        }
        //Aqui fazemos apenas um "SE NAO" pra caso todas as comparações acima derem "False"
        else {
            //Outro print formatado simples
            System.out.printf("\nO aluno %s foi Reprovado ", aluno);
        }

        //Ultimo print indicando fim do programa
        System.out.println("\nFim do Programa!!");

        //FIM
        
    }
}

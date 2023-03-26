package conceitosBasicos.comandosdedecisao;

//Primeiramente iniciamos a class publica do programa
public class OperaçãoTernaria {

    // Criamos o publicstatic void, que sera o primeiro metodo que iniciara nosso
    // programa
    // O static indica que não precisaremos criar um objeto pra ligar a classe, que
    // ele sera ativada automaticamente.

    public static void main(String[] args) {

        // Criamos a variavel e damos um valor a ela

        int nota = 80;
        int media = 60;

        // Criamos a variavel "res", como inteiro
        int res;

        // Aqui começamos a estrutura da Operação Ternaria

        /*
         * -Ele cria uma comparação dentro do res (nota >= Media)
         * -O character "?" cria o fator comparação
         * -Logo após ele diz o que deve fazer caso der "True" e depois o "False"
         * -Caso seja 'true' recebe 1 e se der 'false' recebe 0
         */

        res = (nota >= media ? 1 : 0);

        /*
         * -Aqui damos um Println e fazemos outra comparação
         * -Comparamos "res == 1"
         * -Caso der 'True' recebe 'aprovado', se der "False" recebe 'reprovado'
         */

        System.out.println("Resultado: " + (res == 1 ? "Aprovado" : "Reprovado"));

        // Fazemos um Print padrao só para aparecer "fim do programa"

        System.out.println("Fim do programa!!");

        // FIM

    }
}
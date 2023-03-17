public class codiguin {
    public static void main(String[] args) {

        int nota = 80;
        int media = 60;

        
        //OPERAÇAO TERNARIA

        String  res;
        
        res = (nota >= media ? "Aprovado" : "Reprovado");

        System.out.println("Resultado: " + res);

        // ESTRUTURA IF E ELSE EM JAVA

        int faltas = 20, maxfaltas = 50;

        String aluno = "Samuel";

        if ((nota >= media) && (faltas <= maxfaltas)) {
            System.out.printf("O aluno: %s %nEsta aprovado!!", aluno);
        } 
        else if((nota >= 40) && (faltas <= maxfaltas)){
            System.out.printf("\nO aluno: %s %nEsta de Recuperação!!", aluno);
        }
        else {
            System.out.printf("\nO aluno %s foi Reprovado ", aluno);
        }

        System.out.println("\nFim do Programa!!");

    }
}
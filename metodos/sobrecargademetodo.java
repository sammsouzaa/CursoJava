package metodos;

public class sobrecargademetodo {

    public static void main(String[] args) {

        msg("Bom diaaaa");
        System.out.printf("%nSoma: %d", soma(10, 2, 3));
        System.out.printf("%nSoma: %d", soma2(10, 20));
        
    }

    /*
     * Sobrecarga de metodos: quando criamos dois metodos iguais(com o mesmo onome)
     * porém com argumentos de entrada diferntes:
     */

    // EXEMPLO:
    // Primeiro metodo para somar numeros inteiros;

    public static int soma(int... numeros) { // Estrutura de for para somar usando array, ou seja:
        int res = 0; // quando nn temos definido o numero de valores recebidos;
        for (int n:numeros) {
            res+=n;
        }
        return res;
    }

    // Segundo metodo com o mesmo nome para somar numeros float;
    public static double soma(double... numeros) {
        double res = 0;
        for (double n : numeros) {
            res = +n;
        }
        return res;
    }

    public static int soma2(int n1, int n2) { // Metodo padrao para somar 2 numeros;
        int res = n1 + n2;
        return res;
    }

    public static void msg(String alguma) {

        System.out.printf(alguma);

    }
}
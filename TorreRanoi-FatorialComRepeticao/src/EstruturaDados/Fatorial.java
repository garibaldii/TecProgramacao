package EstruturaDados;
// Exercicio 1: Crie um novo projeto Java com o nome Estrutura de Dados e crie uma classe chamada Fatorial. Dentro dessa classe, implemente dois métodos para calcular o valor do fatorial de um dado número e retorne o valor calculado. O primeiro deverá ser recursivo e o segundo interativo.

public class Fatorial {

    public int recursaoFatorial(int n) {
        if (n == 0) {
            return 1;
        }

        else {
            return n * recursaoFatorial(n - 1);
        }
    }

    public int whileFatorial(int n) {

        int contador = n;

        while (contador != 1) {

            contador--;

            n = n * contador;

        }

        return n;
    }

    public int forFatorial(int n) {

        int contador = n - 1;
        
        for (int i = 1; i != contador; contador --) {
        
            n = n * contador;

        }

        return n;
    }



 

    public static void main(String[] args) {
        Fatorial calculo = new Fatorial();
        System.out.println(calculo.recursaoFatorial(9));
        System.out.println(calculo.whileFatorial(9));
        System.out.println(calculo.forFatorial(9));

        TorreHanoi torreDeHanoi = new TorreHanoi();

    }
}

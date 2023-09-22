package EstruturaDados;
// Exercicio 2: Crie uma nova classe chamada TorreHanoi e implemente um método que imprima no console os passos para resolver o problema da Torre de Hanoi, dado um numero de discos definido pelo usuário. 

public class TorreHanoi {

    public static void mover(int O, int D) {
        System.out.println(O + " -> " + D);
    }

    // Método que implementa a recursão
    // O = pino origem
    // D = pino destino
    // T = pino de trabalho
    
    static void hanoi(int n, int O, int D, int T) {

        if (n > 0) {
            hanoi(n - 1, O, T, D);
            mover(O, D);
            hanoi(n - 1, T, D, O);
        }

    }

}

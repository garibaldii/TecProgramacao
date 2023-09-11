
public class Vetores {

    public int vetorDecimal[];
    public int[] vetorBinario = new int[8];
    public int[][] matrizBinario = new int[8][8];

    public int[] exercicio1A(int[] vetoBinario) {

        for (int i = 0; i < vetorBinario.length; i++) {

            vetorDecimal[i] = vetorBinario[i] * (int) Math.pow(2, i);

        }

        return vetorDecimal;
    }

    public int[][] exercicio1B(int[][] matrizBinario) {
        int[][] matrizDecimal = new int[8][8];

        for (int linha = 0; linha < matrizBinario.length; linha++) {
            for (int coluna = 0; coluna < matrizBinario[linha].length; coluna++) {
                matrizDecimal[linha][coluna] = matrizBinario[linha][coluna] * (int) Math.pow(2, coluna);
            }
        }

        return matrizDecimal;
    }

    public static void exercicioC(int[] vetorDecimal, int[] vetorBinario, int[][] matrizBinario) {
        System.out.print("POT|");
        for (int valor : vetorDecimal) {
            System.out.print(valor + "|");
        }
        System.out.println();

        System.out.print("BIN|");
        for (int valor : vetorBinario) {
            System.out.print(valor + "|");
        }
        System.out.println();

        System.out.print("DEC|");
        for (int[] linha : matrizBinario) {
            int soma = 0;
            for (int i = 0; i < linha.length; i++) {
                System.out.print(linha[i] + "|");
                soma += linha[i] * (int) Math.pow(2, i);
            }
            System.out.println(" = " + soma);
        }
    }
}




package Principal;
import java.lang.Math;

public class Calculadora {

    private double valorA, valorB, resultado;

    private String resultadoMsg, operador;

    public void soma(double valorA, double valorB) {
        this.operador = "+";

        this.valorA = valorA;

        this.valorB = valorB;

        this.resultado = (valorA + valorB);

    }

    public void sub(double valorA, double valorB) {
        this.operador = "-";

        this.valorA = valorA;

        this.valorB = valorB;

        this.resultado = (valorA - valorB);

    }

    public void mult(double valorA, double valorB) {
        this.operador = "*";

        this.valorA = valorA;

        this.valorB = valorB;

        this.resultado = (valorA * valorB);

    }

    public void div(double valorA, double valorB) {

        if (valorB != 0) {
            this.operador = "/";

            this.valorA = valorA;

            this.valorB = valorB;

            this.resultado = (valorA / valorB);

        } else {
            System.out.println("Insira um divisor válido");
        }

    }

    public String getResultadoString() {

        if (operador == null) {

            if (valorB == 0) { 
                // uma forma de separar a exibição do resultado dos dois métodos.
                // para método decimal PARA binário, usa-se o valorA como referência
                // e o contrário também acontece em binário PARA decimal. 
               resultadoMsg = valorA + " em decimal é igual a " + resultado + " em binário";
            }
            else{
                resultadoMsg = valorB + " em binário é igual a " + resultado + " em decimal";
            }
        }

        else {
            // nesse caso, só irá exibir esse formato se o método requisitado por um usuário tiver uma operacao
            // matemática direta. 
           resultadoMsg = valorA + " " + operador + " " + valorB + " = " + resultado;
        }
        return resultadoMsg;
    }

    public double convertDecToBin(int decimal) {
        operador = null;
        valorB = 0;
        this.valorA = decimal;
        double resultadoBinario = 0;// inicializei a variável para poder somar na linha 81
        double resto;
        double posicao = 1;
        while (decimal > 0) {
            resto = decimal % 2;
            decimal = decimal / 2;
            resultadoBinario += resto * posicao;
            posicao *= 10; // aqui vai fazer a multiplicacao para posicionar os números binários com suas
                           // respectivas casas.
                           // toda vez que o resto for igual a 0, o binário vai manter seu valor, se não,
                           // ele irá ser multiplicado pela próxima casa
                           // do algarismo posicao, por exemplo se o resto for igual a 1 e a posicao já
            // estiver na terceira leva (1000), o resto será dado
            // por 1 + (1 * 1000) =1001 e assim sucessivamente para os próximos valores do
            // resto.

        }
        resultado = resultadoBinario;
        return resultadoBinario;

    }

    public double getResultadoValor() {
        return resultado;
    }

    public int convertBinToDec(String binario) {
        operador = null;
        int decimal = 0;
        valorB = Double.parseDouble(binario);

        for (int i = binario.length() - 1; i >= 0; i--) {

            char digito = binario.charAt(i);

            switch (digito) {
                case '0':
                    // Se for '0', não fazemos nada, pois o valor já é 0.
                    break;

                case '1':
                    // Se for '1', adicionamos 2 elevado à posição atual à soma.
                    decimal = (int) (decimal + Math.pow(2, binario.length() - 1 - i));
                    break;

            }
        }
        resultado = decimal;
        return decimal;
    }

    public static void main(String[] args) throws Exception {
        Calculadora conta = new Calculadora();

        conta.convertBinToDec("1010101");
        System.out.println(conta.getResultadoString());
        conta.convertDecToBin(85);
        System.out.println(conta.getResultadoString());

    }
}

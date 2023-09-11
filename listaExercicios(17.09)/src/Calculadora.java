import java.lang.Math;

public class Calculadora {

    private double valorA, valorB, resultado;

    private String resultadoMsg, operador;

    public void soma(double valorA, double valorB) {
        this.operador = "+";

        this.valorA = valorA;

        this.valorB = valorB;

        this.resultado = (valorA + valorB);

        System.out.println(this.resultado);
    }

    public void sub(double valorA, double valorB) {
        this.operador = "-";

        this.valorA = valorA;

        this.valorB = valorB;

        this.resultado = (valorA - valorB);

        System.out.println(this.resultado);
    }

    public void mult(double valorA, double valorB) {
        this.operador = "*";

        this.valorA = valorA;

        this.valorB = valorB;

        this.resultado = (valorA * valorB);

        System.out.println(this.resultado);
    }

    public void div(double valorA, double valorB) {

        if (valorB != 0) {
            this.operador = "/";

            this.valorA = valorA;

            this.valorB = valorB;

            this.resultado = (valorA / valorB);
            System.out.println(this.resultado);

        } else {
            System.out.println("Insira um divisor válido");
        }

    }

    public String getResultadoString() {

        this.resultadoMsg = this.valorA + " " + this.operador + " " + this.valorB + " = " + this.resultado;

        return this.resultadoMsg;
    }

    public double getResultadoValor() {
        return this.resultado;
    }

    public int convertDecToBin(int decimal) {
        int resto;
        int binario = 0;//inicializei a variável para poder somar na linha 81
        int posicao = 1;
        while (decimal > 0) {
            resto = decimal % 2;
            decimal = decimal / 2;
            binario += resto * posicao;
            posicao *= 10; //aqui vai fazer a multiplicacao para posicionar os números binários com suas respectivas casas.
            //toda vez que o resto for igual a 0, o binário vai manter seu valor, se não, ele irá ser multiplicado pela próxima casa
            // do algarismo posicao, por exemplo se o resto for igual a 1 e a posicao já estiver na terceira leva (1000), o resto será dado
            //por 1 + (1 * 1000) =1001 e assim sucessivamente para os próximos valores do resto. 

        }
        return binario;
        
    }

    public int convertBinToDec(String binario) {
        int decimal = 0;
    
        for (int i = 0; i < binario.length(); i++) {

            char digito = binario.charAt(i);
    
            switch (digito) {
                case '0':
                    // Se for '0', não fazemos nada, pois o valor já é 0.
                    break;
    
                case '1':
                    // Se for '1', adicionamos 2 elevado à posição atual à soma.
                    decimal = (int) (decimal + Math.pow(2, i));
                    break;
    
            }
        }
    
        return decimal;
    }
    



    public static void main(String[] args) throws Exception {
        Calculadora conta = new Calculadora();

        // conta.soma(5, 5);
        // conta.sub(5, 5);
        // conta.mult(5, 5);
        // conta.div(5, 5);
        // System.out.println(conta.getResultadoValor());
        // System.out.println(conta.getResultadoString());
        // System.out.println(9 / 2);
        // System.out.println(9 % 2);
        System.out.println(conta.convertDecToBin(9));
        System.out.println(conta.convertBinToDec("1001"));
        

    }
}

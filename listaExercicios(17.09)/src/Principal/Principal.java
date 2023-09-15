package Principal;
import Calculadora.Calculadora;
import Retângulo.FormasGeometricas;
import Retângulo.Retangulo;
import Triângulo.Triangulo;

public class Principal {

    public static void main(String[] args) {
        // ### Classe Calculadora ### //

        Calculadora calculadora = new Calculadora();
        calculadora.soma(5, 5);
        System.out.println(calculadora.getResultadoString());
        
        calculadora.convertBinToDec("1001");
        System.out.println(calculadora.getResultadoString());

        calculadora.convertDecToBin(9);
        System.out.println(calculadora.getResultadoString());
        // ### //

        // ### Classe Retângulo ### //
        Retangulo retangulo = new Retangulo(40, FormasGeometricas.RETANGULO, 30);
        retangulo.calculaArea();
        retangulo.calculaPerimetro();
        System.out.println(retangulo.getResultadoString());

        Retangulo quadrado = new Retangulo(40, FormasGeometricas.QUADRADO);
        quadrado.calculaArea();
        quadrado.calculaPerimetro();
        System.out.println(quadrado.getResultadoString());
        // ### //

        // Classe Triângulo //
        Triangulo triangulo_retangulo = new Triangulo(30, 5);
        triangulo_retangulo.calculaArea();
        triangulo_retangulo.calculaPerimetro();
        System.out.println(triangulo_retangulo.getResultadoString());

        Triangulo triangulo_obtuso = new Triangulo(20, 30, 95);
        triangulo_obtuso.calculaArea();
        triangulo_obtuso.calculaPerimetro();
        System.out.println(triangulo_obtuso.getResultadoString());

        Triangulo triangulo_agudo = new Triangulo(20,30,30);
        triangulo_agudo.calculaArea();
        triangulo_agudo.calculaPerimetro();
        System.out.println(triangulo_agudo.getResultadoString());
    }
}
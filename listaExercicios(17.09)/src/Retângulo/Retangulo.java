package Retângulo;

public class Retangulo {
    private double lado, area, perimetro, altura;
    private FormasGeometricas tipo;

    public Retangulo(double lado, FormasGeometricas tipo) { // construtor para quadrado
        this.lado = lado;
        this.tipo = FormasGeometricas.QUADRADO;
    }

    public Retangulo(double lado,  FormasGeometricas tipo, double altura) { // construtor para retângulo
        this.lado = lado;
        this.tipo = FormasGeometricas.RETANGULO;
        this.altura = altura;

    }

    public double calculaArea() {
        if (tipo.toString().equals("QUADRADO") ) {
            area = Math.pow(lado, 2);
            return area;
        }
        area = lado * altura;
        return area;
    }

    public double calculaPerimetro() {
        if (tipo.toString().equals("QUADRADO")) {
            perimetro = 4 * lado;
            return perimetro;
        }
        perimetro = 2 * (lado + altura);
        return perimetro;
    }

    // MÉTODOS GETTERS //
    public double getLado() {
        return lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public String getResultadoString() {
        if (tipo.toString().equals("QUADRADO")) {
            return "Quadrado com " + lado + " de lado, perímetro de " + perimetro + " e área de " + area;
        } 
        else {
            return "Retângulo com " + altura + " por " + lado + " de lado, perímetro de " + perimetro + " e área de "
                    + area;
        }
    }
    // ### //

    // MÉTODOS SETTERS //
    public void setLado(double lado) {
        this.lado = lado;
    }
    // ### //

}
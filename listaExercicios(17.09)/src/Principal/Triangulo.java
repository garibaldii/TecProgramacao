package Principal;

enum tipoTriangulo {
    TRIANGULO_RETANGULO, // angulo = 90;
    TRIANGULO_OBTUSANGULO, // angulo > 90;
    TRIANGULO_ACUTANGULO // angulo < 90;
}

public class Triangulo {
    private double  segmentoAB, segmentoBC, angulo, area, perimetro;

    public Triangulo(double segmentoAB, double segmentoBC) {
        this.segmentoAB = segmentoAB;
        this.segmentoBC = segmentoBC;  
        this.angulo = 90;
    };

    public Triangulo(double segmentoAB, double segmentoBC, double angulo) {
        this(segmentoAB, segmentoBC);
        this.angulo = angulo;
    }

    public String getResultadoString() {
        if (angulo == 90) {
            return "a área do " + tipoTriangulo.TRIANGULO_RETANGULO.toString() + " de base " + segmentoAB + " e altura " + segmentoBC + " é de " + area + ", e perímetro de " + perimetro;
        } 
        else if (angulo > 90) {
            return "a área do " + tipoTriangulo.TRIANGULO_OBTUSANGULO.toString() + " com lado A = " + segmentoAB + " e lado B = " + segmentoBC + " e ângulo AB = " + angulo + " é de " + area + ", e perímetro de " + perimetro;
        }
         return "a área do " + tipoTriangulo.TRIANGULO_ACUTANGULO.toString() + " com lado A = " + segmentoAB + " e lado B = " + segmentoBC + " e ângulo AB = " + angulo + " é de " + area + ", e perímetro de " + perimetro;

    }

    public double calculaArea(){
        double angulo_randianos = Math.toRadians(angulo);
        
        // seno = cateto oposto / hipotenusa
        area = (segmentoAB * segmentoBC * (Math.sin(angulo_randianos))) / 2;

        return area;
    }

    public double calculaPerimetro(){
        double hipotenusa = Math.sqrt (Math.pow(segmentoAB, 2) + Math.pow(segmentoBC, 2));
        perimetro = hipotenusa + segmentoAB + segmentoBC;
        return perimetro;
    }

    public static void main(String[] args) {
        Triangulo triangulo_retangulo = new Triangulo(10, 10, 30);

        System.out.println(triangulo_retangulo.calculaArea());
        System.out.println(triangulo_retangulo.calculaPerimetro());
    }

}

package polimorfismo.clases;

public class Circulo implements  AreaPerimetro{


    public double calcularArea(double... valores) {
        return Math.PI*valores[0]*valores[0];
    }


    public double calcularPerimetro(double... valores) {
        return 2*Math.PI*valores[0];
    }

}

package polimorfismo.clases;

public class Cuadrado implements  AreaPerimetro{


    public double calcularArea(double... valores) {
        return valores[0]*valores[0];
    }


    public double calcularPerimetro(double... valores) {
        return valores[0]*4;
    }
}

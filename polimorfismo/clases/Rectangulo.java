package polimorfismo.clases;


public class Rectangulo implements  AreaPerimetro{


    public double calcularArea(double... valores) {
        return valores[0] * valores[1];
    }


    public double calcularPerimetro(double... valores) {
        return 2*(valores[0]+valores[1]);
    }
}

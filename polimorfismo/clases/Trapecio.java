package polimorfismo.clases;

public class Trapecio implements AreaPerimetro{

    public double calcularArea(double... valores) {
        return (((valores[0]+valores[1])*valores[2])/2);
    }


    public double calcularPerimetro(double... valores) {
        return (valores[0]+valores[1])+(2*valores[2]);
    }
}

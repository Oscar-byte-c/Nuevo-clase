package polimorfismo.test;

import polimorfismo.clases.*;

public class TestFiguras {
    public static void main(String[] args) {
        double x=4.8712356;
        AreaPerimetro cuadrado= new Cuadrado();
        AreaPerimetro rectangulo = new Rectangulo();
        AreaPerimetro circulo = new Circulo();
        AreaPerimetro trapecio=new Trapecio();
        System.out.println("Area del Cuadrado: "+cuadrado.calcularArea(10)+" "+"Perimetro del Cuadrado: "+cuadrado.calcularPerimetro(10));
        System.out.println("-------------------------------------------------------------");
        System.out.println("Area del Rectangulo: "+rectangulo.calcularArea(10,50)+" "+"Perimetro del Rectangulo: "+rectangulo.calcularPerimetro(10,50));
        System.out.println("-------------------------------------------------------------");
        System.out.println("Area del Circulo: "+circulo.calcularArea(4)+"Perimetro del Circulo: "+" "+circulo.calcularPerimetro(4));
        System.out.println("-------------------------------------------------------------");
        System.out.println("Area del Trapecio: "+trapecio.calcularArea(1.5,2.5,5)+" "+"Perimetro del Trapecio:  "+trapecio.calcularPerimetro(2.5,1.5,5));
        System.out.println("-------------------------------------------------------------");
        //Redondear Decimales
        String xs = String.format("%.2f",x);
        xs = xs.replace(",",".");
        double y=Double.parseDouble(xs);
        System.out.println(y);
        System.out.println(xs);
    }
}

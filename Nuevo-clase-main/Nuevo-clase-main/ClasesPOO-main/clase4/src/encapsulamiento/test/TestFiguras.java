package encapsulamiento.test;

import encapsulamiento.entidades.TrianguloRectangulo;

import javax.swing.*;
import java.util.Scanner;

public class TestFiguras {
    public static void main(String[] args) {

        TrianguloRectangulo triangulo1 = new TrianguloRectangulo();

        //TrianguloRectangulo triangulo2 = new TrianguloRectangulo(4.5,6.8);

        double c1=0.0;
        double c2=0.0;
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer cateto: ");
        c1=entrada.nextDouble();
        System.out.println("Ingrese el primer cateto: ");
        c2=entrada.nextDouble();
        */

        c1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer cateto"));
        c2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo cateto"));



        triangulo1.setCateto1(c1);
        triangulo1.setCateto2(c2);
        JOptionPane.showMessageDialog(null,triangulo1.calcularHipotenusa());

        System.out.println("La hipotenusa es: " + triangulo1.calcularHipotenusa());
        System.out.println("El perimetro es: " + triangulo1.calcularPerimetro());
        //System.out.println(triangulo2);
        //System.out.println("El perimetro es: " + triangulo2.calcularPerimetro());
    }
}

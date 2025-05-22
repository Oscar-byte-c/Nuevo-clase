package clases.test;

import clases.entidades.CambioMoneda;

import java.util.Scanner;

public class TestCambioMoneda {

    public static void main(String[] args) {
        System.out.println("Ingrese cantidad: ");
        Scanner moneda =  new Scanner(System.in);//hablita la entrada para una varibale
        double c = moneda.nextDouble();
        System.out.println("Total en euros es: "+ CambioMoneda.ConvertirEuros(c));
        System.out.println("Total en pesos Mexicanos es: "+CambioMoneda.ConvertirMX(c));
        System.out.println("Total en Yenes: "+CambioMoneda.ConvertirYEN(c));
    }
}

package encapsulamiento.test;

import encapsulamiento.entidades.Suma;

import java.util.Scanner;

public class TestSuma {
    public static void main(String[] args) {


        Suma suma= new Suma();
        Scanner scanner= new Scanner(System.in);

        double opcion= -1;

        while (opcion != 0){

            System.out.print("Introduce el primer digito o '0' para finalizar: ");
            opcion = scanner.nextDouble();
            suma.sumar(opcion);
            if (opcion != 0) {
                suma.sumar(opcion);
                System.out.println("Suma total: " + suma.sumar(opcion));
            }
        }

    }

}


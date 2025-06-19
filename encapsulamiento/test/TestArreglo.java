package encapsulamiento.test;

import encapsulamiento.entidades.Arreglo;
import encapsulamiento.entidades.Persona;

public class  TestArreglo {
    public static void main(String[] args) {
        Arreglo arreglo= new Arreglo();
        String[] nombres={"Oscar","Julian","Gabriel"};
        int[] numeros= {10,20,30,40,50};
        boolean[] respuestas= {true,false,true,true};
        double[] precios = {10.99,5.5,3.75,20.0};
        Persona[] personas={new Persona("Gian","15225251",1.85),
                            new Persona("David","1050281441",1.75),
                            new Persona("Julian","4861516155",179)};

        arreglo.recorrer(nombres);
        System.out.println("-----------");
        arreglo.recorrer(personas);
        System.out.println("-----------");
        arreglo.recorrer(numeros);
        System.out.println("-----------");
        arreglo.recorrer(respuestas);
        System.out.println("-----------");
        arreglo.recorrer(precios);
        System.out.println("-----------");
        //arreglos vacios
        String[] nombresProductos = new String[4];
        nombresProductos[0]="galletas";
        nombresProductos[1]="agua";
        nombresProductos[2]="chicles";
        nombresProductos[3]="chocolates";
        arreglo.recorrer(nombresProductos);

    }
}

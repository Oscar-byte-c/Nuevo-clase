package ficheros.test;

import ficheros.clases.Empleado;
import ficheros.clases.Escritura;

import java.util.ArrayList;
import java.util.List;

public class TestEscritura {
    public static void main(String[] args) {
        Escritura es=new Escritura();
//        es.escribirFichero("dias","C:/Users/POO/Documents/POO/hola.txt");
//        es.actualizarFichero("lunes","C:/Users/POO/Documents/POO/hola.txt");
//        es.actualizarFichero("martes","C:/Users/POO/Documents/POO/hola.txt");
//        es.actualizarFichero("miercoles","C:/Users/POO/Documents/POO/hola.txt");
//        es.actualizarFichero("jueves","C:/Users/POO/Documents/POO/hola.txt");
//        es.actualizarFichero("viernes","C:/Users/POO/Documents/POO/hola.txt");
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("Juan Perez","gerente",2000));
        empleados.add(new Empleado("Ariel Paz","subgerente",1000));
        empleados.add(new Empleado("Gabriel Simbaña","cordinador",900));
        empleados.add(new Empleado("Oscar Vasquez","tecnico",850));
        empleados.add(new Empleado("Gian Cadena","desarollador",820));
        empleados.add(new Empleado("David Perez","desarollador",820));
        empleados.add(new Empleado("Sergio Pilataxi","analista",850));
        empleados.add(new Empleado("Fito Perez","asistente",600));

        es.escribirFichero("nombre,cargo,sueldo","C:/Users/POO/Documents/POO/empleados.csv");
        for(Empleado e: empleados){
            es.actualizarFichero(e.toString(),"C:/Users/POO/Documents/POO/empleados.csv");
        }
        es.escribirLista("C:/Users/POO/Documents/POO/empleados2.csv",(ArrayList<Empleado>) empleados);


    }
}

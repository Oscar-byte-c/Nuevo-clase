package Colecciones.test;


import Colecciones.entidades.Lista;
import herencia.clases.Persona;

import java.util.ArrayList;
import java.util.List;

public class TestLista {
    public static void main(String[] args) {
        Lista l = new Lista();
        //Inmutables
        List<String> nombres = List.of("Juan","Anita","Maria");
        List<Integer> numeros = List.of(10,20,30,40,50);
        List<Boolean> respuestas = List.of(true,false,true,true);
        List<Double> precios = List.of(10.99,5.5,3.75,20.0);
        List<Persona> personas = List.of(new Persona("Ana",25,"ecuatoriana"),
                                        new Persona("Luis",30,"cubana"),
                                        new Persona("Carlos",22,"chilena"));
        //Mutables
        List<String> nombres1 = new ArrayList<>(List.of("Oscar","Anita","Maria"));
        l.reccorer(nombres);
        System.out.println("---------------------------------");
        l.reccorer(nombres1);
        System.out.println("---------------------------------");
        l.reccorer(numeros);
        System.out.println("---------------------------------");
        l.reccorer(respuestas);
        System.out.println("---------------------------------");
        l.reccorer(precios);
        System.out.println("---------------------------------");
        l.reccorer(personas);

    }
}

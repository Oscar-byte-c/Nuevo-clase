package Colecciones.test;

import Colecciones.entidades.ClaseSet;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        ClaseSet set = new ClaseSet();
        Set<String> nombres = Set.of("Juan","Anita","Maria");
        Set<Integer> numeros = Set.of(10,20,30,40,50);
        Set<Boolean> respuestas = Set.of(true,false);
        Set<Double> precios = Set.of(10.99,5.5,3.75,20.0);

        //Set<String> facultades = new HashSet<String>();
        Set<String> facultades = new TreeSet<String>();
        facultades.add("ESFOT");
        facultades.add("Ambiental");
        facultades.add("Sistemas");
        facultades.remove("Ambiental");



        //Set<Boolean> respuestas = new LinkedHashSet<Boolean>();

        set.reccorer(nombres);
        System.out.println("---------------------------------");
        set.reccorer(numeros);
        System.out.println("---------------------------------");
        set.reccorer(respuestas);
        System.out.println("---------------------------------");
        set.reccorer(precios);
        System.out.println("---------------------------------");
        set.reccorer(facultades);

    }
}

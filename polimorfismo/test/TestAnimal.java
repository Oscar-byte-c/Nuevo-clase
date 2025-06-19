package polimorfismo.test;


import polimorfismo.clases.*;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        //Crear objetos
        Perro p = new Perro();
        Ave a = new Ave();
        Pez pe = new Pez();
        Gato g = new Gato();
        System.out.println(p.formaMovilizar() + " " + p.cobertura() + " " + p.comunicar());
        System.out.println("-----------------------------------------");
        System.out.println(a.formaMovilizar() + " " + a.cobertura() + " " + a.comunicar());
        System.out.println("-----------------------------------------");
        System.out.println(pe.formaMovilizar() + " " + pe.cobertura() + " " + pe.comunicar());
        System.out.println("-----------------------------------------");
        System.out.println(g.formaMovilizar() + " " + g.cobertura() + " " + g.comunicar());

        System.out.println("===================================================");

        //Crear objetos usando el tipo Interface
        Comportamiento perro = new Perro();
        Comportamiento ave = new Ave();
        Comportamiento pez = new Pez();
        Comportamiento gato = new Gato();
        Comunicacion per = new Perro();
        Comunicacion av = new Ave();
        Comunicacion pezz = new Pez();
        Comunicacion ga = new Gato();
        System.out.println(perro.formaMovilizar() + " " + perro.cobertura() + " " + per.comunicar());
        System.out.println("-----------------------------------------");
        System.out.println(ave.formaMovilizar() + " " + ave.cobertura() + " " + av.comunicar());
        System.out.println("-----------------------------------------");
        System.out.println(pez.formaMovilizar() + " " + pez.cobertura() + " " + pezz.comunicar());
        System.out.println("-----------------------------------------");
        System.out.println(gato.formaMovilizar() + " " + gato.cobertura() + " " + ga.comunicar());

        System.out.println("===================================================");

        //Crear objetos usando el tipo de interface con colecciones
        List<Comportamiento> animales = new ArrayList<Comportamiento>();
        animales.add(new Perro());
        animales.add(new Ave());
        animales.add(new Pez());
        animales.add(new Gato());
        for (Comportamiento c : animales ) {
            System.out.println(c.formaMovilizar() + "" + c.cobertura());
        }
        List<Comunicacion> ani = new ArrayList<Comunicacion>();
        ani.add(new Perro());
        ani.add(new Ave());
        ani.add(new Pez());
        ani.add(new Gato());
        for (Comunicacion c : ani) {
            System.out.println(c.comunicar());
        }
    }
}

package Colecciones.entidades;


import java.util.Set;

public class ClaseSet {
    public<T> void reccorer(Set<T> lista) {
        for (T x : lista) {
            System.out.println(x);
        }
    }
}

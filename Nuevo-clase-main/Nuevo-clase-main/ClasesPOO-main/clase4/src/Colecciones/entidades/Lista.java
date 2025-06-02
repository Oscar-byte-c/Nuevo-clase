package Colecciones.entidades;

import java.util.List;

public class Lista {
    public<T> void reccorer(List<T> lista) {
        for (T x : lista) {
            System.out.println(x);
        }
    }
}

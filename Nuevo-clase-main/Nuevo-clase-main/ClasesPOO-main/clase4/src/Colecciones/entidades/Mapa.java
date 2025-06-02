package Colecciones.entidades;


import java.util.Map;


public class Mapa {
    public <K, V> void reccorer(Map<K, V> mapa) {
        for (K indice : mapa.keySet()) {
            System.out.println("Clave: " + indice +",Valor: "+mapa.get(indice));
        }
    }
    public <K, V> void reccorer2(Map<K, V> mapa) {
        for (Map.Entry<K,V> entry: mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() +",Valor: "+entry.getValue());
        }
    }

}



































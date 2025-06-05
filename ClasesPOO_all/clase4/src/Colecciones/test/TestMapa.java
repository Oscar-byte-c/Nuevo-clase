package Colecciones.test;

import Colecciones.entidades.Mapa;
import herencia.clases.Persona;

import java.util.*;

public class TestMapa {
    public static void main(String[] args) {
        Mapa nume = new Mapa();
        //Set<String> nombres = new HashSet<>(Set.of("Ana","Luis","Carlos"));
        Map<Integer,Integer> numeros = Map.of(1,10,2,20,3,30,4,40,5,50);
        Map<String,Boolean> respuestas = Map.of("V",true,"F",false);
        Map<String,Double> precios = Map.of("R",12.00,"B",15.0,"MB",18.0,"S",20.0);
        Map<Integer,Persona> mapaPersonas=Map.of(1, new Persona("Julio",21,"ecuatoriana"),
                2,new Persona("Sergio",21,"venezolana"),
                    3,new Persona("Maria",21,"venezolana"));
        Set<Persona> personas = Set.of(new Persona("Oscar",21,"ecuatoriana"),
                new Persona("Ariel",21,"venezolana"),
                new Persona("Carlos",22,"chilena"));

        //Mapa de cedulas y Personas
        Map<String,String> map = new HashMap<String,String>();
        map.put("1050281441","Oscar Vasquez");
        map.put("1050281551","Ariel Paz");
        map.put("1158781441","Gabriel Simbaña");
        map.put("1058791441","Sergio Pererira");
        // Mapa de Capitales y Paise
        Map<String,String> map2 = new TreeMap<String,String>();
        map2.put("Quito","Ecuador");
        map2.put("Bogota","Colombia");
        map2.put("Lima","Peru");
        map2.put("Buenos Aires","Argentina");
        map2.put("Amnsterdan","Holanda");
        //Sucursales de una empresa
        Map<String,String> map3 = new LinkedHashMap<String,String>();
        map3.put("SQN","Sucursal Quito-Norte");
        map3.put("SQS","Sucursal Quito-Sur");
        map3.put("SLV","Sucursal Los Valles");
        map3.put("SMA","Sucursal Machchi");

        //Rangos
        Map<String,String> rangos = new LinkedHashMap<String,String>();
        rangos.put("Hierro","Muy malo");
        rangos.put("Bronze","Malo");
        rangos.put("Plata","Novato");
        rangos.put("Oro","Intermedio");
        rangos.put("Diamante","Bueno");
        rangos.put("Ascendete","Muy bueno");

        Iterator iterator = personas.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------");
        nume.reccorer(numeros);
        System.out.println("--------------------------");
        nume.reccorer(respuestas);
        System.out.println("--------------------------");
        nume.reccorer(precios);
        System.out.println("--------------------------");
        nume.reccorer(mapaPersonas);
        System.out.println("--------------------------");
        nume.reccorer(map);
        System.out.println("--------------------------");
        nume.reccorer(map2);
        System.out.println("--------------------------");
        nume.reccorer(map3);
        System.out.println("--------------------------");
        nume.reccorer(rangos);
        System.out.println("==============================================================");
        nume.reccorer2(numeros);
        System.out.println("--------------------------");
        nume.reccorer2(respuestas);
        System.out.println("--------------------------");
        nume.reccorer2(precios);
        System.out.println("--------------------------");
        nume.reccorer2(mapaPersonas);
        System.out.println("--------------------------");
        nume.reccorer2(map);
        System.out.println("--------------------------");
        nume.reccorer2(map2);
        System.out.println("--------------------------");
        nume.reccorer2(map3);
        System.out.println("--------------------------");
        nume.reccorer2(rangos);


    }
}

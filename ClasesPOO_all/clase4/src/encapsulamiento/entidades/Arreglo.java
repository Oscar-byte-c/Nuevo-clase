package encapsulamiento.entidades;

public class Arreglo {

    public void recorrer(String[] nombre) {
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }
    }

    public void recorrer(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public void recorrer(boolean[] respuestas) {
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println(respuestas[i]);
        }
    }

    public void recorrer(double[] precios) {
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
    }
    public void recorrer(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
    

}
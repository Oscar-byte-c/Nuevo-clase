package encapsulamiento.test;

public class TestEjercicios {
    public static void main(String[] args) {
        // Convertir un String a un entero:
        String edad="25";
        int edad2=Integer.parseInt(edad);
        System.out.println(edad2);
        //Convertir un int a un String:
        int cedula=123456789;
        String cedula2=String.valueOf(cedula);
        System.out.println(cedula2);

    }
}

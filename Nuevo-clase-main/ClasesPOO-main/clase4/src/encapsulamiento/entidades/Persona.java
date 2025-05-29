package encapsulamiento.entidades;

public class Persona {
        //atributos
        private String nombre;
        private String cedula;
        private double estatura;
        //constructor


    public Persona(String nombre, String cedula, double estatura) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.estatura = estatura;
    }

    public Persona(){

    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + estatura ;
    }
}

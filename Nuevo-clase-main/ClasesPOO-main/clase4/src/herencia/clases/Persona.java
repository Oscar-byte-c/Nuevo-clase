package herencia.clases;

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private String nacionalidad;
    //constructor
    public Persona(String nombre,int edad,String nacionalidad){
        this.nombre = nombre;
        this.edad= edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ",";
    }

    public void saludar(){
        System.out.println("Hola que tal");
    }
}

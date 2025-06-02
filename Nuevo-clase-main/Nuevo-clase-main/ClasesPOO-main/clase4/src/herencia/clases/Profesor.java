package herencia.clases;

public class Profesor extends Empleado{
    private String titulo;
    private int numMaterias;

    public Profesor(String nombre, int edad, String nacionalidad, String tipoEmpleado, String tipoContrato, double sueldo, String titulo, int numMaterias) {
        super(nombre, edad, nacionalidad, tipoEmpleado, tipoContrato, sueldo);
        this.titulo = titulo;
        this.numMaterias = numMaterias;
    }

    @Override
    public String toString() {
        return super.toString() +
                "titulo='" + titulo + '\'' +
                ", numMaterias=" + numMaterias ;
    }
}

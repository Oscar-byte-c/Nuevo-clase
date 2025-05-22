package herencia.clases;

public class Secretaria extends Empleado {
    private String departamento;
    private String experiencia;


    public Secretaria(String nombre, int edad, String nacionalidad, String tipoEmpleado, String tipoContrato, double sueldo, String departamento, String experiencia) {
        super(nombre, edad, nacionalidad, tipoEmpleado, tipoContrato, sueldo);
        this.departamento = departamento;
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "departamento='" + departamento + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }
}
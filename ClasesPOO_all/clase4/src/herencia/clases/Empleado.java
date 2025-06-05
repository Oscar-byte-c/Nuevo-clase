package herencia.clases;



public class Empleado extends Persona{
    private String tipoEmpleado;//Titular u Ocasional
    private String tipoContrato;//Relacion de Dependencia o Servicios Profesionales
    private double sueldo;

    public Empleado(String nombre, int edad , String nacionalidad,String tipoEmpleado, String tipoContrato, double sueldo) {
        super(nombre,edad,nacionalidad);
        this.tipoEmpleado = tipoEmpleado;
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tipoEmpleado='" + tipoEmpleado + '\'' +
                ", tipoContrato='" + tipoContrato + '\'' +
                ", sueldo=" + sueldo+",";
    }
}

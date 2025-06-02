package herencia.clase;

import herencia.clases.Empleado;

public class Guardia extends Empleado {
    private String cargo;
    private String jornada;
    private int horasRegistradas;


    public Guardia(String nombre, int edad, String nacionalidad, String tipoEmpleado, String tipoContrato, double sueldo, String cargo,String jornada,int horasRegistradas) {
        super(nombre, edad, nacionalidad, tipoEmpleado, tipoContrato, sueldo);
        this.cargo = cargo;
        this.jornada = jornada;
        this.horasRegistradas = horasRegistradas;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", cargo='" + cargo + '\'' +
                ", jornada='" + jornada + '\'' +
                ", horasRegistradas=" + horasRegistradas;
    }
}
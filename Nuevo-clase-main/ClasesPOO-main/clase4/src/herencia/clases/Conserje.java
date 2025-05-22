package herencia.clases;

public class Conserje extends Empleado {
    private String area;
    private String jornada;

    public Conserje(String nombre, int edad, String nacionalidad, String tipoEmpleado, String tipoContrato, double sueldo, String area, String jornada) {
        super(nombre, edad, nacionalidad, tipoEmpleado, tipoContrato, sueldo);
        this.area = area;
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "area='" + area + '\'' +
                ", jornada='" + jornada + '\'' +
                '}';
    }
}

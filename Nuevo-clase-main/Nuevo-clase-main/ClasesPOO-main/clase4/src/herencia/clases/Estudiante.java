package herencia.clases;

public class Estudiante extends Persona{
    private String numCarnet;
    private String jornada;

    public Estudiante(String nombre, int edad, String nacionalidad,String numCarnet, String jornada) {
        super(nombre, edad, nacionalidad);//invocando al constructor padre
        this.numCarnet=numCarnet;
        this.jornada=jornada;
    }

    @Override
    public String toString() {
        return super.toString()+
                "numCarnet='" + numCarnet + '\'' +
                ", jornada='" + jornada ;
    }
}

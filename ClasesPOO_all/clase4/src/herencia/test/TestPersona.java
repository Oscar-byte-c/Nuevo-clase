package herencia.test;

import herencia.clase.Guardia;
import herencia.clases.*;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Oscar Vasquez", 19, "2mexicano");
        System.out.println(persona);

        Estudiante est = new Estudiante("Julian", 19, "ecuatoriana", "AS002", "mañana");
        System.out.println(est);


        Empleado emp = new Empleado("Oscar", 21, "ecuatoriana", "Titular", "Servicios Profesionales", 30000);
        System.out.println(emp);

        Profesor prof = new Profesor("Sergio", 34, "ecuatoriana", "Titular", "Relacion de Dependencia", 20000, "Ing.Software", 2);
        System.out.println(prof);

        Conserje con = new Conserje("Gabriel", 30, "cubana", "Ocasional", "Relacion de Dependencia", 450, "esfot", "vespertina");
        System.out.println(con);

        Guardia g = new Guardia("Pedro Juarez", 55, "ecuatoriano", "titular", "dependencia", 800, "franco", "nocturno", 12);
        System.out.println(g);

        Secretaria sec = new Secretaria("Maria", 28, "colombiana", "Titular", "Relacion de dependencia", 800.50, "Financiero", "3 años");
        System.out.println(sec);

        Empleado[] empleados = {emp, prof};
        System.out.println("-----------------------------------------------------------------------------");
        for (Empleado e : empleados) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 1; i <= empleados.length; i++) {
            System.out.println("Num.- " + i + ":" + empleados[i - 1]);
        }
    }
}

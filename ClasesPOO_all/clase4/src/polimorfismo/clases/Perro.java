package polimorfismo.clases;

public class Perro implements Comportamiento,Comunicacion{



    public String formaMovilizar() {
        return "El perro camina....";
    }


    public String cobertura() {
        return "El perro esta cubierto de pelo....";
    }


    public String comunicar() {
        return "El perro ladra.... ";
    }
}

package polimorfismo.clases;

public class Pez implements Comportamiento,Comunicacion{












    public String formaMovilizar() {
        return "El pez nada...";
    }


    public String cobertura() {
        return "El pez esta cubierto de escamas.....";
    }


    public String comunicar() {
        return "El pez burbujea.....";
    }
}

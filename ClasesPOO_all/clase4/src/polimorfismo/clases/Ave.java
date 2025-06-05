package polimorfismo.clases;

public class Ave implements Comportamiento,Comunicacion{



    public String cobertura() {
        return "El ave esta cubierta por plunas....";
    }

    public String formaMovilizar() {
        return "El ave vuela.....";
    }


    public String comunicar() {
        return "El ave canta....";
    }
}

package polimorfismo.clases;

public class Gato implements Comportamiento,Comunicacion{


    public String formaMovilizar() {
        return "El gato camina....";
    }


    public String cobertura() {
        return "El gato tiene pelaje......";
    }

    @Override
    public String comunicar() {
        return "El gato maulla.....";
    }
}

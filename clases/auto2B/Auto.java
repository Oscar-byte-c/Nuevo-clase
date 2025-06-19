package clases.auto2B;

public class Auto {
    private double velocidad=0.0;
    private double gasolina=10;
    private double tiempoRecorrido=0;
    public double cambioVelocidad(double cambio, double tiempo){
        // tiempo en minutos

        if ((velocidad+cambio)<0||(velocidad+cambio)>100){
            System.out.println("La velocidad no puede ser negativa o exceder los 100km/h");
        }else{

            tiempoRecorrido=tiempoRecorrido+tiempo;
            gasolina=(200-tiempoRecorrido)/20;
            if (gasolina>0){
                velocidad=velocidad+cambio;

            }else{
                velocidad=0;
                System.out.println("El auto se ha detenido porfavor recargue de gasolina");
            }

        }
        return velocidad;
    }


    public String informacion(){
        return "Velocidad del auto: "+velocidad+ " km/h --> Gasolina en el tanque: "+gasolina+" --> Tiempo recorrido: "+tiempoRecorrido+" min --> Gasolina en el tanque "+gasolina;

    }
}

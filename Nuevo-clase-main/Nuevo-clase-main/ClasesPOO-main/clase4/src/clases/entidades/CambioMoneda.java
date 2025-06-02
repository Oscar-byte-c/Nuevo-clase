package clases.entidades;
import clases.interfaces.Moneda;

public class CambioMoneda implements Moneda {




    public static double ConvertirEuros(double dolar){
        return dolar*EUROS;
    }
    public static double ConvertirMX(double dolar){
        return dolar*MX;
    }
    public static double ConvertirYEN(double dolar){
        return dolar*YEN;
    }
}

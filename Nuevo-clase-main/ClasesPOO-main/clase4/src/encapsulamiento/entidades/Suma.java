package encapsulamiento.entidades;

public class Suma {


    public double sumar(double ...n){
        double total=0;
        for (double x: n){total+=x;}
        return total;
    }
    @Override
    public String toString() {
        return "Suma{}";
    }
}
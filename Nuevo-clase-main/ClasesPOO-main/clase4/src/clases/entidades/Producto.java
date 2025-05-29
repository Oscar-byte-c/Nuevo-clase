package clase.entidades;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Producto {
    //atributo
    private String detalle;
    private double precio;
    private int cantidad;
    private boolean stock;
    private String obs;

//metodos

    public void setprecio(double x){
        if (x>0){
            precio=x;}
        else{
            JOptionPane.showMessageDialog(null,"No se puede ingresar numeros negativos");
        }
    }

    public void setstock(boolean stock){
        this.stock=stock;}

    public void setcantidad(int cantidad){
        this.cantidad=cantidad;}

    public void setdetalle(String detalle){
        this.detalle=detalle;

    }
    public<T> void reccorer(List<T> lista) {
        for (T x : lista) {
            System.out.println(x);
        }
    }

    public void Avisar(){
        if (stock=true){
            obs="Sin novedad";
        }
        else{
            obs="No hay producto disponible, adquirir de inmediato";
        }
    }

    @Override
    public String toString() {
        Avisar();;
        return "Producto{" +
                "\ndetalle='" + detalle + '\'' +
                ", \nprecio=" + precio +
                ", \ncantidad=" + cantidad +
                ", \nstock=" + stock +
                ", \nobservacion='" + obs + '\'' +
                '}';
    }
}

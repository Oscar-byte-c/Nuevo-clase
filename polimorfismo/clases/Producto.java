package polimorfismo.clases;


public class Producto implements Constantes {
    private String nombre;
    private double precio;
    private double iva=0,ice=0,des=0;

    public Producto(String nombre, double precio,boolean iva,boolean ice ,boolean des) {
        this.nombre = nombre;
        this.precio = precio;
        if(iva) {this.iva=IVA;}
        if (ice) {this.ice=ICE;}
        if (des) {this.des=DESCUENTO;}
    }

    public double calcularTotal(){
        return precio +(precio*iva )+(precio*ice)-(precio*des);
    }

    public String imprimir(){
        return nombre+", Total a pagar: "+ calcularTotal();
    }
}

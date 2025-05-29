package clase.test;

import clase.entidades.Producto;

import java.util.ArrayList;

public class TestProducto {
    public static void main(String[] args) {
        Producto pro = new Producto();

        Producto pr2 = new Producto();
        Producto pr3 = new Producto();

        ArrayList<Producto> productos = new ArrayList<Producto>();
        Producto pr1 = new Producto();
        productos.add(pr1);
        productos.get(0).setdetalle("Chicles");
        productos.get(0).setprecio(5);
        productos.get(0).setcantidad(20);
        pr1.reccorer(productos);

        pro.setcantidad(3);
        pro.setdetalle("Galletas");
        pro.setprecio(1.50);
        pro.setstock(true);





/*
        System.out.println("Cantidad: "+pro.cantidad);
        System.out.println("Detalle: "+pro.detalle);
        System.out.println("Precio: "+pro.precio);
        System.out.println("--------------------------");
        System.out.println("Cantidad: "+pr.cantidad);
        System.out.println("Detalle: "+pr.detalle);
        System.out.println("Precio: "+pr.precio);*/
    }
}

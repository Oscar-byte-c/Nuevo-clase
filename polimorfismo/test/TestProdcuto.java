package polimorfismo.test;

import polimorfismo.clases.Producto;

public class TestProdcuto {
    public static void main(String[] args) {
        Producto p = new Producto("TV",100,true,true,true);
        System.out.println(p.imprimir());
    }
}

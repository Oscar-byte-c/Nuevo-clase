package encapsulamiento.test;

import encapsulamiento.entidades.Auto;

public class TestAuto {
    public static void main(String[] args) {
        Auto auto1=new Auto("Chevrolet","Aveo",20000);
        Auto auto2=new Auto("Chevrolet","Aveo",20000);
        Auto auto3=new Auto("Toyota","Corolla");
        Auto auto4=new Auto("Ford");
        Auto auto5=new Auto();
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);
        System.out.println("--------------------------------------------------------------------------------------------");
        auto5.setMarca("Tesla");
        auto5.setModelo("B");
        auto5.setPrecio(90000);
        System.out.println(auto5);
    }
}

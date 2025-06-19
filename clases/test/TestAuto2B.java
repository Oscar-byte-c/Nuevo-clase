package clases.test;

import clases.auto2B.Auto;

public class TestAuto2B {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.cambioVelocidad(0,0);
        System.out.println(a.informacion());
        a.cambioVelocidad(20,10);
        System.out.println(a.informacion());
        a.cambioVelocidad(30,100);
        System.out.println(a.informacion());
        a.cambioVelocidad(-5,80);
        System.out.println(a.informacion());
        a.cambioVelocidad(-5,80);
        System.out.println(a.informacion());
    }
}

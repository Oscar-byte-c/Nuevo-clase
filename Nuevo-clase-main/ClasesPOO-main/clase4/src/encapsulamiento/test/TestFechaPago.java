package encapsulamiento.test;

import encapsulamiento.entidades.FechaPago;

public class TestFechaPago {
    public static void main(String[] args) {
        FechaPago fecha=new FechaPago();
        fecha.pagar();
        fecha.setMonth(2);
        fecha.pagar();
        fecha.setMonth(3);
        fecha.pagar();
        fecha.setMonth(4);
        fecha.pagar();

        fecha.setMonth(12);
        fecha.pagar();

        fecha.setYear();
        fecha.setMonth(2);
        fecha.pagar();

        //System.out.println(fecha.getDay()+"/"+fecha.getMonth()+"/"+fecha.getYear());
    }
}

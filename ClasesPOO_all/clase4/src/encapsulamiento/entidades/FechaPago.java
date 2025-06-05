package encapsulamiento.entidades;

public class FechaPago {
    //Atributos privados
    private int day=25; //Solo lectura
    private int month=1; //Lectura y Escritura
    private int year=2025; //Lectura y Escritura

    //Lectura -> Getters
    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}

    //Escritura -> Setters
    public void setMonth(int month){
        if(month>=1 && month<=12){
            this.month=month;
        }
    }
    public void setYear(){
        if(this.month==12){
            this.year=year+1;
            this.month=1;
        }
    }


    //Metodos


    public void pagar() {
        System.out.println("La fecha de pago es: "+day+"/" +month+"/"+ year);
    }
}


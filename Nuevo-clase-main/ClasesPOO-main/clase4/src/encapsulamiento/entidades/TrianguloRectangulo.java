package encapsulamiento.entidades;
public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;
    private double hipotenusa=0;

    public TrianguloRectangulo(double cateto1,double cateto2){
        this.cateto1=cateto1;
        this.cateto2=cateto2;
    }
    public TrianguloRectangulo(){

    }
    public double calcularPerimetro(){
        return cateto1 + cateto2 +hipotenusa;
    }
    public double calcularHipotenusa(){
        return hipotenusa=Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2));
    }

    public double getCateto1(){return cateto1;}
    public double getCateto2(){return cateto2;}
    public double getHipotenusa(){return hipotenusa;}

    public void setCateto1(double cateto1){this.cateto1=cateto1;}
    public void setCateto2(double cateto2){this.cateto2=cateto2; }

    @Override
    public String toString() {
        return "TrianguloRectangulo{" +
                "cateto1=" + cateto1 +
                ", cateto2=" + cateto2 +
                ", hipotenusa=" + hipotenusa +
                '}';
    }
}

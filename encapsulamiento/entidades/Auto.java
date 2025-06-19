package encapsulamiento.entidades;

public class Auto {

    private String id; //Lectura
    private static int ids=0;
    private String marca="No asignado"; // Lectura y Escritura
    private String  modelo="No asignado";//Lectura y Escritura
    private double precio;//Lectura y Escritura
    //Constructor
    public Auto(String marca,String modelo,double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        Auto.ids=Auto.ids+1;
        id="ABC"+Auto.ids;
    }

    public Auto(String marca,String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = 0;
        Auto.ids = Auto.ids + 1;
        id = "ABC" + Auto.ids;
    }
    public Auto(String marca) {
        this.marca = marca;
        this.precio = 0;
        Auto.ids = Auto.ids + 1;
        id = "ABC" + Auto.ids;
    }
    public Auto() {
        this.precio = 0;
        Auto.ids = Auto.ids + 1;
        id = "ABC" + Auto.ids;
    }


    //Lectura -> Getters
    public String getId(){return id;}
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
    public double getPrecio(){return precio;}

    //Escritura -> Setters
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", precio=" + precio +
                '}';
    }
}

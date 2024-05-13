package tiposAnimales;

import clasesAbstractas.mascota;

public class perro extends mascota {
    private String raza;
    private String tamaño;

    public perro(String nombre, String color, int edad, String raza, String tamaño) {
        super(nombre, color, edad, "Vivo");
        this.raza = raza;
        this.tamaño = tamaño;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getRaza(){
        return raza;
    }

    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }

    public String getTamaño(){
        return tamaño;
    }

    public String toString(){
        return "Perro: " + getNombre() + " " + getColor() + " " + getEdad() + " " + getRaza() + " " + getTamaño();
    }
}

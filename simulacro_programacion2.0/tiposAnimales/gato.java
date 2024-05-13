package tiposAnimales;

import clasesAbstractas.mascota;

public class gato extends mascota{
    private boolean peloLargo;
    private String raza;

    public gato(String nombre, String color, int edad, String raza, boolean peloLargo) {
        super(nombre, color, edad, "Vivo");
        this.raza = raza;
        this.peloLargo = peloLargo;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getRaza(){
        return raza;
    }

    public void setPeloLargo(boolean peloLargo){
        this.peloLargo = peloLargo;
    }

    public boolean getPeloLargo(){
        return peloLargo;
    }

    public String toString(){
        return "Gato: " + getNombre() + " " + getColor() + " " + getEdad() + " " + getRaza() + " " + getPeloLargo();
    }
}

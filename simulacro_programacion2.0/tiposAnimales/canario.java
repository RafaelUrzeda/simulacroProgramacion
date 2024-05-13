package tiposAnimales;

import clasesAbstractas.ave;

public class canario extends ave{
    private boolean canta;
    private boolean picoGrande;

    public canario(String nombre, String color, int edad, String estado, String tipo, boolean vuela, boolean canta, boolean picoGrande){
        super(nombre, color, edad, estado = "Vivo", tipo, vuela);
        this.canta  = canta;
        this.picoGrande = picoGrande;
    }

    public void setCanta(boolean canta){
        this.canta = canta;
    }

    public boolean getCanta(){
        return canta;
    }

    public void setpicoGrande(boolean picoGrande){
        this.picoGrande = picoGrande;
    }

    public boolean getpicoGrande(){
        return picoGrande;
    }

    public String toString(){
        return "Canario: " +  getNombre() + " " + getColor() + " " + getEdad() + " " + getTipo() + " " + getVuela() + " " + getCanta() + " " + getpicoGrande();
    }

}

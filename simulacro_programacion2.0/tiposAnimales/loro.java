package tiposAnimales;

import clasesAbstractas.ave;

public class loro extends ave{
    private boolean habla;
    private boolean canta;

    public loro(String nombre, String color, int edad, String estado, String tipo, boolean vuela, boolean habla, boolean canta){
        super(nombre, color, edad, estado= "Vivo", tipo, vuela); 
        this.habla = habla;
        this.canta = canta;
    }
    
    public void setHabla(boolean habla){
        this.habla = habla;
    }

    public boolean getHabla(){
        return habla;
    }

    public void setCanta(boolean canta){
        this.canta = canta;
    }

    public boolean getCanta(){
        return canta;
    }

    public String toString(){
        return "Loro: " + getNombre() + " " + getColor() + " " + getEdad() + " " + getTipo() + " " + getVuela() + " " + getHabla() + " " + getCanta();
    }
}

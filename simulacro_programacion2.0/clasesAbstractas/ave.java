package clasesAbstractas;

public abstract class ave extends mascota{
    private String tipo;
    private boolean vuela;

    public ave(String nombre, String color, int edad, String estado, String tipo, boolean vuela) {
        super(nombre, color, edad, estado = "Vivo"); // Explicitly invoke the constructor of the superclass
        this.tipo = tipo;
        this.vuela = vuela;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setVuela(boolean vuela){
        this.vuela = vuela;
    }

    public boolean getVuela(){
        return vuela;
    }
}

package clasesAbstractas;

public abstract class mascota {
    private String nombre;
    private String color;
    private int edad;
    private String estado = "Vivo";
    public int contador = 0;
    
    public mascota(String nombre, String color, int edad, String estado) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.estado = estado;
        contador++;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }  

    public String getColor() {
        return color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

}

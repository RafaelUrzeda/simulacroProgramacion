package main.java.clasesAbstractas;

public abstract class Mascota {
    // Atributos
    protected String color;
    protected int edad;
    protected String estado;

    // Constructor
    public Mascota(String color, int edad) {
        this.color = color;
        this.edad = edad;
        this.estado = "vivo"; // Por defecto, la mascota está viva al ser creada
    }

    // Método para incrementar la edad de la mascota
    public void cumpleaños() {
        this.edad++;
    }

    // Método abstracto para implementar en las clases hijas
    public abstract void mostrarInformacion();

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


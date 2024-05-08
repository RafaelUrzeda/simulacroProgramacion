package main.java.tiposMascota;

import main.java.clasesAbstractas.Ave;

public class Loro extends Ave {
    // Atributos específicos de Loro
    private boolean habla;
    private String tamaño;

    // Constructor
    public Loro(String color, int edad, boolean habla, String tamaño) {
        super(color, edad);
        this.habla = habla;
        this.tamaño = tamaño;
    }

    // Implementación del método toString() para Loro
    public String toString() {
        return "Tipo: Loro\n" +
                "Color: " + getColor() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Estado: " + getEstado() + "\n" +
                "¿Puede volar?: " + preguntarSiVuela() + "\n" +
                "¿Puede hablar?: " + habla + "\n" +
                "Tamaño: " + tamaño;
    }
}

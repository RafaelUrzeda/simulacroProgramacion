package main.java.tiposMascota;

import main.java.clasesAbstractas.Mascota;

public class Perro extends Mascota {
    // Atributos específicos de Perro
    private boolean tienePulgas;
    private String numeroChip;

    // Constructor
    public Perro(String color, int edad, boolean tienePulgas, String numeroChip) {
        super(color, edad);
        this.tienePulgas = tienePulgas;
        this.numeroChip = numeroChip;
    }

    // Implementación del método toString para Perro
    public String toString() {
        return "Tipo: Perro\n" +
                "Color: " + color + "\n" +
                "Edad: " + edad + "\n" +
                "Estado: " + estado + "\n" +
                "¿Tiene pulgas?: " + tienePulgas + "\n" +
                "Número de chip: " + numeroChip;
    }
}

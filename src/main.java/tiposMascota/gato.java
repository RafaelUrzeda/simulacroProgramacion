package main.java.tiposMascota;

import main.java.clasesAbstractas.Mascota;

public class Gato extends Mascota {
    // Atributos específicos de Gato
    private boolean tienePelo;

    // Constructor
    public Gato(String color, int edad, boolean tienePelo) {
        super(color, edad);
        this.tienePelo = tienePelo;
    }

    // Implementación del método toString para Gato
    public String toString() {
        return "Tipo: Gato\n" +
                "Color: " + color + "\n" +
                "Edad: " + edad + "\n" +
                "Estado: " + estado + "\n" +
                "¿Tiene pelo?: " + tienePelo;
    }
}

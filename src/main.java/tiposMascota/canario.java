package main.java.tiposMascota;

import main.java.clasesAbstractas.Ave;

public class Canario extends Ave {
    // Atributos específicos de Canario
    private boolean canta;
    private String tipoJaula;

    // Constructor
    public Canario(String color, int edad, boolean canta, String tipoJaula) {
        super(color, edad);
        this.canta = canta;
        this.tipoJaula = tipoJaula;
    }

    // Implementación del método toString() para Canario
    public String toString() {
        return "Tipo: Canario\n" +
                "Color: " + getColor() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Estado: " + getEstado() + "\n" +
                "¿Puede volar?: " + preguntarSiVuela() + "\n" +
                "¿Puede cantar?: " + canta + "\n" +
                "Tipo de jaula: " + tipoJaula;
    }
}

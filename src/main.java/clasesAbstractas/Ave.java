package main.java.clasesAbstractas;

import java.util.Scanner;

public abstract class Ave extends Mascota {
    // Constructor
    public Ave(String color, int edad) {
        super(color, edad);
    }

    // Método para preguntar si el ave vuela
    public boolean preguntarSiVuela() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Puede volar esta ave? (true/false): ");
        return scanner.nextBoolean();
    }

    // Método abstracto para implementar en las clases hijas
    public abstract void mostrarInformacion();
}

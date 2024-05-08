package main.java;

import java.util.Scanner;

import main.java.tiposMascota.Canario;
import main.java.tiposMascota.Gato;
import main.java.tiposMascota.Loro;
import main.java.tiposMascota.Perro;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManejoMascotas gestor = new ManejoMascotas();

        int opcion;
        do {
            System.out.println("\n*** Menú de Manejo de Mascotas ***");
            System.out.println("1. Añadir mascota");
            System.out.println("2. Marcar mascota como fallecida");
            System.out.println("3. Eliminar mascota");
            System.out.println("4. Mostrar información de una mascota");
            System.out.println("5. Mostrar información de todas las mascotas");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    añadirMascota(gestor, scanner);
                    break;
                case 2:
                    marcarMascotaFallecida(gestor, scanner);
                    break;
                case 3:
                    eliminarMascota(gestor, scanner);
                    break;
                case 4:
                    mostrarInformacionMascota(gestor, scanner);
                    break;
                case 5:
                    mostrarTodasLasMascotas(gestor);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);
    }

    private static void añadirMascota(ManejoMascotas gestor, Scanner scanner) {
        System.out.println("\n*** Añadir Mascota ***");
        System.out.print("Ingrese el tipo de mascota (Perro/Gato/Loro/Canario): ");
        String tipo = scanner.next();
        System.out.print("Ingrese el nombre de la mascota: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el color de la mascota: ");
        String color = scanner.next();
        System.out.print("Ingrese la edad de la mascota: ");
        int edad = scanner.nextInt();

        switch (tipo.toLowerCase()) {
            case "perro":
                System.out.print("¿Tiene pulgas? (true/false): ");
                boolean tienePulgas = scanner.nextBoolean();
                System.out.print("Ingrese el número de chip: ");
                String numeroChip = scanner.next();
                gestor.añadirMascota(new Perro(nombre, color, edad, tienePulgas, numeroChip));
                break;
            case "gato":
                System.out.print("¿Tiene pelo? (true/false): ");
                boolean tienePelo = scanner.nextBoolean();
                gestor.añadirMascota(new Gato(nombre, color, edad, tienePelo));
                break;
            case "loro":
                System.out.print("¿Puede hablar? (true/false): ");
                boolean puedeHablar = scanner.nextBoolean();
                System.out.print("Ingrese el tamaño del loro: ");
                String tamaño = scanner.next();
                gestor.añadirMascota(new Loro(nombre, color, edad, puedeHablar, tamaño));
                break;
            case "canario":
                System.out.print("¿Puede cantar? (true/false): ");
                boolean puedeCantar = scanner.nextBoolean();
                System.out.print("Ingrese el tipo de jaula del canario: ");
                String tipoJaula = scanner.next();
                gestor.añadirMascota(new Canario(nombre, color, edad, puedeCantar, tipoJaula));
                break;
            default:
                System.out.println("Tipo de mascota no válido.");
        }
    }

    private static void marcarMascotaFallecida(ManejoMascotas gestor, Scanner scanner) {
        System.out.println("\n*** Marcar Mascota como Fallecida ***");
        System.out.print("Ingrese el nombre de la mascota a marcar como fallecida: ");
        String nombre = scanner.next();
        gestor.muereMascota(nombre);
    }

    private static void eliminarMascota(ManejoMascotas gestor, Scanner scanner) {
        System.out.println("\n*** Eliminar Mascota ***");
        System.out.print("Ingrese el nombre de la mascota a eliminar: ");
        String nombre = scanner.next();
        gestor.eliminarMascota(nombre);
    }

    private static void mostrarInformacionMascota(ManejoMascotas gestor, Scanner scanner) {
        System.out.println("\n*** Mostrar Información de una Mascota ***");
        System.out.print("Ingrese el nombre de la mascota: ");
        String nombre = scanner.next();
        gestor.mostrarMascota(nombre);
    }

    private static void mostrarTodasLasMascotas(ManejoMascotas gestor) {
        System.out.println("\n*** Mostrar Información de Todas las Mascotas ***");
        gestor.mostrarTodasLasMascotas();
    }
}

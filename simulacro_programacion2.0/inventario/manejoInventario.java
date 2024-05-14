package inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clasesAbstractas.mascota;
import tiposAnimales.canario;
import tiposAnimales.gato;
import tiposAnimales.loro;
import tiposAnimales.perro;

public class manejoInventario {

    private List<mascota> mascotas; // Lista para almacenar las mascotas

    public manejoInventario() {
        this.mascotas = new ArrayList<>(); // Inicializa la lista
    }

    public void añadirMascota() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de mascota desea añadir?");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Loro");
        System.out.println("4. Canario");

        int tipoMascota = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (tipoMascota) {
            case 1:
                añadirPerro();
                break;
            case 2:
                añadirGato();
                break;
            case 3:
                añadirLoro();
                break;
            case 4:
                añadirCanario();
                break;
            default:
                System.out.println("Tipo de mascota no válido.");
        }
    }

    private void añadirPerro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del perro: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el color del perro: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese la edad del perro: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese la raza del perro: ");
        String raza = scanner.nextLine();

        System.out.print("Ingrese el tamaño del perro: ");
        String tamaño = scanner.nextLine();

        perro perro = new perro(nombre, color, edad, raza, tamaño);
        mascotas.add(perro);
        System.out.println("¡Perro añadido correctamente!");
    }

    private void añadirGato() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del gato: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el color del gato: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese la edad del gato: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese la raza del gato: ");
        String raza = scanner.nextLine();

        System.out.print("¿El gato tiene pelo largo? (Sí/No): ");
        boolean peloLargo = scanner.nextLine().equalsIgnoreCase("Sí");

        gato gato = new gato(nombre, color, edad, raza, peloLargo);
        mascotas.add(gato);
        System.out.println("¡Gato añadido correctamente!");
    }

    private void añadirLoro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del loro: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el color del loro: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese la edad del loro: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el tipo de loro: ");
        String tipo = scanner.nextLine();

        System.out.print("¿El loro vuela? (Sí/No): ");
        boolean vuela = scanner.nextLine().equalsIgnoreCase("Sí");

        System.out.print("¿El loro habla? (Sí/No): ");
        boolean habla = scanner.nextLine().equalsIgnoreCase("Sí");

        System.out.print("¿El loro canta? (Sí/No): ");
        boolean canta = scanner.nextLine().equalsIgnoreCase("Sí");

        loro loro = new loro(nombre, color, edad, "Vivo", tipo, vuela, habla, canta);
        mascotas.add(loro);
        System.out.println("¡Loro añadido correctamente!");
    }

    private void añadirCanario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del canario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el color del canario: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese la edad del canario: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el tipo de loro: ");
        String tipo = scanner.nextLine();

        System.out.print("¿El canario vuela? (Sí/No): ");
        boolean vuela = scanner.nextLine().equalsIgnoreCase("Sí");

        System.out.print("¿El canario canta? (Sí/No): ");
        boolean canta = scanner.nextLine().equalsIgnoreCase("Sí");

        System.out.print("¿El canario tiene pico grande? (Sí/No): ");
        boolean picoGrande = scanner.nextLine().equalsIgnoreCase("Sí");

        canario canario = new canario(nombre, color, edad, "Vivo", tipo, vuela, canta, picoGrande);
        mascotas.add(canario);
        System.out.println("¡Canario añadido correctamente!");
    }

    public void eliminarMascota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la mascota que desea eliminar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                mascotas.remove(i);
                System.out.println("La mascota " + nombre + " ha sido eliminada.");
                return;
            }
        }
        System.out.println("La mascota " + nombre + " no fue encontrada.");
    }

    // Método para mostrar información de una mascota por nombre
    public void mostrarMascota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la mascota que desea mostrar: ");
        String nombre = scanner.nextLine();

        for (mascota mascota : mascotas) {
            if (mascota.getNombre() == nombre) {
                System.out.println(mascota);
                return;
            }
        }
        System.out.println("La mascota " + nombre + " no fue encontrada.");
    }

    // Método para mostrar todas las mascotas
    public void mostrarTodasLasMascotas() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas en el sistema.");
            return;
        }
        System.out.println("Lista de mascotas:");
        for (mascota mascota : mascotas) {
            System.out.println(mascota);
        }
    }

    // Método para marcar una mascota como fallecida
    public void muereMascota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la mascota que ha fallecido: ");
        String nombre = scanner.nextLine();

        for (mascota mascota : mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascota.setEstado("muerto");
                System.out.println("La mascota " + nombre + " ha sido marcada como fallecida.");
                return;
            }
        }
        System.out.println("La mascota " + nombre + " no fue encontrada.");
    }

    public void vaciarInventario() {
        mascotas.clear();
        System.out.println("Historial vaciado correctamente.");
    }
    
}

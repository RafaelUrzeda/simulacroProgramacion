import java.util.Scanner;

import inventario.manejoInventario;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        manejoInventario manejoInventario = new manejoInventario(); // Instancia de la clase ManejoInventario
        int opcion;
        
        do {
            System.out.println("\n*** Menú de Manejo de Mascotas ***");
            System.out.println("1. Añadir mascota");
            System.out.println("2. Marcar mascota como fallecida");
            System.out.println("3. Eliminar mascota");
            System.out.println("4. Mostrar información de una mascota");
            System.out.println("5. Mostrar información de todas las mascotas");
            System.out.println("6. Vaciar el inventario de mascotas");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    manejoInventario.añadirMascota();
                    break;
                case 2:
                    manejoInventario.muereMascota();
                    break;
                case 3:
                    manejoInventario.eliminarMascota();
                    break;
                case 4:
                    manejoInventario.mostrarMascota();
                    break;
                case 5:
                    manejoInventario.mostrarTodasLasMascotas();
                    break;
                case 6:
                    manejoInventario.vaciarInventario();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);
        
        scanner.close(); // Cerrar el scanner al salir del programa
    }
}

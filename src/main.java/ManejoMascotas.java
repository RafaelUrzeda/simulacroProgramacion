package main.java;

import java.util.ArrayList;
import java.util.List;

public class ManejoMascotas {
    private List<Mascota> mascotas;

    public ManejoMascotas() {
        this.mascotas = new ArrayList<>();
    }

    public void añadirMascota(Mascota mascota) {
        mascotas.add(mascota);
        System.out.println("¡Mascota añadida correctamente!");
    }

    public void muereMascota(String nombre) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascota.setEstado("muerto");
                System.out.println("La mascota " + nombre + " ha sido marcada como fallecida.");
                return;
            }
        }
        System.out.println("No se encontró ninguna mascota con el nombre " + nombre);
    }

    public void eliminarMascota(String nombre) {
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                mascotas.remove(i);
                System.out.println("La mascota " + nombre + " ha sido eliminada.");
                return;
            }
        }
        System.out.println("No se encontró ninguna mascota con el nombre " + nombre);
    }

    public void mostrarMascota(String nombre) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(mascota);
                return;
            }
        }
        System.out.println("No se encontró ninguna mascota con el nombre " + nombre);
    }

    public void mostrarTodasLasMascotas() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas en el sistema.");
            return;
        }
        System.out.println("Lista de mascotas:");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
    }
}

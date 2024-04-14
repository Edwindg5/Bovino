package org.example.ganado.controller;

import org.example.ganado.models.Animal;
import java.util.List;
public class BuscarGanadoController {
    // Método para buscar ganado por nombre
    public Animal buscarPorNombre(List<Animal> listaGanado, String nombre) {
        for (Animal ganado : listaGanado) {
            if (ganado.getNombre().equals(nombre)) {
                return ganado;
            }
        }
        return null;
    }
    // Método para buscar ganado por ID
    public Animal buscarPorId(List<Animal> listaGanado, int id) {
        for (Animal ganado : listaGanado) {
            if (ganado.getId() == id) {
                return ganado;
            }
        }
        return null;
    }

    // Otros métodos de búsqueda según necesidades
}
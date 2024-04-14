package org.example.ganado.controller;

import org.example.ganado.models.Animal;
import java.util.List;

public class EliminarGanadoController {
    public void eliminarGanado(List<Animal> listaGanado, int id) {
        listaGanado.removeIf(ganado -> ganado.getId() == id);
    }
}

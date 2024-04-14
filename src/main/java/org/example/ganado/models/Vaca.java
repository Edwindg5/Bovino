package org.example.ganado.models;

public class Vaca extends Animal {
    private String fechaPremiacion;

    // Constructor
    public Vaca(String nombre, int id, double peso, String estadoSalud, String raza, String fechaPremiacion) {
        super(nombre, id, peso, estadoSalud, raza);
        this.fechaPremiacion = fechaPremiacion;
    }

    // Getters y setters específicos para la clase VacaPremiada

    public String getFechaPremiacion() {
        return fechaPremiacion;
    }

    public void setFechaPremiacion(String fechaPremiacion) {
        this.fechaPremiacion = fechaPremiacion;
    }
}
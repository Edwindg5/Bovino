package org.example.ganado.models;

public class Animal {
    private String nombre;
    private int id;
    private double peso;
    private String estadoSalud;
    private String raza;

    public Animal(String nombre, int id, double peso, String estadoSalud, String raza) {
        this.nombre = nombre;
        this.id = id;
        this.peso = peso;
        this.estadoSalud = estadoSalud;
        this.raza = raza;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

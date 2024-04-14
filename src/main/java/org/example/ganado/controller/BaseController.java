package org.example.ganado.controller;

public class BaseController {
    private String nombre;
    private int edad;

    // Constructor
    public BaseController(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    // Método para imprimir información del ganado
    public void mostrarInformacion() {
        System.out.println("Nombre del ganado: " + nombre);
        System.out.println("Edad del ganado: " + edad);
    }

    // Método para alimentar al ganado
    public void alimentar() {
        System.out.println("El ganado está siendo alimentado.");
    }
}

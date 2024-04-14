package org.example.ganado.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class RegistrarGanadoController {

    @FXML
    private TextField nombreField;

    @FXML
    private TextField idField;

    @FXML
    private TextField pesoField;

    @FXML
    private TextField estadoSaludField;

    @FXML
    private TextField razaField;

    @FXML
    private void registrarGanado() {
        String nombre = nombreField.getText();
        int id = Integer.parseInt(idField.getText());
        double peso = Double.parseDouble(pesoField.getText());
        String estadoSalud = estadoSaludField.getText();
        String raza = razaField.getText();

        // Aquí puedes agregar la lógica para registrar el nuevo ganado en tu sistema
        System.out.println("Ganado registrado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Peso: " + peso);
        System.out.println("Estado de Salud: " + estadoSalud);
        System.out.println("Raza: " + raza);

        // Mostrar mensaje de confirmación
        mostrarAlerta("Registro Exitoso", "El ganado ha sido registrado correctamente.");
    }

    @FXML
    private void salir() {
        // Aquí puedes agregar la lógica para cerrar la ventana de registro de ganado
        nombreField.getScene().getWindow().hide();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}

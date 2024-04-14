package org.example.ganado.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usuarioField;

    @FXML
    private PasswordField contrasenaField;

    @FXML
    private void login() {
        String usuario = usuarioField.getText();
        String contrasena = contrasenaField.getText();

        if (usuario.equals("edwin") && contrasena.equals("123")) {
            mostrarSegundaVista();
        } else {
            mostrarAlerta("Error de inicio de sesión", "Usuario o contraseña incorrectos.");
        }
    }

    private void mostrarSegundaVista() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Vista Principal");
            stage.show();

            // Cerrar la ventana de inicio de sesión
            Stage loginStage = (Stage) usuarioField.getScene().getWindow();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}

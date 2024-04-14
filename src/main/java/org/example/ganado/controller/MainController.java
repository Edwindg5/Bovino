package org.example.ganado.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private void mostrarRegistroGanado() {
        cargarVista("registrar_ganado.fxml", "Registrar Ganado");
    }

    @FXML
    private void mostrarEliminarGanado() {
        cargarVista("eliminar_ganado.fxml", "Eliminar Ganado");
    }

    @FXML
    private void mostrarVerDatosGanado() {
        cargarVista("ver_datos_ganado.fxml", "Ver Datos del Ganado");
    }

    @FXML
    private void mostrarBuscarGanado() {
        cargarVista("buscar_ganado.fxml", "Buscar Ganado");
    }

    @FXML
    private void mostrarRealizarVentas() {
        cargarVista("realizar_ventas.fxml", "Realizar Ventas");
    }

    private void cargarVista(String fxml, String titulo) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/" + fxml));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

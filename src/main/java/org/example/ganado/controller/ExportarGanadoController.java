package org.example.ganado.controller;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import org.example.ganado.models.Animal;
import org.example.ganado.models.ExportadorGanado;

import java.io.File;
import java.util.List;

public class ExportarGanadoController {
    private List<Animal> listaGanado;

    public void setListaGanado(List<Animal> listaGanado) {
        this.listaGanado = listaGanado;
    }

    @FXML
    private void exportarGanadoCSV() {
        // Crear un selector de archivo
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Guardar archivo CSV");

        // Configurar la extensión y el nombre del archivo
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Archivos CSV (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extFilter);

        // Mostrar el diálogo para seleccionar la ubicación de guardado
        File file = fileChooser.showSaveDialog(null);

        // Verificar si se seleccionó un archivo
        if (file != null) {
            // Exportar la información del ganado al archivo CSV seleccionado
            ExportadorGanado.exportarGanadoCSV(listaGanado, file.getAbsolutePath()); // Corrige el nombre del método
        }
    }
}

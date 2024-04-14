module org.example.ganado {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.ganado to javafx.fxml;
    exports org.example.ganado;
    exports org.example.ganado.controller;
    opens org.example.ganado.controller to javafx.fxml;
}
module cr.ac.una.sistematurnos {
    requires javafx.controls;
    requires javafx.fxml;

    opens cr.ac.una.sistematurnos.app to javafx.fxml;
    exports cr.ac.una.sistematurnos.app;
}

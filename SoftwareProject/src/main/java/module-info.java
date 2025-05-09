module javaFX.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens dtu.example.ui;
    exports dtu.example.ui to javafx.fxml;
}
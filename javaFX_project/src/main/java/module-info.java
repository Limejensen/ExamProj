module com.exproj.examprog {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.exproj.examprog to javafx.fxml;
    exports com.exproj.examprog;
}
package dtu.example.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AllProjectsScreenController extends SubpageController {


    @FXML
    private Button createNewProjectButton;



    @FXML
    public void initialize() {
        createNewProjectButton.setOnMouseClicked(this::createNewProjectButton);
    }

    public void createNewProjectButton(MouseEvent click) {
        mainScreenController.swapToCreateNewProjectScreen();
    }
}

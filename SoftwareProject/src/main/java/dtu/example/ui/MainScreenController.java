package dtu.example.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainScreenController {

    private SceneManager sceneManager = SceneManager.getInstance();

    @FXML
    private Button logoutButton, myActivitiesButton, allProjectsButton;

    @FXML
    private Label usernameLabel, currentSubScreenLabel;

    @FXML
    public void initialize() {
        logoutButton.setOnMouseClicked(this::logoutButton);
    }

    public void logoutButton(MouseEvent click) {
        sceneManager.swapToLoginScreen();
    }

    public void setUsernameLabel(String username) {
        usernameLabel.setText(username);
    }

    public void setCurrentSubScreenLabel(String currentSubScreen) {

    }

    public void swapToAllProjectsScreen() {

    }

    public void swapToMyActivitiesScreen() {

    }


}

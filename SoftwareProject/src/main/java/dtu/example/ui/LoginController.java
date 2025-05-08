package dtu.example.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label loginStatusLabel;

    @FXML
    private Button loginButton;

    private LoginController loginController;

    Login login = new Login();


    @FXML
    public void initialize() {
        loginButton.setOnMouseClicked(this::loginButton);
        loginController = new LoginController();
    }


    public void loginButton(MouseEvent click) {
        try {
            if (login.validate(passwordField.getText())) {
                SceneManager.getInstance().initPostLogin();
                SceneManager.getInstance().swapToMainScreen();
            } else {
                setLoginStatusLabel("Please Enter VALID Credentials, idiot!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Uber-giga-redundant but it looks slightly neater which makes me happy and that's very important.
    public void setLoginStatusLabel(String text) {
        loginStatusLabel.setText(text);
    }


   
}

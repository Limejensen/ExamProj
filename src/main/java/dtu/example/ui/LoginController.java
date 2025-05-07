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


    @FXML
    public void initialize() {
        loginButton.setOnMouseClicked(this::loginButton);
    }

    public void loginButton(MouseEvent click) {
        System.out.println(passwordField.getText());

        //Here you obviously want to actually run through a 'database' of users and attempt to authorize with the input, this is just an example.
        //After that, instantiate a user and most likely have the CURRENT user as a singleton, this avoids multiple unintended instances of a user-object. (For a reference on singletons look at SceneManager.j)
        //Finally, load the userdata into the following menus and proceed.
        try {
            if (passwordField.getText().equals("123")) {
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


    /*

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label loginStatusLabel;

    @FXML
    private Button loginButton;

    private LoginController loginController;


    @FXML
    public void initialize() {
        loginButton.setOnMouseClicked(this::loginButton);
        loginController = new LoginController();
    }

    public void loginButton(MouseEvent click) {
        try {
            if (loginController.validate(passwordField.getText())) {
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

     */
}

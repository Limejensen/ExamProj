package dtu.example.ui;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setTitle("Project Manager App");
        primaryStage.setResizable(false);

        SceneManager.getInstance(primaryStage).swapToLoginScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
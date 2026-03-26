package com.project.miappfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public static class FormularioController {
        public void handleEnviar () {
            System.out.println("Hello world!");
        }
    }
}

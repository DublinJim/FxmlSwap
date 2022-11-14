package com.example.fxmlswap;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HorizontalController {
    public Stage stage;
    public Scene scene;
    private FXMLLoader fxmlLoader;

    public void addAbutton(ActionEvent actionEvent) throws IOException {
        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("horizontal.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }
}

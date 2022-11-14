package com.example.fxmlswap;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerVertical implements Initializable {
    public FlowPane VboxRoot;
    public Button firstBtn;

    public void addAbutton() {
        Button newPtt = new Button("Ptt");
        newPtt.setPrefHeight(68.0);
        newPtt.setPrefWidth(171.0);

        VboxRoot.getChildren().add(newPtt);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ContextMenu contextMenu = new ContextMenu();
        MenuItem switchHorizontal = new MenuItem("switch");
        switchHorizontal.setOnAction(e->{
            // TODO: 11/14/2022 put function here  
        });
        contextMenu.getItems().add(switchHorizontal);

    }
}

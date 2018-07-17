package pl.moja.biblioteczka.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainController {
    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private Label label;

    @FXML
    private ToggleButtonsController toggleButtonsController;

    @FXML
    private void initialize() {
        toggleButtonsController.setMainController(this);
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public ToggleButtonsController getToggleButtonsController() {
        return toggleButtonsController;
    }

    public void setToggleButtonsController(ToggleButtonsController toggleButtonsController) {
        this.toggleButtonsController = toggleButtonsController;
    }

    public BorderPane getMainBorderPane() {
        return mainBorderPane;
    }

    public void setMainBorderPane(BorderPane mainBorderPane) {
        this.mainBorderPane = mainBorderPane;
    }

    public void setCenter(String fxmlString){
        FXMLLoader loader= new FXMLLoader(getClass().getResource(fxmlString));
        Parent parent= null;
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainBorderPane.setCenter(parent);
    }
}

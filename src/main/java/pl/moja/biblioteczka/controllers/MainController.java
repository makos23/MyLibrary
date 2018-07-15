package pl.moja.biblioteczka.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

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
}

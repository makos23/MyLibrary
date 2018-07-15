package pl.moja.biblioteczka.controllers;

import javafx.fxml.FXML;

public class ToggleButtonsController {

    MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void openLibrary() {
        mainController.getLabel().setText("Library");
    }

    @FXML
    public void openListBooks() {
        mainController.getLabel().setText("Books");;
    }

    @FXML
    public void openStatistics() {
        mainController.getLabel().setText("Statistics");;
    }
}

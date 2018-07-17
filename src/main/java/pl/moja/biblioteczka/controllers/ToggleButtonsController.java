package pl.moja.biblioteczka.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class ToggleButtonsController {

    public static final String LIBRARY_FXML = "/fxml/Library.fxml";
    public static final String LIST_BOOK_FXML = "/fxml/ListBook.fxml";
    public static final String STATISTICS_FXML = "/fxml/Statistics.fxml";
    public static final String ADD_BOOK_FXML = "/fxml/AddBook.fxml";
    MainController mainController;
    @FXML
    ToggleGroup toogleGroup;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void openLibrary() {
        mainController.setCenter(LIBRARY_FXML);
    }

    @FXML
    public void openListBooks() {
        mainController.setCenter(LIST_BOOK_FXML);
    }

    @FXML
    public void openStatistics() {
        mainController.setCenter(STATISTICS_FXML);
    }
    @FXML
    public void addBook(ActionEvent actionEvent) {
        if(toogleGroup.getSelectedToggle()!=null)
        toogleGroup.getSelectedToggle().setSelected(false);
        mainController.setCenter(ADD_BOOK_FXML);
    }
}

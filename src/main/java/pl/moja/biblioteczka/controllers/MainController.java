package pl.moja.biblioteczka.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.moja.biblioteczka.dialogs.DialogUtils;

import javax.swing.text.html.StyleSheet;
import java.io.IOException;
import java.util.Optional;

public class MainController {
    @FXML
    CheckMenuItem alwaysOnTopCheck;


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

    public void closeApplication() {
        Optional<ButtonType> buttonType = DialogUtils.confirmationDialg();
        if(buttonType.get()==ButtonType.OK){
        Platform.exit();
        System.exit(0);}

    }

    public void setCaspian() {
        Application.setUserAgentStylesheet("CASPIAN");
    }

    public void setModena() {
        Application.setUserAgentStylesheet("MODENA");
    }

    public void setAlwaysOnTop(ActionEvent actionEvent) {
        Stage stage = (Stage) mainBorderPane.getScene().getWindow();
      boolean value =((CheckMenuItem)actionEvent.getSource()).isSelected();
        stage.setAlwaysOnTop(value);
    }

    public void about() {
        DialogUtils.dialogAboutApplication();
    }
}

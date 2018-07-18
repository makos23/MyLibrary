package pl.moja.biblioteczka.dialogs;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;
import java.util.ResourceBundle;

public class DialogUtils {
    public static ResourceBundle bundle= ResourceBundle.getBundle("bundles.messages");

    public static void dialogAboutApplication(){
        Alert informationDialog = new Alert(Alert.AlertType.INFORMATION);
        informationDialog.setTitle(bundle.getString("about.title"));
        informationDialog.setHeaderText(bundle.getString("about.header"));
        informationDialog.setContentText(bundle.getString("about.content"));
        informationDialog.showAndWait();
    }
    public static Optional<ButtonType> confirmationDialg(){
        Alert confirmationDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationDialog.setTitle(bundle.getString("exit.title"));
        confirmationDialog.setHeaderText(bundle.getString("exit.header"));
       // confirmationDialog.setContentText(bundle.getString("about.content"));
        Optional<ButtonType> result = confirmationDialog.showAndWait();
        return result;
    }
}

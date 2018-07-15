package pl.moja.biblioteczka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Locale.setDefault(new Locale("en"));
        FXMLLoader loader= new FXMLLoader(this.getClass().getResource("/fxml/BorderPaneMain.fxml"));
        ResourceBundle bundle= ResourceBundle.getBundle("bundles.messages");
        loader.setResources(bundle);
        Parent root = loader.load();
        Scene scene= new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle(bundle.getString("tittle.application"));
        primaryStage.show();
    }

}

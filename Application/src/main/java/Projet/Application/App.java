package Projet.Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainView.fxml"));
        Scene scene = new Scene(loader.load(), 400, 300);
        stage.setScene(scene);
        stage.setTitle("Application Maintenance");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

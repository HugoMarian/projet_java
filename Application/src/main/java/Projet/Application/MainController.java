package Projet.Application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Button btnTech, btnBat, btnInterv;

    @FXML
    public void initialize() {
        btnTech.setOnAction(e -> switchView("/view/TechnicienView.fxml"));
        btnBat.setOnAction(e -> switchView("/view/BatimentView.fxml"));
        btnInterv.setOnAction(e -> switchView("/view/InterventionView.fxml"));
    }

    private void switchView(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Scene scene = new Scene(loader.load(), 600, 400);
            Stage stage = (Stage) btnTech.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

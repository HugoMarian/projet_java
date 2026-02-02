package Projet.Application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class InterventionController {
    @FXML
    private TableView<?> tableInterventions;

    @FXML
    private Button btnAjouter, btnModifier, btnSupprimer, btnRetour;

    @FXML
    public void initialize() {
        // Remplissage du tableau :
    	
    	
    	
    	
        // Exemple simple : ajouter un événement pour les boutons
        btnAjouter.setOnAction(e -> {
            System.out.println("Ajouter");
        });
        btnModifier.setOnAction(e -> {
            System.out.println("Modifier");
        });
        btnSupprimer.setOnAction(e -> {
            System.out.println("Supprimer");
        });
        
        btnRetour.setOnAction(e -> switchView("/view/MainView.fxml"));
    }
    
    private void switchView(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();

            Stage stage = (Stage) btnRetour.getScene().getWindow();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
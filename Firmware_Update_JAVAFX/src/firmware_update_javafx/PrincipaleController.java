/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firmware_update_javafx;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author alexis
 */
public class PrincipaleController implements Initializable {
    

 
    
    @FXML
    private void fermerLApplication(){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Attention !" );
        alert.setHeaderText("Fermeture de l'application");
        alert.setContentText("Vous avez demandé la fermeture de l'application ?");
        
        Optional<ButtonType> rep = alert.showAndWait();
        if(rep.get()==ButtonType.OK)
        System.exit(0);
        
    }
   

   @FXML
   private WebView webView;
   
   
   @FXML
   
   private WebEngine engine; 
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        webView = new WebView();
        engine = webView.getEngine();
        creerProgramme();
    }
    
    public void creerProgramme(){
        
        engine.load("https://play.thingz.co/galaxia");
        
    }
    
    public void updateFirmware() throws IOException{
        
        Runtime runtime = Runtime.getRuntime();
        runtime.exec(new String[] { "python3", "/Users/alexis/Downloads/esptool-master/esptool.py" } );
    }
}

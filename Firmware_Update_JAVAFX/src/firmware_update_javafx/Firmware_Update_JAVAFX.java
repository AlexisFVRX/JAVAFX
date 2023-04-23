
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package firmware_update_javafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author alexis
 */
public class Firmware_Update_JAVAFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       
        try {
        
            
        Parent root = FXMLLoader.load(getClass().getResource("Principale.fxml"));
        Scene scene = new Scene(root, 400, 400);
        scene.getStylesheets().add(getClass().getResource("principale.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        
    } catch (Exception e) {
        
        e.printStackTrace();
    }
    
           
    }    
   

    public static void main(String[] args) {
        launch(args);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prologjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
/**
 *
 * @author zyber
 */
public class PrologJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        webEngine.load("http://localhost:3030/ProLangES.html"); 
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        
        root.getChildren().add(browser);
        
        
        Scene scene = new Scene(root, 960, 650);
        primaryStage.getIcons().add(new Image(PrologJavaFX.class.getResourceAsStream( "iconImage.png" )));
        primaryStage.setTitle("ProLAd - Expert System 1.0");
        //primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (!Query.hasSolution("consult('src/resources/run.pl').")) {
      System.out.println("Consult failed");
    } else {
      
    }
        launch(args);
        
    }
    
}

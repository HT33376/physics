package io.github.HT33377;

import javafx.application.Application;
import javafx.scene.control.Label;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
    public static void main(String[] args) {
//        launch(args);
    }
	
    @Override
    public void start(Stage stage) {
    	//Section: stage (window?) size info
        stage.setFullScreen(true);
        Label label = new Label("Undone inner text");
        Scene scene = new Scene(label, 800, 600);

        stage.setTitle("Undone title");
        stage.setScene(scene);
        
        stage.show();
    }

}

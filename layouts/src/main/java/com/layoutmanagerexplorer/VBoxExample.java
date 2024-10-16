package com.layoutmanagerexplorer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("Java");
        Button b2 = new Button("C/C++");
        // b2.setPrefSize(70, 50);
        Button b3 = new Button("C#");
        Button b4 = new Button("Objective C");
        Button b5 = new Button("Swift");
        Button b6 = new Button("_Python");
        Button b7 = new Button("Scala");

        b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        b7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        VBox root = new VBox();
        root.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);
        root.setVgrow(b4, Priority.ALWAYS);
        root.setSpacing(10);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("VBox Example");
        stage.show();
    }
    
}

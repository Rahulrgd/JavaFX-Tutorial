package com.layoutmanagerexplorer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application{
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

        GridPane root = new GridPane();
        root.add(b1, 0, 0, 1, 1);
        root.add(b2, 1, 0, 1, 1);
        root.add(b3, 2, 0, 1, 1);
        root.add(b4, 3, 0, 1, 1);
        root.add(b5, 4, 1, 1, 1);
        root.add(b6, 5, 1, 1, 1);
        root.add(b7, 6, 1, 1, 1);
        Scene scene = new Scene(root, 600, 500);
        stage.setScene(scene);
        stage.show();
    }
    
}

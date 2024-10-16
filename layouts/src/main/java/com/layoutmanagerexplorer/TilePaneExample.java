package com.layoutmanagerexplorer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneExample extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("Java");
        Button b2 = new Button("C/C++");
        b2.setPrefSize(70, 50);
        Button b3 = new Button("C#");
        Button b4 = new Button("Objective C");
        Button b5 = new Button("Swift");
        Button b6 = new Button("_Python");
        Button b7 = new Button("Scala");
        TilePane.setAlignment(b7, Pos.TOP_RIGHT);
        TilePane root = new TilePane();
        root.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);
        // root.setPadding(new Insets(10));
        // root.setOrientation(Orientation.VERTICAL);
        // root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 600, 500);
        stage.setScene(scene);
        stage.show();
    }
    
}

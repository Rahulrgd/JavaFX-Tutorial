package com.layoutmanagerexplorer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application{
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

        FlowPane root = new FlowPane();
        root.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        root.setOrientation(Orientation.VERTICAL);
        Scene scene = new Scene(root, 600, 500);
        stage.setScene(scene);
        stage.setTitle("Flow Pane Example");
        stage.show();
    }
    
}

package com.layoutmanagerexplorer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Button top = createButton("Top");
        Button left = createButton("left");
        Button right = createButton("right");
        Button center = createButton("center");
        Button bottom = createButton("buttom");

        BorderPane root = new BorderPane();
        root.setTop(top);
        root.setLeft(left);
        root.setRight(right);
        root.setCenter(center);
        root.setBottom(bottom);
        Scene  scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Layout Manager Explorer");
        stage.show();
    }

    private Button createButton(String str) {
        Button button = new Button(str);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        BorderPane.setMargin(button, new Insets(5));
        button.setMinSize(100, 100);
        // BorderPane.setAlignment(button, Pos.CENTER);
        return button;

    }

    public static void main(String[] args) {
        launch();
    }

}
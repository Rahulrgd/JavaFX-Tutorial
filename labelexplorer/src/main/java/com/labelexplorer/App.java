package com.labelexplorer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();

        Label label = new Label();
        Image image = new Image(getClass().getResourceAsStream("icon.png"));
        ImageView iView = new ImageView(image);
        label.setText("Hello, There is some error");
        label.setGraphic(iView);
        label.setGraphicTextGap(50);
        label.setFont(Font.font("Roboto", FontWeight.BOLD, 18));
        label.setRotate(90);
        root.setCenter(label);


        stage.setTitle("Label Explorer");
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
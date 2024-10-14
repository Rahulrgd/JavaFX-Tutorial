package com.buttonexplorer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();

        Image image = new Image(getClass().getResourceAsStream("icon.png"));
        ImageView iView = new ImageView(image);
        Button button = new Button("Sa_ve", iView);
        button.setFont(Font.font("Roboto", FontWeight.BOLD, 18));
        // button.setRotate(90);

        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Save button pressed!");
            }
            
        });


        root.setCenter(button);

        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
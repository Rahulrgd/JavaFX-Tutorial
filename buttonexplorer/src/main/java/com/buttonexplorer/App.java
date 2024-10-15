package com.buttonexplorer;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

  Label label = new Label("Nothing to show yet!");
  int Click_Count = 0;
  Button button = new Button("Sa_ve");

  @Override
  public void start(Stage stage) throws IOException {
    BorderPane root = new BorderPane();

    Image image = new Image(getClass().getResourceAsStream("icon.png"));
    ImageView iView = new ImageView(image);
    button.setFont(Font.font("Roboto", FontWeight.BOLD, 18));

    root.setBottom(label);
    // button.setRotate(90);

    // button.setOnAction(e -> System.out.println("Save button pressed!"));
    // button.setOnAction(this::myHandler);
    // button.setOnAction(this::myHandler);
    button.setOnAction(e->{
        Click_Count++;
        label.setText("Button clicked: " + Click_Count + " times");
    });

    root.setCenter(button);

    Scene scene = new Scene(root, 500, 500);
    stage.setScene(scene);
    stage.show();
  }

  public void myHandler(ActionEvent e) {
    Click_Count++;
    label.setText("Button Clicked: " + Click_Count + " times");
  }

  public static void main(String[] args) {
    launch();
  }
}

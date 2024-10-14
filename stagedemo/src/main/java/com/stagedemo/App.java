package com.stagedemo;

import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  // @Override
  // public void start(Stage stage) throws Exception {
  //     stage.show();
  //     Group root = new Group();
  //     Scene scene = new Scene(root);
  //     root.setStyle("-fx-background-color: #ADD8E6;");
  //     stage.setScene(scene);
  //     stage.setTitle("This is title of the window");
  //     Image image = new Image(getClass().getResourceAsStream("icon.png"));
  //     stage.getIcons().add(image);

  // }

  @Override
  public void start(Stage primaryStage) {
    StackPane root = new StackPane();

    // Set the background color using CSS
    root.setStyle("-fx-background-color: #ADD8E6;"); // Light blue color

    Scene scene = new Scene(root, 400, 300);

    primaryStage.setTitle("Background Color Example");
    primaryStage.setScene(scene);
    primaryStage.show();
    primaryStage.setResizable(true);
    primaryStage.setX(50);
    primaryStage.setY(50);
    primaryStage.setFullScreen(true);
    primaryStage.setFullScreenExitHint("Press Q to exit Full Screen");
    primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
  }
}

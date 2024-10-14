package com.thirdproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  //   @Override
  //   public void start(Stage primaryStage) {
  //     primaryStage.setTitle("Hello World!");
  //     Button btn = new Button();
  //     btn.setText("Say 'Hello World'");
  //     btn.setOnAction(
  //       new EventHandler<ActionEvent>() {
  //         @Override
  //         public void handle(ActionEvent event) {
  //           System.out.println("Hello World!");
  //         }
  //       }
  //     );

  //     StackPane root = new StackPane();
  //     root.getChildren().add(btn);
  //     primaryStage.setScene(new Scene(root, 300, 250));
  //     primaryStage.show();
  //   }

  @Override
  public void start(Stage primaryStage) throws Exception {

    Button button = new Button("Say, Hello World");
    StackPane root = new StackPane(button);
    Scene scene = new Scene(root, 600, 400);
    primaryStage.setScene(scene);

    button.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent arg0) {
            System.out.println("Say, Hello World");
        }
    
    });

    primaryStage.show();
  }
}

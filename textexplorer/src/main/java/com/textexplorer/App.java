package com.textexplorer;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

  @Override
  public void start(Stage stage) throws IOException {
    try {
        BorderPane root = new BorderPane();
        stage.setTitle("Text Explorer");

        Text text = new Text("This is some text, so this text is a long line that can not be wraped within a single line");
        text.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.ITALIC, 60));
        text.setFill(Color.GREEN);
        text.setStroke(Color.RED);
        text.setStrokeWidth(3);
        text.setStrikethrough(true);
        // text.setUnderline(true);

        // DropShadow dropShadow = new DropShadow();
        // text.setEffect(dropShadow);
        // text.setEffect(new Reflection());
        // text.setEffect(new BoxBlur());
        text.setWrappingWidth(350);
        text.setTextAlignment(TextAlignment.JUSTIFY);

        root.setCenter(text);
        
        Scene scene = new Scene(root, 500, 500);
      stage.setScene(scene);
      stage.show();
    } catch (Exception e) {
        System.out.println(e);
    }
  }

  public static void main(String[] args) {
    launch();
  }
}

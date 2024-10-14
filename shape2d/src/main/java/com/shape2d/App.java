package com.shape2d;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage){
        Group root = new Group();

        // Text text = new Text();
        // text.setText("Welcome");
        // text.setFill(Color.RED);
        // text.setFont(Font.font("Times New Roman", 60));
        // text.setStroke(Color.GREEN);
        // text.setStrokeWidth(0.5);
        // text.setStrikethrough(true);
        // text.setX(100);
        // text.setY(100);
        // root.getChildren().add(text);

        // Line line = new Line();
        // line.setStartX(100);
        // line.setStartY(100);
        // line.setEndX(200);
        // line.setEndY(200);
        // line.setStrokeWidth(5);
        // line.setStroke(Color.RED);
        // line.setOpacity(0.5);
        // root.getChildren().add(line);

        // Rectangle rectangle = new Rectangle();
        // rectangle.setX(100);
        // rectangle.setY(100);
        // rectangle.setWidth(200);
        // rectangle.setHeight(100);
        // rectangle.setFill(Color.RED);
        // rectangle.setStroke(Color.GREEN);
        // rectangle.setStrokeWidth(0.5);
        // rectangle.setArcWidth(20);
        // rectangle.setArcHeight(20);
        // root.getChildren().add(rectangle);

        // Polygon polygon = new Polygon(100,200,300,200,200,100);
        // polygon.setFill(Color.RED);
        // polygon.setStroke(Color.GREEN);
        // polygon.setStrokeWidth(1);
        // root.getChildren().add(polygon);

        // Polyline polygon = new Polyline(100,400,300,400,400,100);
        // polygon.setFill(Color.RED);
        // polygon.setStroke(Color.GREEN);
        // polygon.setStrokeWidth(1);
        // root.getChildren().add(polygon);

        // Circle circle = new Circle();
        // circle.setCenterX(200);
        // circle.setCenterY(200);
        // circle.setRadius(100);
        // circle.setFill(Color.RED);
        // circle.setFill(Color.RED);
        // circle.setStroke(Color.GREEN);
        // circle.setStrokeWidth(2);
        // root.getChildren().add(circle);

        // Ellipse ellipse = new Ellipse();
        // ellipse.setCenterX(200);
        // ellipse.setCenterY(200);
        // ellipse.setRadiusX(100);
        // ellipse.setRadiusY(50);
        // ellipse.setFill(Color.RED);
        // ellipse.setStroke(Color.GREEN);
        // ellipse.setStrokeWidth(3);
        // root.getChildren().add(ellipse);

        // Arc arc = new Arc();
        // arc.setCenterX(200);
        // arc.setCenterY(200);
        // arc.setRadiusX(200);
        // arc.setRadiusY(200);
        // arc.setStartAngle(0);
        // arc.setLength(60);
        // arc.setType(ArcType.ROUND);
        // arc.setFill(Color.GREEN);
        // arc.setStrokeWidth(3);
        // arc.setStroke(Color.YELLOW);
        // root.getChildren().add(arc);

        // Image image = new Image(getClass().getResourceAsStream("narutoimage.jpg"));
        // ImageView imageView = new ImageView(image);
        // imageView.setX(200);
        // imageView.setY(100);
        // root.getChildren().add(imageView);

        // QuadCurve quadCurve = new QuadCurve();
        // quadCurve.setStartX(100);
        // quadCurve.setStartY(220);
        // quadCurve.setControlX(250);
        // quadCurve.setControlY(0);
        // quadCurve.setEndX(500);
        // quadCurve.setEndY(220);
        // root.getChildren().add(quadCurve);

        CubicCurve cubicCurve = new CubicCurve();
        cubicCurve.setStartX(100);
        cubicCurve.setStartY(150);
        cubicCurve.setControlX1(400);
        cubicCurve.setControlY1(40);
        cubicCurve.setControlX2(175);
        cubicCurve.setControlY2(250);
        cubicCurve.setEndX(500);
        cubicCurve.setEndY(150);
        root.getChildren().add(cubicCurve);

        

        Scene scene = new Scene(root, 800, 600);
        stage.show();
        stage.setTitle("2D Shape Tutorial");
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }

}
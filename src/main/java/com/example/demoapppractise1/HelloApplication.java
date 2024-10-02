package com.example.demoapppractise1;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.spreadsheet.Grid;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StackPane stackPane=new StackPane();
        Circle circle=new Circle(20);
        Circle circle1=new Circle(100);
        circle1.setStroke(Color.GREEN);
        circle1.setFill(Color.TRANSPARENT);
        stackPane.getChildren().addAll(circle,circle1);
        PathTransition pathTransition=new PathTransition();
        pathTransition.setDuration(Duration.millis(1000));
        pathTransition.setPath(circle1);
        pathTransition.setNode(circle);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();
        circle.setOnMousePressed(event -> pathTransition.pause());
        circle.setOnMouseReleased(event -> pathTransition.play());
        Scene scene=new Scene(stackPane,300,400);
        stage.setScene(scene);
        stage.show();
    }
    private void calculate(String itemPrice, String installmentMonths, String installmentAmount) {
        Double price=Double.parseDouble(itemPrice);
        Double insMonths=Double.parseDouble(installmentMonths);
        Double insAmount=Double.parseDouble(installmentAmount);
        double paymentEachMonths,totalPayment;
        paymentEachMonths=0;
    }

    public static void main(String[] args) {
        launch();
    }
}

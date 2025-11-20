package com.example.sticker;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import java.io.IOException;

public class Sticker extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();

//        Stop[] stops = new Stop[] {
//                new Stop(0.00, Color.RED),
//                new Stop(0.15, Color.ORANGE),
//                new Stop(0.30, Color.YELLOW),
//                new Stop(0.45, Color.GREEN),
//                new Stop(0.60, Color.BLUE),
//                new Stop(0.75, Color.INDIGO),
//                new Stop(0.90, Color.VIOLET),
//                new Stop(1.00, Color.PURPLE)
//        };
//        RadialGradient background = new RadialGradient(0, 0,
//                0.5, 0.5,
//                0.5,
//                true,
//                CycleMethod.NO_CYCLE,
//                stops);
        Stop[] stops = new Stop[] {
                new Stop(0, Color.RED),
                new Stop(1, Color.ORANGE),
        };
//        LinearGradient background = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
//        ball.setFill(background);
        drawSmashBall(200, 200, 170, group);
        Scene scene = new Scene(group, 400, 400);
        stage.setTitle("Ayush's Sticker");
        stage.setScene(scene);
        stage.show();
    }
    public void drawSmashBall(int x, int y, int size, Group group) {
        Circle ball = new Circle();
        ball.setCenterX(x);
        ball.setCenterY(y);
        ball.setRadius(size);
        ball.setStrokeWidth(30);
        ball.setFill(Color.WHITE);
        ball.setStroke(Color.BLACK);
        Polygon cross1 = new Polygon();
        cross1.getPoints().addAll(new Double[] {
                x - 30.0, y - 170.0, // Top right point
                x - 30.0, y + 170.0, // Bottom right point
                x - 75.0, y + 170.0, // Bottom left point
                x - 75.0, y - 170.0 // Top left point
        });
        cross1.setFill(Color.BLACK);
        Rectangle cross2 = new Rectangle(x - size, y + 30, size * 2, 20); // The x and y coordinates start off at the top left corner
        cross2.setFill(Color.BLACK);

        group.getChildren().addAll(ball, cross1, cross2);
    }
}

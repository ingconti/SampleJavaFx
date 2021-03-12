package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;


public class App extends Application implements Observer {

    public static void main(String[] args) {
        launch(args);
    }

    private View view = new View(this);
    // NOO ! private GameModel model = new GameModel(this);
    private GameModel model = new GameModel(view);

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");

        primaryStage.setScene(this.view.getScene());
        primaryStage.show();
    }

    @Override
    public void update(Observable o, Object arg) {

        //System.out.println("got it!!");
        CartesianPoint p = (CartesianPoint) arg;
        System.out.println(p.x);
        System.out.println(p.y);

        // tell to model:
        this.model.checkPoint(p);

    }
}
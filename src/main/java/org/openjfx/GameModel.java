package org.openjfx;

import javafx.scene.control.skin.TooltipSkin;

import java.util.Observable;
import java.util.Observer;

public class GameModel extends Observable {

    private CartesianCircle circle;
    private int clickCount = 0;
    private boolean hasWon = false;

    public GameModel(View obs) {
        this.circle = new CartesianCircle(20, 20, 50);
        this.addObserver(obs);
    }


    void checkPoint(CartesianPoint here){

        this.hasWon = circle.contains(here);
        this.clickCount++;

        String msg = (hasWon ? "WON!" : "") + Integer.toString(this.clickCount);

        setChanged();   // very important!
        notifyObservers(msg);
    }


}

package org.openjfx;
import java.lang.Math;

import static java.lang.Math.sqrt;

public class CartesianPoint {

    double x,y;

    public CartesianPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(CartesianPoint otherP){
        double c1 = otherP.x-this.x;
        double c2 = otherP.y-this.y;
        double d = sqrt(c1* c1 + c2 * c2);
        return d;
    }
}

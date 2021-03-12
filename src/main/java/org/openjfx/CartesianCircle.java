package org.openjfx;

public class CartesianCircle {

    private CartesianPoint center;
    private double radius;

    CartesianCircle(double x, double y, double radius){
        this.center = new CartesianPoint(x,y);
        this.radius = radius;
    }

    boolean contains(CartesianPoint p){
        return center.distanceFrom(p)<this.radius;
    }
}

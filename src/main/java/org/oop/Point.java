package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(Point from) {
        double xDistance = x - from.getX();
        double yDistance = y - from.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double directionFrom(Point from) {
        double xDistance = x - from.getX();
        double yDistance = y - from.getY();
        return Math.atan2(yDistance, xDistance);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

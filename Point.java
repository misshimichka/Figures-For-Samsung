package com.company;

public class Point {
    double x;
    double y;
    double degrees;
    double l;

    Point(double my_x, double my_y) {
        x = my_x;
        y = my_y;
    }

    double length() {
        l = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return l;
    }

    double angle() {
        double k = Math.sqrt(Math.pow(y, 2));
        double sinus = k / l;
        double arcsin = Math.asin(sinus);
        degrees = Math.toDegrees(arcsin);
        return degrees;
    }

    void add(Point anotherPoint) {
        x = x + anotherPoint.x;
        y = y + anotherPoint.y;
    }

    double distanceXTo(Point anotherPoint) {
        double dist_x = x - anotherPoint.x;
        return dist_x;
    }

    double distanceYTo(Point anotherPoint) {
        double dist_y = y - anotherPoint.y;
        return dist_y;
    }

    double distanceTo(Point anotherPoint) {
        double dist = Math.sqrt((x - anotherPoint.x) * (x - anotherPoint.x) + (y - anotherPoint.y) * (y - anotherPoint.y));
        return dist;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + "; y=" + y + "}";
    }

}

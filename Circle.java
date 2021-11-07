package com.company;

public class Circle {
    double x;
    double y;
    double radius;
    String c;

    Circle(Point center) {
        x = center.x;
        y = center.y;
        radius = 5;
    }

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    void getSurface() {
        double s = radius * radius * 3.14;
    }

    void petPerimeter() {
        double p = 2 * radius * 3.14;
    }

    void getDiameter() {
        double d = 2 * radius;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + "; y=" + y + "}, color=" + c;
    }
}

package com.company;

public class Rectangle {
    double x;
    double y;
    double edgeX;
    double edgeY;
    String c;

    Rectangle(Point v, double my_x, double my_y) {
        edgeX = my_x;
        edgeY = my_y;
        x = v.x;
        y = v.y;
    }

    void move(double dx, double dy) {
        edgeX += dx;
        edgeY += dy;
    }

    String setColor(String color) {
        c = color;
        return c;
    }

    double getSurface() {
        double s = edgeX * edgeY;
        return s;
    }

    double petPerimeter() {
        double p = (edgeX + edgeY) * 2;
        return p;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + "; y=" + y + "}";
    }
}
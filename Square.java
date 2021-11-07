package com.company;

public class Square {
    double height;
    double width;
    double x;
    double y;


    //Square(Point v; double edge) {
     //   height = edge;
      //  width = edge;
      //  x = v.x;
      //  y = v.y;
    //}

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

   // void setColor(String color) {
      //  c = color;
   // }

    @Override
    public String toString() {
        return "Point{x=" + x + "; y=" + y + "}";
    }

    void getSurface() {
        double s = height * height;
    }

    void petPerimeter() {
        double p = height * 4;
    }
}

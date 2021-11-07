package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math.*;

public class Triangle {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    double a;
    double b;
    double c;

    Triangle(Point v1, Point v2, Point v3) {
        x1 = v1.x;
        y1 = v1.y;
        x2 = v1.x;
        y2 = v1.y;
        x3 = v1.x;
        y3 = v1.y;
    }

    void move(double dx, double dy) {
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;
        x3 += dx;
        y3 += dy;
    }

    void getSurface() {
        double s = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2;
    }

    void petPerimeter() {
        a = Math.sqrt((x1 - x2) * (x1 - x2) + (y2 - y1) * (y2 - y1));
        b = Math.sqrt((x2 - x3) * (x2 - x3) + (y3 - y2) * (y3 - y2));
        c = Math.sqrt((x3 - x1) * (x3 - x1) + (y1 - y3) * (y1 - y3));
        double p = (a + b + c) / 2;
    }

    boolean isIsoceles() {
        if (a == b) {
            return true;
        }
        else if (a == c) {
            return true;
        }
        else if (b == c) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean isRectangle() {
        if (a * a + b * b == c * c) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean estEquilateral() {
        if (a == b) {
            if (b == c) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Point{(x=" + x1 + "; y=" + y1 + "), (x=" + x2 + "; y=" + y2 + "), (x=" + x3 + "; y=" + y3 + ")}";
    }
}

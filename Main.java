package com.company;

public class Main {
    public static void main(String[] args) {
        Square mySquare = new Square(new Point(3, 4), 10);
        System.out.println(mySquare.getSurface());
        System.out.println(mySquare.getPerimeter());
        System.out.println(mySquare.toString());
        System.out.println(mySquare.setColor());
    }
}

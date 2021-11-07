package com.company;

public class Main {
    public static void main(String[] args) {
        Point my_point = new Point(1, 2);
        System.out.println(my_point);
        System.out.println(my_point.length());
        System.out.println(my_point.angle());
        System.out.println(my_point.distanceTo(new Point(3, 4)));
        System.out.println(my_point.distanceXTo(new Point(5, 10)));
        System.out.println(my_point.distanceYTo(new Point(8, 5)));

        Rectangle my_rect = new Rectangle(my_point, 4, 3);
        System.out.println(my_rect.getSurface());





        Triangle my_tri = new Triangle(my_point, my_point, my_point);
        Circle my_circle = new Circle(new Point(3, 4));
        System.out.println(my_point);
        System.out.println(my_rect);
        System.out.println(my_tri);
        System.out.println(my_circle);
    }
}

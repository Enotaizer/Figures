package com.amisitysu.gmail;

public class Figures {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 3),
                new Square(2),
                new Circle(2.5),
                new Triangle(5, 6),
                new Square(4)
        };

        for (Shape shape : shapes) {
            System.out.println(shape + " has an area of " + shape.getArea());
        }
    }
}


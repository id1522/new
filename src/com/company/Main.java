package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 6, 5, 5);

        Figure figures[] = {triangle,circle, rectangle};
        for(Figure figure : figures) {
            System.out.println("Name " + figure.getName());
            System.out.println("Area " + figure.getArea());
            System.out.println("Square " + figure.getSquare());

        }
    }
}

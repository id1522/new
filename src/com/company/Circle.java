package com.company;

public class Circle implements Figure {

    private double radius;

   public Circle(double radius) {
        this.radius = radius;

    }
    public String getName(){
        return "Circle";
    }

    public double getArea() {
        return (radius * radius) * 3.14;

    }
    public double getSquare(){
        return radius * 2 * 3.14;
    }
}
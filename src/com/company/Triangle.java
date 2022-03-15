package com.company;

public class Triangle implements Figure {
    private double height;
    private double width;
    private double catetA;
    private double catetB;

    public Triangle  (double height, double width, double catetA, double catetB) {
        this.height = height;
        this.width = width;
        this.catetA = catetA;
        this.catetB = catetB;
    }

    public String getName() {
        return "Triangle";
    }

    public double getArea() {
        return (width / 2) * height;

    }

    public double getSquare() {
        return catetB + catetA + width;
    }
}

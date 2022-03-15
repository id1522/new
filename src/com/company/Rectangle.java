package com.company;

public class Rectangle implements Figure  {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public String getName(){
        return "Rectangle";
    }

        public double getArea(){
           return  height * width;


        }
        public double getSquare(){
        return (height + width)*2;

    }
}

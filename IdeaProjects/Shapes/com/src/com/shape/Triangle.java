package com.shape;

public class Triangle implements Shapes {
    float side1;
    float side2;
    float side3;
    float height;
    Triangle(float side1,float side2,float side3,float height)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.height=height;
    }

    @Override
    public double calculatePerimeter() {
        return this.side1+this.side2+this.side3;
    }

    @Override
    public double calculateArea() {
        return this.side1*this.height;
    }
}

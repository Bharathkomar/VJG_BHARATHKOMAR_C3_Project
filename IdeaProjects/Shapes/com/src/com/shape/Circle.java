package com.shape;

public class Circle implements Shapes {

double radius;
Circle(double radius)
{
   this.radius=radius;
}
    @Override
    public double calculatePerimeter() {
        return PI*2*radius;
    }

    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }
}

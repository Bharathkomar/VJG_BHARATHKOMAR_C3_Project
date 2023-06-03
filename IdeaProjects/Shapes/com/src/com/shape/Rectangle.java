package com.shape;

public class Rectangle implements Shapes {
float length;
float breadth;
    public Rectangle(float length, float breadth) {

this.length=length;
this.breadth=breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(this.length+this.breadth);
    }

    @Override
    public double calculateArea() {
        return this.length*this.breadth;
    }
    public void showdetails()
    {System.out.println("It is a rectangle of "+this.length+this.breadth);}
}

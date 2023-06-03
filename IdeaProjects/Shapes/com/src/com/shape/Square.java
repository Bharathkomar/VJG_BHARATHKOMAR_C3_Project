package com.shape;

public class Square extends Rectangle {
    public Square(float side) {
        super(side, side);
    }

    @Override
    public double calculatePerimeter() {
        return 2*(this.length+this.breadth);
    }

    @Override
    public double calculateArea() {
        return this.length*this.breadth;
    }
}

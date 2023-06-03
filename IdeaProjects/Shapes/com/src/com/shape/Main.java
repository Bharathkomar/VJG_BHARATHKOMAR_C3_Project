package com.shape;


    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            Circle c1=new Circle(10.0);
            Triangle T1=new Triangle(10,5,10,8);
            Rectangle R1=new Rectangle(10,15);
            Square S1=new Square(10);
            System.out.println("Circle");
            System.out.println("Area: "+c1.calculateArea());
            System.out.println("Perimeter: "+c1.calculatePerimeter());
            System.out.println("Triangle");
            System.out.println("Area: "+T1.calculateArea());
            System.out.println("Perimeter: "+T1.calculatePerimeter());
            System.out.println("Rectangle");
            System.out.println("Area: "+R1.calculateArea());
            System.out.println("Perimeter: "+R1.calculatePerimeter());
            System.out.println("Square");
            System.out.println("Area: "+S1.calculateArea());
            System.out.println("Perimeter: "+S1.calculatePerimeter());



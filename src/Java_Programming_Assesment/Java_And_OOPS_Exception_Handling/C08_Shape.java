package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

import java.util.*;

/*Implement an abstract class "Shape" with an abstract method "getArea()".
Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.*/

/*
Input
Rectangle: length=5, width=3; Circle: radius=4

Output:
Rectangle Area: 15.0 Circle Area: 50.26548245743669*/

public abstract class C08_Shape {
    double area;
    public abstract double getArea();
}

class Rectangle extends C08_Shape{

    int length;
    int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        area=length*width;
        return area;
    }
}

class Circle extends C08_Shape{

    int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        area= Math.PI * radius*radius;
        return area;
    }
}

class Main{
    public static void main(String[] args) {
        Rectangle r= new Rectangle(5,3);
        System.out.println("Rectangle Area: "+r.getArea());

        Circle c=new Circle(4);
        System.out.println("Circle Area: "+c.getArea());
    }
}

package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Vehicle Inheritance Hierarchy
Create a Vehicle base class with start() method.
Create Car and Bike subclasses that override the start() method.*/

/*Input:
Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each*/

/*Output:
Car engine starts with a roar! Bike engine starts with a purr!*/

public class C06_Vehicle {
    public void start()
    {
        System.out.println("Vehicle makes sound");
    }

    public static void main(String[] args) {
        C06_Vehicle[] vehicles = {new Car(), new Bike()};
        for(C06_Vehicle v:vehicles)
        {
            v.start();
        }
    }
}

class Car extends C06_Vehicle{
    public void start()
    {
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends C06_Vehicle{
    public void start()
    {
        System.out.println("Bike engine starts with a purr!");
    }
}

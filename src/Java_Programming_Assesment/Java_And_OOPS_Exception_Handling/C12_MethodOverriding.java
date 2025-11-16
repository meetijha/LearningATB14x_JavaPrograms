package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Method Overriding Demo
Write a program to demonstrate method overriding
by creating parent and child classes with the same method signature.*/

/*Input:
Parent and Child objects calling display() method*/

/*Output:
Parent class display method Child class display method*/

public class C12_MethodOverriding {

    public static void main(String[] args) {
        Parent p=new Parent();
        p.display();
        Parent p1=new Child();// method overriding
        p1.display();
    }
}

class Parent {
    public void display()
    {
        System.out.println("Parent class display method ");
    }
}

class Child extends Parent {
    public void display()
    {
        System.out.println("Child class display method");
    }
}
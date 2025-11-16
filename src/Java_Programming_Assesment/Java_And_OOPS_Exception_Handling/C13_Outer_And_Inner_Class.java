package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Outer and Inner Class Implementation
Create a class "Outer" with an inner class "Inner".
Access the inner class from the outer class and demonstrate their interaction.*/

/*Input:
Outer class with variable x=10, Inner class accessing x*/

/*Output:
Outer class variable x: 10 Inner class accessing outer variable: 10*/

public class C13_Outer_And_Inner_Class {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();// way to instantiate inner class
    }
}

 class Outer {
    int x = 10;

    Outer()
    {
        System.out.println("Outer class with variable x: "+x);
    }
    class Inner {
        Inner() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }
}
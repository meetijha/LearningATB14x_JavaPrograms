package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;


/*Calculator Method Overloading
Write a program to demonstrate method overloading by creating multiple "add" methods
with different parameters.*/

/*Input:
add(5, 3), add(2.5, 3.7), add(1, 2, 3)*/

/*Output:
Integer addition: 8 Double addition: 6.2 Three integers addition: 6*/

public class C11_Calculator {

// Using Varargs to accept any number of int arguments
int add(int... numbers)
{
    int sum=0;
    for(int n:numbers)
    {
        sum=sum+n;
    }
    return sum;
}
// Using Varargs to accept any number of double arguments
    double add(double... numbers)
    {
        double sum=0;
        for(double n:numbers)
        {
            sum=sum+n;
        }
        return sum;
    }

    public static void main(String[] args) {
    C11_Calculator c=new C11_Calculator();
        System.out.println("Integer addition: "+c.add(5,3));
        System.out.println("Double addition: "+c.add(2.5, 3.7));
        System.out.println("Three integers addition: "+c.add(1, 2, 3));
    }
}

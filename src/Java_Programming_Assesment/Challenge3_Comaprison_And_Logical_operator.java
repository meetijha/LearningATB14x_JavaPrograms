package Java_Programming_Assesment;

/*Comparison and Logical Operators
Write a program that demonstrates comparison and logical operators.

**Requirements:**
        - Use comparison operators (==, !=, <, >, <=, >=)
- Use logical operators (&&, ||, !)
- Print boolean results with explanatory messages*/

public class Challenge3_Comaprison_And_Logical_operator {
    public static void main(String[] args) {

    // Comparison operators
        int a=10;
        int b=5;
    if(a==b) System.out.println("Both a and b are equal");
    if(a!=b) System.out.println("a and b are not equal");
    if(a<b) System.out.println("a is less than b");
    if(a>b) System.out.println("a is greater than b");
    if(a>=b) System.out.println("a is graeter than equal to b");
    if(a<=b) System.out.println("a is less than equal to b");

    // Logical Operators
    if(true && true) System.out.println("Logical AND is true only when both operands are true");
    if(false || true) System.out.println("Logical OR is true even if one operand is true");
    if(!false) System.out.println("Not of false is TRUE");
    }
}

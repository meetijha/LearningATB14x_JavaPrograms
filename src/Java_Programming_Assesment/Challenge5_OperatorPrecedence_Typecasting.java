package Java_Programming_Assesment;

/*Operator Precedence and Type Casting
Write a program that demonstrates operator precedence and type casting in Java.

        **Requirements:**
- Show operator precedence with complex expressions
- Demonstrate implicit and explicit type casting
- Print results with explanations*/
public class Challenge5_OperatorPrecedence_Typecasting {
    public static void main(String[] args) {

  /*    PRECEDENCE.................
  () - Parentheses
  *, /, % - Multiplication, Division, Modulus
  +, - - Addition, Subtraction
  >, <, >=, <= - Comparison
  ==, != - Equality
  && - Logical AND
  || - Logical OR
  = - Assignment       */

        int a1 = 10;
        int b1 = 5;
        int c1 = 2;
        boolean x = true;
        boolean y = false;

        // Complex expression combining various operators
        int result = a1 + b1 * c1++ / --a1 % 3 - (x && y ? 10 : 20) + (a1 << 1);

        System.out.println("Final Result: " + result);
        System.out.println("Value of a1 after evaluation: " + a1);
        System.out.println("Value of c1 after evaluation: " + c1);

 // TYPE CASTING
        int a=10;
        float b=3.5f;

        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println("Implicit casting");
        float d= a+b;
        System.out.println("float d= a+b :"+d);

        System.out.println("Explicit casting");
        int e= a+ (int)b;
        System.out.println("int e= a+ (int)b: "+e);

        // a=b;// Gives error as float b is considered bigger. Implicit typecasting not happening.
        b=a; // Implicit typecasting done.
        System.out.println("b= "+b);

        short s=0;
        a=s;// Implicit typecasting happening as short is smaller than int
        System.out.println("a= "+a);

        int c= Integer.parseInt("20"); //Explicit typecasting .

    }
}

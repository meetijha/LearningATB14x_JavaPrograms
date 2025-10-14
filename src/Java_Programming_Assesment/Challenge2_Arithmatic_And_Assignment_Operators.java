package Java_Programming_Assesment;

/*Create a Java program that demonstrates various arithmetic and assignment operators.

**Requirements:**
        - Use +, -, *, /, % operators
- Demonstrate assignment operators (=, +=, -=, *=, /=)
- Show the results of each operation*/

public class Challenge2_Arithmatic_And_Assignment_Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("a / b =" + (a/b)); // Division
        System.out.println("a * b =" + (a*b)); // Multiplication
        System.out.println("a + b = " + (a+b));  // Addition
        System.out.println("a - b = " + (a-b));  // Subtraction
        System.out.println("a % b =" + (a%b)); // Modulus

        // Assignment Operator
        a += 5;  // a = a + 5
        System.out.println("a after += 5 : " + a);
        a -= 3;  // a = a - 3
        System.out.println("a after -= 3 : " + a);
        a *= 2;  // a = a * 2
        System.out.println("a after *= 2 : " + a);
        a /= 5;  // a = a / 5
        System.out.println("a after /= 5 : " + a);

    }
}

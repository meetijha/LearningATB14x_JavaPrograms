package Java_Programming_Assesment;

import java.util.Scanner;

/*Simple Calculator (Switch Statement)
Write a program to create a simple calculator using switch statement.

**Requirements:**
        - Read two numbers and an operator (+, -, *, /)
- Use switch statement to perform the operation
- Handle division by zero
- Display the result*/
public class Challenge10_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char op;
        double result = 0;
        System.out.println("Enter first number");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        num2 = scanner.nextDouble();
        System.out.println("Enter the operation you want to perform + - * /");
        op = scanner.next().charAt(0);

        switch (op) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                } else
                    result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }


        System.out.println("Result :" + result);
        scanner.close();
    }
}

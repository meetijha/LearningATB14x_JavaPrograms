package Java_Programming_Assesment;

import java.util.Scanner;

/*Factorial Calculator (While Loop)
Create a program to calculate factorial of a number using while loop.

**Requirements:**
        - Read a positive integer from user input
- Use while loop to calculate factorial
- Handle edge case for 0! = 1
        - Use appropriate data type to handle large results*/
public class Challenge12_Factorial_While_Loop {
    public static void main(String[] args) {
        long result = 1l;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scanner.nextInt();
        if (num == 0)
            result = 1;
        else if (num > 0) {
            int i = num;
            while (i > 1)
            {    result = result * i--;}

        } else {
            System.out.println("Enter a positive number");
            return;
        }
        System.out.println("Factorial of " + num + " is: " + result);
        scanner.close();
    }
}

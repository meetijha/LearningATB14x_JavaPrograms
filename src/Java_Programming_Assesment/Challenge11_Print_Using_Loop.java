package Java_Programming_Assesment;

import java.util.Scanner;
/*Print Numbers Using For Loop
Write a program to print numbers from 1 to N using a for loop.

**Requirements:**
        - Read the value of N from user input
- Use for loop to print numbers from 1 to N
- Print numbers in a single line separated by spaces*/
public class Challenge11_Print_Using_Loop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N");
        int n=scanner.nextInt();

        for(int i=1;i<=n;i++)
            System.out.print(i+" ");
        scanner.close();
    }
}

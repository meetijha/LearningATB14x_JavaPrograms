package Tasks;

import java.util.Scanner;

public class Q9_MaxOF2Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();

        if(num1==num2)
            System.out.println("Both numbers are equal");
        else
            System.out.println("Max out of 2 numbers is " +(num1 > num2 ? num1 : num2));

        scanner.close();
    }
}

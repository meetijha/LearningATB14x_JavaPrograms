package Tasks;

import java.util.Scanner;

// Check if a Triangle is Valid Based on Three Sides.
public class Q022_ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of 1st side ");
        int a=scanner.nextInt();
        System.out.println("Enter length of 2nd side ");
        int b=scanner.nextInt();
        System.out.println("Enter length of 3rd side ");
        int c=scanner.nextInt();

        if((a+b>c) || (b+c>a) ||(a+c)>b)
            System.out.println("It's a valid triangle");
        else System.out.println("Triangle not valid");
        scanner.close();
    }
}

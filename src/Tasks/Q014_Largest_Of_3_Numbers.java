package Tasks;
//Find the Largest of Three Numbers.

import java.util.Scanner;

public class Q014_Largest_Of_3_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number ");
        int n2 = scanner.nextInt();
        System.out.println("Enter 3rd number ");
        int n3 = scanner.nextInt();

        // Solution 1
        int largest = n1 > n2 ? (n1 >= n3 ? n1 : n3) : (n2 >= n3 ? n2 : n3);
        //Solution 2
        int largest1 = (n1 >= n2 && n1 >= n3) ? n1 : (n2 >= n3) ? n2 : n3;

        System.out.println("Largest among " + n1 + " " + n2 + " " + n3 + " is " + largest);
        System.out.println("Largest among " + n1 + " " + n2 + " " + n3 + " is " + largest1);

        scanner.close();
    }
}


package Tasks;

import java.util.Scanner;

//Find the Smallest of Two Numbers.
public class Q015_Smallest_Of_2_Numbers {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number ");
        int n2 = scanner.nextInt();

        int smallest= (n1<n2)? n1 :n2;

        System.out.println("Smallest among 2 numbers is "+smallest);
    }

}

package Tasks;

import java.util.Scanner;

public class Q016_Smallest_Of_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number ");
        int n2 = scanner.nextInt();
        System.out.println("Enter 3rd number ");
        int n3 = scanner.nextInt();

        int smallest = (n1<=n2 && n1<=n3)?n1 : (n2<=n3)?n2 :n3;

        System.out.println("Smallest among 3 numbers is "+smallest);
    }
}

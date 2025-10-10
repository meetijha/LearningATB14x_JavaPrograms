package Tasks;

import java.util.Scanner;

public class Q11_Legal_Age_To_Vote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=scanner.nextInt();

        if(age>=21) System.out.println("Person is eligible to vote");
        else System.out.println("Person is not eligible to vote");

        scanner.close();
    }
}

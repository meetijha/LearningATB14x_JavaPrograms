package Tasks;

import java.util.Scanner;

//Check if a Year is a Leap Year.
public class Q017_LeapYear {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year");
        int year =scanner.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0))
            System.out.println("Its a leap year");
        else System.out.println("Not a leap year");
    }
}

package Java_Programming_Assesment;

import java.util.Scanner;

/*Leap Year Checker
Write a program to check if a given year is a leap year.

**Requirements:**
        - A year is leap if it's divisible by 4
        - Exception: if divisible by 100, it's not leap unless also divisible by 400
        - Use logical operators in conditions*/

public class Challenge8_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        {
            System.out.println("Enter year");
            int year =scanner.nextInt();

            if((year%4==0 && year%100!=0)|| (year%400==0))
                System.out.println("Its a leap year");
            else System.out.println("It's not a leap year");
        }
    }
}

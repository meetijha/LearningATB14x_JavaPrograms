package Tasks;
/*
Find if a Person is Senior Citizen Based on Age.
        :- take the age input from the user.
Implement Age Category Logic:
Define the criteria for different age categories:
Child: Age 0 to 12
Teenager: Age 13 to 19
Adult: Age 20 to 64
Senior Citizen: Age 65 and older
*/

import java.util.Scanner;

public class Q033_Senior_Citizen_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age<0)
            System.out.println("Not a valid age");
        if(age>=0 && age<=12)
            System.out.println("Child");
        else if(age<=19)
            System.out.println("Teenager");
        else if(age<=64)
            System.out.println("Adult");
        else if(age>=65)
            System.out.println("Senior citizen");
    }
}

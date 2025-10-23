package Tasks;

/*
Find if a Person Can Travel Based on Visa Status and Age.
take the input from the user for
Age (integer).
Visa Status (String or boolean).
Check Eligibility:
        :- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
Validation Criteria
Age: - Must be a non-negative integer.
        :- Should be greater than or equal to 18 to be eligible to travel.
Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
        :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
       */

import java.util.Scanner;

public class Q029_TravelVisa_BasedOn_Status_And_Age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (isAgeValid(sc) && isVisaValid(sc)) {
            System.out.println("Allowed to travel");
        } else {
            System.out.println("Not allowed to travel");
        }
    }

    public static boolean isAgeValid(Scanner sc)
    {
        System.out.println("Enter a valid age . Age should be greater than or equal to 18");
        int age=sc.nextInt();
        if(age<0)
        {
            System.out.println("Enter a valid age");
            return false;
        }
        if(age<18)
        {
            System.out.println("Too young !");
            return false;
        }
        else return true;
    }

    public static boolean isVisaValid(Scanner sc)
    {
        System.out.println("Is Visa Valid? Enter Y for Valid and I for invalid");
        char visaStatus= sc.next().charAt(0);
        if(visaStatus== 'Y' || visaStatus=='y')
        {
            return true;
        }
        else if(visaStatus=='I' || visaStatus=='i')
        {
            return false;
        }
        else
        {
            System.out.println("Please enter valid status");
            System.exit(1);
            return false;
        }
    }
}

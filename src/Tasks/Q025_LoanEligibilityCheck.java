package Tasks;

/*
Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
    * Take the below User info and store it into the variables:
Age (integer)
Salary (double or float)
Credit Score (integer)
Age Validation:
        :- Check if the age is a positive integer.
        :- Ensure the age is at least 18 years old.
        :- Max age can be 80.

Salary Validation:
        :- Check if the salary is a positive number.
        :- Define a minimum salary threshold (e.g., 30,000).

Credit Score Validation:
        :- Check if the credit score is a positive integer.
        :- Define a minimum credit score threshold (e.g., 650).
        :- Max credit score threshold (e.g., 850).

18 )  Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.

Implement Rate Structure:
Define the rate structure for calculating the bill based on the number of units consumed.
            :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit

19)  Calculate Bonus Based on Salary and Years of Experience.
          :- take the salary and Year info from the User.

Implement Bonus Calculation Logic:
Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
*/


import java.util.Scanner;

public class Q025_LoanEligibilityCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age =getValidAge(sc);
        float salary= getvalidSalary(sc);
        int creditScore =getValidCreditScore(sc);
        System.out.println("Loan Approved!");
        sc.close();
    }

    public static int getValidAge(Scanner sc) {
        System.out.println("Enter age");
        int age = 0;
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("Age cannot be less than 0");
                System.exit(1);
            } else if (age < 18) {
                System.out.println("Person is too young to get loan");
                System.exit(1);
            } else if (age > 80) {
                System.out.println("Person is too old to get loan");
                System.exit(1);
            }
        } else {
            System.out.println("Enter a valid age");
            System.exit(1);
        }
        return age;
    }

    public static float getvalidSalary(Scanner sc) {
        float sal = 0;
        System.out.println("Enter salary");
        if (sc.hasNextFloat()) {
            sal = sc.nextFloat();
            if (sal < 0) {
                System.out.println("Salary is not valid");
                System.exit(1);
            } else if (sal < 30000) {
                System.out.println("Salary is too low to get a loan");
                System.exit(1);
            }

        } else {
            System.out.println("Enter a valid salary");
            System.exit(1);
        }
        return sal;
    }

    public static int getValidCreditScore(Scanner sc)
    {
        int creditScore=0;
        System.out.println("Enter Credit score");
        if(sc.hasNextInt())
        {
            creditScore=sc.nextInt();
            if(creditScore<0 || creditScore>850)
            {
                System.out.println("Enter a valid credit score");
                System.exit(1);
            }
            else if (creditScore<650)
            {
                System.out.println("Credit score is too low to get a loan");
                System.exit(1);
            }

        }
        else{
            System.out.println("Credit score is not valid");
            System.exit(1);
        }
        return creditScore;
    }

}

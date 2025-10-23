package Tasks;

/*
Calculate Bonus Based on Salary and Years of Experience.
          :- take the salary and Year info from the User.

Implement Bonus Calculation Logic:
Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
        :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
*/

import java.util.Scanner;

public class Q027_BonusCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter current salary");
        float sal=sc.nextFloat();
        System.out.println("Enter years of experience in years");
        int exp=sc.nextInt();

        System.out.println("Your bonus is Rs "+calculateBonus(sal,exp));
    }

    public static float calculateBonus(float sal, int exp)
    {
        float bonus=0;
        if(exp<1) bonus=0;
        else if (exp <3) bonus= sal *1.05f;
        else if(exp<6) bonus =sal*1.1f;
        else bonus =sal*1.15f;
        return bonus;
    }
}

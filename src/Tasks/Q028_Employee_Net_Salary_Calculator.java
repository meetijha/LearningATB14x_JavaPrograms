package Tasks;

/*Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
HRA= 10% of basic
DA= 8% of Basic
Gross salary = Basic +HRA+ DA
*/

import java.util.Scanner;

public class Q028_Employee_Net_Salary_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Annual Basic Salary of the Employee:");
        double basic = scanner.nextDouble();

        double hra = 0.10 * basic;  // 10% of basic
        double da = 0.08 * basic;   // 8% of basic
        double grossSalary = basic + hra + da;

        double tax = calculateTax(grossSalary);
        double netSalary = grossSalary - tax;

        System.out.println("Employee Salary Details:");
        System.out.println("Basic salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax Deduction: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }

    public static double calculateTax(double grossSalary)
    {
        double tax=0;

        if(grossSalary<=400000)
          tax=0;
        else if(grossSalary<=800000)
            tax=grossSalary*0.05; //5%
        else if(grossSalary<=1200000)
            tax=grossSalary*0.1; //10%
        else if(grossSalary<=1600000)
            tax=grossSalary*0.15; //15%
        else if(grossSalary<=2000000)
            tax=grossSalary*0.2;
        else if(grossSalary<=2400000)
            tax=grossSalary*0.25;
        else tax=grossSalary*0.3;

        return tax;
    }
}

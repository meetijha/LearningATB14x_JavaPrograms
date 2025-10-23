package Tasks;

/*
Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.
Implement Rate Structure:
Define the rate structure for calculating the bill based on the number of units consumed.
        :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit
            */

import java.util.Scanner;

public class Q026_ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = getNumberOfUnits(sc);
        float bill = calculateElectricBill(units);
        System.out.println("Your bill is Rs " + bill);
    }

    public static int getNumberOfUnits(Scanner sc) {
        int units = 0;
        System.out.println("Enter Electricity units");
        if (sc.hasNextInt()) {
            units = sc.nextInt();
            if (units < 0) {
                System.out.println("Unit not valid");
                System.exit(1);
            }

        } else {
            System.out.println("Enter valid input!");
        }
        return units;
    }

    public static float calculateElectricBill(int units) {
        float bill = 1.0f;

        if (units <= 100) {
            bill = units * 0.5f;
        } else if (units <= 200) {
            bill = 100 * 0.5f + (units - 100) * 0.75f;
        } else if (units <= 300) {
            bill = 100 * 0.5f + 100 * 0.75f + (units - 200) * 1.2f;
        } else if (units > 300) {
            bill = 100 * 0.5f + 100 * 0.75f + 100 * 1.2f + (units - 300) * 1.5f;
        }

        return bill;
    }
}

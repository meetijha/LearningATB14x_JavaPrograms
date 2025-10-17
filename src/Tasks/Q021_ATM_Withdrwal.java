package Tasks;

/*ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
Steps to Write the Program

1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
    The amount should be greater than zero.
    The amount should be a multiple of 100 (common ATM rule).
    The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.*/

import java.util.Scanner;

public class Q021_ATM_Withdrwal {
    public static void main(String[] args) {
        int balance=10000;
        Scanner scanner=new Scanner(System.in);
        int withdrwalAmount;
        System.out.println("Enter the amount to withdraw ");
       if(scanner.hasNextInt())
       {
           withdrwalAmount= scanner.nextInt();
           if(withdrwalAmount>0)
           {
              if(withdrwalAmount%100==0)
              {
                  if(withdrwalAmount<=balance)
                  {
                      balance=balance-withdrwalAmount;
                  }
                  else System.out.println("You dont have sufficient balance");
              }
              else System.out.println("Enter amount in multiples of 100");
           }
           else System.out.println("Enter amount more than 0");
       }
        else {System.out.println("Enter a valid amount");
        return;}

        System.out.println("Balance = "+balance);
    }
}

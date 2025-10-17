package Tasks;

import java.util.Scanner;

public class Q020_Prime_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num= scanner.nextInt();

        if(num ==1) System.out.println("Prime number");
        else
        {
            for(int i=2;i<= Math.sqrt(num);i++)
            {
                if(num%i==0) {
                    System.out.println("Not a prime number");
                    return;
                }

            }
            System.out.println("Prime Number");
        }
    }
}

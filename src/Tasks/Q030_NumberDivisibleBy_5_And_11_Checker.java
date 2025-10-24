package Tasks;

import java.util.Scanner;
// Check if a number is divisible by 5 and 11
public class Q030_NumberDivisibleBy_5_And_11_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");

        int num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("Number is divisible by both 5 and 11");
        }
        else{
            System.out.println("Not divisible by 5 and 11");
        }
    }
}

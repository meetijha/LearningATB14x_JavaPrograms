package Tasks;

import java.util.Scanner;

public class Q023_Pallindrome_Number_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num =sc.nextInt();

        if(num==reverseNum(num))
            System.out.println("Pallindrome number");

        else System.out.println("Not pallindrome");
    }

    public static int reverseNum(int num)
    {
        int reverse=0;
        while(num!=0)
        {
            reverse=reverse*10+num%10;
            num=num/10;
        }

        return reverse;
    }
}

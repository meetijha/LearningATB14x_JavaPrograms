package Tasks;

import java.util.Scanner;

public class Q008_NumberIs_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();

        if(num%2==0) System.out.println("Number is Even");
        else System.out.println("Number is odd");

        scanner.close();
    }
}

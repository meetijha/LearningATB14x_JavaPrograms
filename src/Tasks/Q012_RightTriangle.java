package Tasks;

import java.util.Scanner;

/*Take input from user about n and print the triangle pattern.Eg n=3
        *
        **
        ****/

public class Q012_RightTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the depth of triangle");
        int n=scanner.nextInt();

        for(int i=0;i<n;i++)// Traversing rows
        {
            for(int j=0;j<=i;j++)// traversing cloulmn
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

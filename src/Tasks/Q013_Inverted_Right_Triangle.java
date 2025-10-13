package Tasks;

import java.util.Scanner;
/*Take input from user about n and print the triangle pattern.
n=3
***
**
*

 */

public class Q013_Inverted_Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the depth of triangle");
        int n= scanner.nextInt();

        for(int i=n;i>=1;i--)// Traversing rows
        {
            for (int j=i;j>=1;j--)//Traversing columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

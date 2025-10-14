package Java_Programming_Assesment;

import java.util.Scanner;

/*Star Pattern Printing
Create a program to print various star patterns using nested loops.

**Requirements:**
        - Print a right triangle pattern of stars
- Print a pyramid pattern of stars
- Use nested loops for pattern generation
- Make patterns scalable based on input size*/
public class Challenge14_StarPattern_Printing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the depth of the pattern");
        int n=scanner.nextInt();

        System.out.println("Right Triangle:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pyramid: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=(2*n-1);j++)
            {
                if(j<((2*n-1)/2-i) || j>((2*n-1)/2+i))
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}

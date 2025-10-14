package Java_Programming_Assesment;

/*Number Classification
Write a program to check if a number is positive, negative, or zero.

**Requirements:**
        - Read an integer from user input
- Use if-else statements to classify the number
- Print appropriate message for each case*/

public class Challenge7_Largest_Of_3_Numbers {
    public static void main(String[] args) {

        int[][] arr1= {
                {15,27,19},
                {10,10,8}
        };

        for(int[] a:arr1)
        {
            int n1=a[0], n2=a[1],n3=a[2];
            int largest=n1>n2? (n1>n3?n1:n3): (n2>n3?n2:n3);
            System.out.println("Largest among "+n1+" "+n2+" "+n3+"is "+largest);
        }


    }
}

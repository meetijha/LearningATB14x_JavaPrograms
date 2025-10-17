package Java_Programming_Assesment;

/*Find Largest of Three Numbers
Create a program to find the largest among three numbers using if-else statements.

**Requirements:**
- Read three integers from user input
- Use nested if-else or if-else if statements
- Handle cases where numbers might be equal*/

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

            /*Can use this logic as well
            int largest1=(n1>=n2 && n1>=n3)? n1 :(n2>=n1 && n2>=n3 ?n2:n3);
            System.out.println("Largest among "+n1+" "+n2+" "+n3+"is "+largest1);

            In case of 4 numbers
             int largest = (n1>=n2 && n1>=n3 && n1>=n4) ? n1
                           :(n2>=n3 && n2>==n4)?n2
                           :(n3>=n4)?n3:n4;

             */
        }


    }
}

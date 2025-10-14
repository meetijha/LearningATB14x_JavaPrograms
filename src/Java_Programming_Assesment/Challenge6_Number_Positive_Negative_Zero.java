package Java_Programming_Assesment;

/*Number Classification
Write a program to check if a number is positive, negative, or zero.

**Requirements:**
        - Read an integer from user input
- Use if-else statements to classify the number
- Print appropriate message for each case*/

public class Challenge6_Number_Positive_Negative_Zero {
    public static void main(String[] args) {
        int[] arr={15,-7,0};

        for(int i:arr)
        {
            if(i>0) System.out.println(i+ " is positive");
            else if(i==0) System.out.println(i+ " is zero");
            else System.out.println(i +" is Negative");
        }


    }
}

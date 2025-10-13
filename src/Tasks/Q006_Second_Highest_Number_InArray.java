package Tasks;

import java.util.Scanner;

/*I want you to find the second maximum number in this array
int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};// O/P → 34 ,don’t use sorting function. */

public class Q006_Second_Highest_Number_InArray {
    public static void main(String[] args) {
        int arr[]=takeArrayInput();
        System.out.println("Second highest number in this array is " + getSecongHighestNumber(arr));
    }

    public static int getSecongHighestNumber(int[] arr) {
        int secHighest = Integer.MIN_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int a : arr) {
            System.out.println(a);
            if (a > secHighest && a > highest) {
                secHighest = highest;
                highest = a;

            } else if (a > secHighest && a !=highest) {
                secHighest = a;
            }
        }
        return secHighest;
    }

    public static int[] takeArrayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter element -->" + i);
            arr[i] = scanner.nextInt();

        }
        scanner.close();
        return arr;
    }

}


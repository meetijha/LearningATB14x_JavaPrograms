package Tasks;

import java.util.Scanner;
//Program to find first letter of each word in string
public class Q5_First_LetterOfEach_Word_In_String {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String str= scanner.nextLine();
        printFirstLetterOfEachWord(str);
        scanner.close();
    }

    public static void printFirstLetterOfEachWord(String str)
    {
        String[] strArray=str.split(" ");
        System.out.println("Printing first letter of each word");
        for(String s:strArray)
        {
            System.out.println(s.charAt(0));
        }
    }
}

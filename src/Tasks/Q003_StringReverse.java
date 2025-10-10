package Tasks;

import java.util.Scanner;
//program to reverse a string
public class Q003_StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scanner.nextLine();
        System.out.println("Reversed string with optimised loop is \n:" + reverse(str));
        System.out.println("Reverse string with while loop is \n:"+reverseWithWhile(str));
    }

    public static String reverse(String str) {

        // Reversing with half the loop size
        StringBuilder string = new StringBuilder(str);
        char temp;
        int strLength=str.length();
        for(int i=0;i<strLength/2;i++)
        {
            temp=str.charAt(i);
            string.setCharAt(i, string.charAt(str.length()-1-i));
            string.setCharAt(strLength-1-i,temp);
        }
        return string.toString();
    }

    public static String reverseWithWhile(String str)
    {
        String reversedString="";
        int i=str.length()-1;
        while(i>=0)
        {
            reversedString=reversedString+ str.charAt(i);
            i--;
        }

        return reversedString;
    }
}


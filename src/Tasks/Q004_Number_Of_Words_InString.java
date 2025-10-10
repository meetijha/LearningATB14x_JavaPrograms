package Tasks;

import java.util.Scanner;
//Program to find number of word ina string

public class Q004_Number_Of_Words_InString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scanner.nextLine();

        System.out.println("Number of words in the string is "+countNumberOfwords(str));
        System.out.println("Number of words without split "+countNumberOfwordsWithoutSplit(str));
        scanner.close();
    }

    public static int countNumberOfwords(String str)
    {
        int count =0;
        String[] wordArray=str.split(" ");
        for(String s:wordArray)
        {
        count++;
        }
        return count;
    }

    public static int countNumberOfwordsWithoutSplit(String str)
    {
        int count =0;
        char[] wordArray=str.toCharArray();
        for(int i=0;i<wordArray.length-1;i++)
        {
            if(wordArray[i]==' ')
            count++;
        }
        return count+1;
    }
}

package Tasks;

import java.util.Scanner;
/*
Convert Days into Years, Months, and Days.
       :- Take the Days Input from the User
Define the conversion logic:
        :- Assume 1 year = 365 days.
        :- Assume 1 month = 30 days
        :- Convert the Days into Years, Month and days and Print it.
        if you input 1000 days, the output of the program would be:
        2 years, 9 months, and 0 days.
        */

public class Q031_Days_Into_Year_Month_And_Days_Converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days");
        int totalDays=sc.nextInt();
        int year =0;
        int month=0;
        int days=0;
        if(totalDays>0)
        {
            year=totalDays/365;
            totalDays=totalDays%365;

            month=totalDays/30;
            totalDays=totalDays%30;
        }
        System.out.println(year+" Years, "+ month+" months and "+totalDays+" days.");
    }
}

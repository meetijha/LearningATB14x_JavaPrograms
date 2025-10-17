package Tasks;

import java.util.Scanner;

/*Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)

        1️⃣ Take user input for marks (Use Scanner class).
        2️⃣ Check the validity of marks (ensure they are between 0 and 100).
        3️⃣ Use if-else-if conditions to determine the grade based on marks.
        4️⃣ Display the grade as output.

📌 Grading Criteria (Example)

Marks Range Grade

90 - 100   A+
80 - 89    A
70 - 79    B
60 - 69    C
50 - 59    D
40 - 49    E
Below 40   Fail*/
public class Q018_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int marks;
        String grade;
        System.out.println("Enter marks ");
        marks =scanner.nextInt();

        if(marks>=0 && marks<=100)
        {
            if(marks>=90) grade="A+";
            else if (marks>=80) grade="A";
            else if(marks >=70) grade="B";
            else if (marks>=60) grade ="C";
            else if (marks >=50) grade ="D";
            else if (marks >=40) grade ="E";
            else grade="F";
            }
        else {
            System.out.println("Enter valid marks!");
            return;
        }
        System.out.println("Grade ="+grade);
    }
}

package Java_Programming_Assesment;

/*Multiplication Table (Nested Loops)
Write a program to print multiplication tables using nested loops.

        **Requirements:**
        - Print multiplication tables for numbers 1 to 5
        - Each table should show multiplications from 1 to 10
        - Use nested for loops
- Format output clearly*/
public class Challenge13_MultiplicationTable_NestedLoop {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++)
        {
            System.out.println("TABLE OF "+i+"\n____________________");
            for(int j=1;j<=10;j++)
            {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
}

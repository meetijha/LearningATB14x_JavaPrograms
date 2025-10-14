package Java_Programming_Assesment;

/*Increment and Decrement Operators
Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.

        **Requirements:**
        - Show the difference between ++i and i++
        - Show the difference between --i and i--
        - Print values before and after operations*/

public class Challenge4_Increment_decrement_Operators {
    public static void main(String[] args) {
        int i= 5;
        System.out.println("Initially i= "+i);

        //pre increment
        System.out.println("++i= "+ ++i); //a is incremented and then printed
        System.out.println("i= "+i);// a is already incremented

        //Post increment
        System.out.println("i++= "+i++); //a is printed and then incremented
        System.out.println("i= "+i); //current value of a after post increment

        //pre increment
        System.out.println("--i= "+ --i); //a is decremented and then printed
        System.out.println("i= "+i);// a is already decremenetd

        //Post decrement
        System.out.println("i--= "+i--); //a is printed and then decremented
        System.out.println("i= "+i);//current value of a

    }
}

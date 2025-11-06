package ex_27_Exceptions;

import java.util.Scanner;

public class LabThrow {
    public static void main(String[] args) throws CustomException{
        Scanner scanner = new Scanner(System.in);
        if(!scanner.next().equalsIgnoreCase("meeti")){

           /* Below statement can also be used as we have already defined that main throws
            custom exception */
            //throw new CustomException("Bhag yaha se not allowed!");
            throw new ArithmeticException("Hehehehe");
        }

        new Object();
    }
}

package ex_27_Exceptions;

public class Lab208_Arthimetic {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c;
        }

       // Multiple catch bloacks allowed
       // If smaller exception Arithmatic is not able to catch then
       // Bigger exception Exception can be used
       // Throwable is bigger than Exception also.
        catch (ArithmeticException e) {
            System.out.println("Not allowed");
        }
        catch (Exception e) {
            System.out.println("Hello");
        }
        catch (Throwable e) {
            System.out.println("Not allowed");
        }
    }
}

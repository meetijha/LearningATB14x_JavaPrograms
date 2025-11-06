package ex_27_Exceptions;

public class Lab204_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start the program");

        // BELOW 3 ARE UNCHECKED EXCEPTIONS

        //Before assigning args if we access this
        String ip=args[0]; // java.lang.ArrayIndexOutOfBoundsException

        //If rather than a number we write A STRING like meeti in args
        int a = Integer.parseInt(ip); // java.lang.NumberFormatException

        //if args value is 0 . below exception comes
        int b=100/a; //java.lang.ArithmeticException

        System.out.println("End the program");
    }
}

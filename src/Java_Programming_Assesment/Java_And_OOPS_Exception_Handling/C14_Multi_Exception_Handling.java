package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Multi-Exception Handling
Implement exception handling for a program that divides two numbers and
catches ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.*/

/*Input:
Division by zero, invalid number format, array index out of bounds*/

/*Output:
ArithmeticException: Cannot divide by zero
NumberFormatException: Invalid number format
ArrayIndexOutOfBoundsException: Array index out of bounds*/

public class C14_Multi_Exception_Handling {

    public static void main(String[] args) {
       try {
           //ArithmaticException
           int a=10;
           int b=0;
           int c=a/b;// divide by 0
           System.out.println(c);

           // NumberFormatException
           String s="Meeti";
           int n= Integer.parseInt(s);// Invalid integer
           System.out.println(n);

           //ArrayIndexOutOfBoundsException
           int[] arr={1,2,3};
           System.out.println(arr[5]);// invalid index
       }
       catch(ArithmeticException e)
       {
           System.out.println("ArithmeticException: Cannot divide by zero");
       }
       catch(NumberFormatException e)
       {
           System.out.println("NumberFormatException: Invalid number format");
       }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
      }
    }
}

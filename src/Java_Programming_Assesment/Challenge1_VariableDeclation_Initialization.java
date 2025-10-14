package Java_Programming_Assesment;

/*Variable Declaration and Initialization
Write a Java program that demonstrates proper variable declaration and initialization for different data types.

**Requirements:**
        - Declare and initialize variables of different primitive data types (int, double, boolean, char)
- Print the values of all variables
- Show proper naming conventions*/

public class Challenge1_VariableDeclation_Initialization {
    public static void main(String[] args) {

/******* NON NUMERIC PRIMITIVE DATA TYPE ***************************************/
        boolean bo=true; // Is either true or false
        char a = 'A'; //2 bytes, 0 to 65,535 (unsigned)
/********** NUMERIC PRIMITIVE DATA TYPE *************************************************/

        byte b = 4; //(1 byte) 8 bit signed integer. Ranges from -128 to 127
        short s = 12345; //(2 bytes)16 bit signed integer,Ranges from -32,768 to 32,767
        int i=123456789; //(4 byte)32 bit signed integer
        long l = 1212l;  // (8 byte)64 bit signed integer, ends with lowercase l

/******FLOATING POINT NUMERIC DATA TYPE*************************************/

        float f = 3.14f; //4 bytes,for float use 'f' as suffix
        double d = 4.355453532; //8 bytes,by default fraction value is double in java

/********* NON PRIMITIVE DATA TYPE *****************************************/

        String str1=new String("Hello");// String
        String str2="Meeti";
        int[] intArray= {1,2,3};//Array

  // PRINTING.....
        System.out.println("boolean: "+ bo);
        System.out.println("char: " + a);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("integer: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(intArray[0]+""+intArray[1]+""+intArray[2]);

    }
}


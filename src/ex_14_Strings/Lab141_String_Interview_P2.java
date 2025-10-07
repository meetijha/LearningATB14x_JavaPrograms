package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparison -> String => this check the ref location
        System.out.println(s1 == s3); //False
        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3); // false

        System.out.println(s1 == s4); //true
        System.out.println(s3 == s5);// false


        // equals ( content) -> value, checks if content is same
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s3.equals(s5));// false
        System.out.println(s3.equalsIgnoreCase(s5));//true

        //  equalsIgnoreCase -> meeti. Meeti, MEETI , MeeTi . MeetI -> meeti
        //  == - check for the ref
        // = assignment the value
    }
}

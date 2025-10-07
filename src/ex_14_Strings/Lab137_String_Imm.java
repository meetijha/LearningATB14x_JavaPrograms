package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1="Hello ";
        s1=s1.concat("World");
        // now 2 strings will be present in String const pool- Hello and Hello World
        // this shows strings are immutable in nature
        System.out.println(s1);

    }
}

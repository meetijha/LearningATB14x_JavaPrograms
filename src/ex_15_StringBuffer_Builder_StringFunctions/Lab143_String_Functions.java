package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Meeti";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat(" Jha"));

        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println("Equals "+name.equals("Meeti"));

        // 5. equalsIgnoreCase()
        System.out.println("Ignore case equal "+name.equalsIgnoreCase("meeti"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println("Index of i "+name.indexOf('i'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println("Index of m in madam "+s1.indexOf("m"));

        // 7. length()
        System.out.println("length of name "+name.length());

        // 8. replace( , )
        System.out.println("Replace e with E "+name.replace('e', 'E'));

        // 10. substring( , )
        System.out.println("Substring from 1 to 3 "+name.substring(1, 3)); // will return from 1 to 2

        // 11. toLowerCase()
        System.out.println("Lowercase MEETI "+"MEETI".toLowerCase());

        // 12. toUpperCase()
        System.out.println("Uppercase meeti "+"meeti".toUpperCase());

        // 14. startsWith()
        System.out.println("Does name start with M "+ name.startsWith("M"));

        // 15. endsWith()
        System.out.println("Does name end with a "+name.endsWith("a"));

        // 16. trim()
        String name3 = "    Meeti Pratham     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println("Compare to "+name.compareTo("Meeti"));// returns difference in ASCII


        // --------------
        StringBuilder stringBuilder = new StringBuilder("Meeti");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

    }

}

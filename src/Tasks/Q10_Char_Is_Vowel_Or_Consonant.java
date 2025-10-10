package Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Q10_Char_Is_Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char character = scanner.next().charAt(0);
        char ch = Character.toLowerCase(character);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println(ch +" is vowel");
                break;
            default:
                if(Character.isLetter(ch))
                System.out.println(ch + " is consonant");
                else
                    System.out.println("It is not a valid character");
        }
        scanner.close();
    }

}


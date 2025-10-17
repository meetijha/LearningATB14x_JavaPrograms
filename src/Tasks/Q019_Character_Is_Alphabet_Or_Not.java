package Tasks;

import java.util.Scanner;

public class Q019_Character_Is_Alphabet_Or_Not {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Character");
        char c=scanner.next().charAt(0);

        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            System.out.println("It's an alphabet");
        else System.out.println("Its not an alphabet");

    }

}

package ex_30_Collection_Framework.CF_01_LIST;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        Stack s=new Stack();

        //Last in first out
        s.add("Meeti");
        s.add("Aaryav");
        s.add("Rishabh");

        System.out.println(s);
        System.out.println(s.size());

        //Returns top most element on stack but doesn't remove
        System.out.println(s.peek());
        System.out.println(s);

        //Returns top most element on stack and removes it
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.add("Mango"));
        System.out.println(s);
        s.add("Spenser");
        s.add("Spenser");
        System.out.println(s);

        s.push("Vidit");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}

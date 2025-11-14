package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237_AL_iteration {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Meeti");
        myList.add("Rishabh");
        myList.add("Aaryav");


        System.out.println("For each - To Print Arraylist - 1 ");

        for(String s:myList)
        {
            System.out.println(s);
        }

        System.out.println("Iterator - To Print Arraylist - 2 ");
        Iterator iterator=myList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("For loop - To Print Arraylist - 3");

        for(int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i));
        }
    }
}

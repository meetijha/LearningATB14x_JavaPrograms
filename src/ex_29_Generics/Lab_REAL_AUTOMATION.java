package ex_29_Generics;

import java.util.ArrayList;
import java.util.List;

//Generics is used to store different types of data
public class Lab_REAL_AUTOMATION {
    public static void main(String[] args) {
        // here <> symbol defines that it is generic list
        List list_web_element = new ArrayList<>();

        list_web_element.add("Meeti");
        list_web_element.add(123);
        list_web_element.add(true);
        list_web_element.add(3.14);


        // Another example- Templatized with Integer
        List<Integer> list_web_element1 = new ArrayList<>();
       // list_web_element1.add("Meeti");// Not allowed
        list_web_element1.add(123);
       // list_web_element1.add(true);//not allowed
       // list_web_element1.add(3.14);//not allowed
        //here as list is Integer type so only Integer objects can be added

    }
}

package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map_P1 {
    public static void main(String[] args) {
        Map m1= new HashMap();

        // Map stores key - value pair
        // name : meeti,
        // rollno : 1
        // phone : 9876543210

        m1.put("name ", "meeti");
        m1.put("roll",11);
        m1.put("phone",987654321);
        System.out.println(m1);

        Map m2=new LinkedHashMap();
        m2.put("name ", "meeti");
        m2.put("roll",21);
        m2.put("phone",987654321);
        System.out.println(m2);

        Map m3= new TreeMap();
        m3.put("name ", "meeti");
        m3.put("roll",21);
        m3.put("phone",987654321);
        System.out.println(m3);// sorted based on key natural order


    }
}

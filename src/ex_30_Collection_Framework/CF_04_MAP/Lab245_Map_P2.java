package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;

public class Lab245_Map_P2 {
    public static void main(String[] args) {
//        Map map = new HashMap();
        // Unique keys stored
        HashMap map = new HashMap();
        map.put("id",1);
        map.put("id",2);// As key is same it will overrride previous
        map.put("id2",100);

        // 1 null key and 1 null value per key is allowed
        map.put("id4",null);
        map.put(null,102);
        System.out.println(map);


        System.out.println(map.size());// 4 as id is present 2 times
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));
        System.out.println(map.containsValue(1));// false

        System.out.println(map.keySet()); //[null, id2, id4, id]
        System.out.println(map.values()); //[102, 100, null, 2]

        System.out.println(map.get("id2"));

    }
}

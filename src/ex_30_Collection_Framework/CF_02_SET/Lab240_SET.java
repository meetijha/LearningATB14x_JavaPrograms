package ex_30_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_SET {
    public static void main(String[] args) {
        Set hs= new HashSet(); // hashing mechanism

        hs.add("meeti");// da67sd7a6sdad68as67da8d67
        //2nd time meeti added. so duplicate wont be stored
        hs.add("meeti");  // da67sd7a6sdad68as67da8d67
        hs.add("aaryav");// wweda67sd7a6sdad68as67da8d67
        hs.add("rishabh");

        System.out.println(hs);// Order of insertion not maintained
        System.out.println(hs.size());// so 3 elements are in hashset, duplicate not allowed

        Set lhs =new LinkedHashSet(); // Maintains insertion order
        Set ts= new TreeSet();// Stores in sorted order
    }
}

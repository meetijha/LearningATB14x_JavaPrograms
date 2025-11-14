package ex_30_Collection_Framework.CF_01_LIST;

import java.util.Arrays;
import java.util.List;

public class LabConvertArrayToList {
    public static void main(String[] args) {
        String[] arr={"java", "Python", "C#"};

        List<String> list= Arrays.asList(arr); //1st way
        List l= List.of(arr); // Another way

        System.out.println(l);
        System.out.println(list);
    }
}

package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {


        String s1 = "Hello"; // scp count =1
        String s4 = "Hello"; // scp count =1
        String s10 = "Hello"; // scp count =1
        String s11 = "hello"; // scp count =2
        // all the above hello will point to same reference except s11
        // 2
    // direct assignment of string checks if same string exists and creates new space only of the
    // string is new
    //New Sring always creates new space in string constant pool
        String s2 = new String("Hello"); // OA =1, total string =3
        String s3 = new String("Hello"); // OA =2, total string =4
        String s5 = new String("hello"); // OA =3, total string =5
    }
}

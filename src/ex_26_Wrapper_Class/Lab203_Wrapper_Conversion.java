package ex_26_Wrapper_Class;

public class Lab203_Wrapper_Conversion {
    public static void main(String[] args) {
// Integer.parseInt
// Integer.valueOf

        String num = "10";
        int aa = 10;

        //using** parseXO(); **->. String to Primitive, String to Wrapper
        // String -> Wrapper Conversion
        Integer a = Integer.parseInt(num);
        // Double.parseDouble()
        // Float.parseFloat()
        // Long.parse

        // String to Primitive
        int a_p = Integer.parseInt(num);//automatic unwrappimg happens

        //**valueOf()** -> String to Wrapper, String to primitive
        Integer aa3 = Integer.valueOf("10");// we can use valueOf as well
        int a4=Integer.valueOf("20");
        System.out.println(aa3);

        //Integer / Wrapper to string
        Integer aa10 = 10;
        String s = aa10.toString(); //1st way
        String s1 = Integer.toString(30); //2nd way
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s instanceof String);
    }
}
package ex_29_Generics;

public class Lab224 {
    public static void main(String[] args) {
        System.out.println( temp_sum(10,10));
        System.out.println( temp_sum(10.34,10.34));
        System.out.println(temp_sum("Meeti ","Jha"));
        System.out.println(temp_sum1(2,3));
    }
        static Integer temp_sum(Integer a,Integer b){
        return a+b;
    }
    static Double temp_sum(Double a,Double b){
        return a+b;
    }
    static <T> T temp_sum(T a, T b)
    {
        return null;
    }

        static <MODI> MODI temp_sum1(MODI a, MODI b){
        return null;
    }
}

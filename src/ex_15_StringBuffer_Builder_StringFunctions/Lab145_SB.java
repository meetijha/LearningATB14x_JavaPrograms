package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Meeti");
        stringBuffer.append("Jha");// 1 string is present.
        System.out.println(stringBuffer); // MeetiJha


        String s1 = "Meeti";
        s1 = s1+ "Jha";// 2 strings are present in scp
        System.out.println(s1);


    }
}

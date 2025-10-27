package Tasks.WhileLoop;

public class Q2_Print_Even_Numbers_1_To_20 {
    public static void main(String[] args) {
        int n=1;
        while(n<=20)
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
            n++;
        }
    }
}

package Tasks.WhileLoop;

public class Q4_Sum_First_10_Natural_Numbers {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        while(n<=10)
        {
            sum=sum +n;
            n++;
        }
        System.out.println("Sum = "+sum);
    }
}

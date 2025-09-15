package ex_02_Java_Basics;

public class Table_9_WithFunctionNoLoop {

    static int val=1;
    static int tableOf=9;
    static void table(int val)
    {
        if(val<=10)
        {
            System.out.printf("%d * %d = %d \n",tableOf,val,tableOf*val);
            table(++val);
        }
    }
    public static void main(String[] args) {
        table(val);
    }
}

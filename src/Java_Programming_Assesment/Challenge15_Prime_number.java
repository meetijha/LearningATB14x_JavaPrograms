package Java_Programming_Assesment;

/*Prime Number Finder
Write a program to find and print all prime numbers between 1 and 100 using loops.

        **Requirements:**
        - Use nested loops to check for prime numbers
- A prime number is divisible only by 1 and itself
- Print all prime numbers in the range 1-100
        - Optimize the algorithm for better performance*/
public class Challenge15_Prime_number {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100: ");

        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                System.out.println(i);
                continue;
            }
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {// or can check i*i<=n
                if (i % j == 0) count++;
            }
            if (count == 0)
                System.out.println(i);
        }
    }
}

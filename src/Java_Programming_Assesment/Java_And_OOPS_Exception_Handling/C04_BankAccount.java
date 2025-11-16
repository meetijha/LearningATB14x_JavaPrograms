package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Bank Account Encapsulation
Create a BankAccount class with private balance field.
Implement deposit(), withdraw(), and getBalance() methods with proper validation.*/

/*Input:
Initial balance: 1000, deposit: 500, withdraw: 200*/

/*Output:
Balance after deposit: 1500.0 Balance after withdrawal: 1300.0*/

public class C04_BankAccount {

    private float balance;

    public C04_BankAccount(float balance) {
        this.balance = balance;
    }

    public float deposit(float depAmt)
    {
        balance=balance+depAmt;
        return balance;
    }

    public float withdraw(float withdrawAmt)
    {
        balance=balance-withdrawAmt;
        return balance;
    }

    public float getbalance()
    {
        return balance;
    }

    public static void main(String[] args)
    {
        C04_BankAccount b=new C04_BankAccount(1000);
        b.deposit(500);
        System.out.println("Balance after deposit: "+b.getbalance());
        b.withdraw(200);
        System.out.println("Balance after withdrawal: "+b.getbalance());
    }
}

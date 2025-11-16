package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Multiple Interface Implementation
Create interfaces "Flyable" and "Swimmable" with appropriate methods.
Implement both in a "Duck" class.*/

/*Input:
Create Duck object and call fly() and swim() methods*/

/*Output:
Duck is flying in the sky! Duck is swimming in the water!*/

public class C10_Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky! ");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }

    public static void main(String[] args) {
        C10_Duck d=new C10_Duck();
        d.fly();
        d.swim();
    }
}

interface Flyable{
    public void fly();
}

interface Swimmable{
    public void swim();
}
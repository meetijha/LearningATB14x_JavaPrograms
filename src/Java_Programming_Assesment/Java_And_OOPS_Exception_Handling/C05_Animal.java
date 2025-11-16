package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Create a class "Animal" and subclasses "Dog" and "Cat".
Override a method to make each animal make a sound.*/

/*Input:
Create Dog and Cat objects and call makeSound()*/

/*Output:
Dog says: Woof! Woof! Cat says: Meow! Meow!*/

public class C05_Animal
{
    public void makeSound()
    {
        System.out.println("Animal makes sound");
    }

    public static void main(String[] args) {
        C05_Animal d=new Dog();
        d.makeSound();

        C05_Animal c=new Cat();
        c.makeSound();
    }
}

class Dog extends C05_Animal{
    public void makeSound()
    {
        System.out.println("Dog says: Woof! Woof!");
    }
}
class Cat extends C05_Animal{
    public void makeSound()
    {
        System.out.println("Cat says: Meow! Meow!");
    }
}



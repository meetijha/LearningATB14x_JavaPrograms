package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Person Class Implementation
Create a class "Person" with attributes "name" and "age".
Create two instances and print their details.*/

/*Input:
Create Person objects with names "John" (25) and "Alice" (30)*/

/*Output:
Name: John, Age: 25 Name: Alice, Age: 30*/

public class C01_Person {
    String name;
    int age;

    public C01_Person(String person, int age) {
        this.name = person;
        this.age = age;
    }

    public void printDetails()
    {
        System.out.println("Name:" +this.name +", Age:" +this.age);
    }

    public static void main(String[] args) {
        C01_Person p= new C01_Person("John", 25);
        C01_Person p1= new C01_Person("Alice",30);
        p.printDetails();
        p1.printDetails();
    }
}

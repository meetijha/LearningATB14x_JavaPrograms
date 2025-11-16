package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Custom Exception Implementation
Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.*/

/*Input:
validateAge(15) and validateAge(25)*/

/*Output:
InvalidAgeException: Age must be 18 or above. Provided age: 15 Age is valid: 25*/

public class C15_Custom_Exception {

    public static void main(String[] args) {
        Student s1=new Student(15);
        Student s2=new Student (25);
      try {
          s1.validateAge();
          s2.validateAge();
      }
      catch(InvalidAgeException e){
          System.out.println(e.getMessage());
        }
    }
}

class Student
{
 int age;

    public Student(int age) {
        this.age = age;
    }

    public void validateAge() throws InvalidAgeException{
        if(this.age<18) throw new InvalidAgeException("InvalidAgeException: Age must be 18 or above. Provided age: "+this.age);
        else
            System.out.println(" Age is valid: "+this.age);
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}
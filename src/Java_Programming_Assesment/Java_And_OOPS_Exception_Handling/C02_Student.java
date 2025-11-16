package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Student Management System
Implement a class "Student" with attributes "name", "rollNo", and "section".
Add a method to print student details.*/

/*Input:
Create student with name="Bob", rollNo=101, section="A"*/

/*Output:
Student: Bob, Roll No: 101, Section: A*/

public class C02_Student {
    String name;
    int rollNo;
    char section;

    public C02_Student(String name, int rollNo, char section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public void printStudentDetails()
    {
        System.out.println("Student: "+ this.name+", Roll No: "+this.rollNo+", Section: "+this.section);
    }

    public static void main(String[] args) {
        C02_Student s=new C02_Student("Bob",101,'A');
        s.printStudentDetails();
    }
}

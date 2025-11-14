package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab239_ArrayList_Class_element {
    public static void main(String[] args) {

        Student s1= new Student("Meeti", 23);
        Student s2= new Student("Aaryav", 3);
        Student s3=new Student ("Rishabh", 20);

        List<Student> studList= new ArrayList<Student>();
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}

class Student{
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }
}

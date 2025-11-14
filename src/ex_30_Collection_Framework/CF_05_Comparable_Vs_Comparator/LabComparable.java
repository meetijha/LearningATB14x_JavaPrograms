package ex_30_Collection_Framework.CF_05_Comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabComparable {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"Meeti");
        Employee e2= new Employee( 2, "Aaryav");
        Employee e3= new Employee(3, "Pratham");

        List<Employee> empList=new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        System.out.println(empList);
        Collections.sort(empList);
        System.out.println(empList);
    }
}

class Employee implements Comparable<Employee>
{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return id +" - " + name;
    }

    public String printDetails()
    {
        return id +" - " + name;
    }
    @Override
    public int compareTo(Employee o) {
     // return this.id - o.id;
    // return this.name - o.name;
        return this.name.compareTo(o.name);
    }
}

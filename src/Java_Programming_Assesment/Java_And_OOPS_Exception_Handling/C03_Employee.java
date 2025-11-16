package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Employee Encapsulation
Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary".
Add getter and setter methods.*/

/*Input:
Employee with id=1, name="John Doe", salary=50000*/

/*Output:
Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0*/

public class C03_Employee {
    private int id;
    String name;
    float salary;

    public C03_Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        C03_Employee e=new C03_Employee(1, "John Doe", 50000);
        System.out.println("Employee ID: "+e.getId()+" Employee Name: "+e.getName()+" Employee Salary: "+e.getSalary());
    }
}

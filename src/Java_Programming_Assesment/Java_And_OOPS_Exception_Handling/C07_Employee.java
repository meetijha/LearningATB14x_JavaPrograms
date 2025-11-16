package Java_Programming_Assesment.Java_And_OOPS_Exception_Handling;

/*Manager with base salary 60000 and bonus 10000,
Developer with hourly rate 50 and 160 hours*/

/*Input:
Manager with base salary 60000 and bonus 10000,
Developer with hourly rate 50 and 160 hours*/

/*Output:
Manager Salary: 70000.0 Developer Salary: 8000.0*/

public class C07_Employee {
float salary;
    public float calculateSalary()
    {
    return 0;
    }

    public static void main(String[] args) {
        Manager m=new Manager(60000,10000);
        Developer d=new Developer(50,160);

        m.getSalary();
        d.getSalary();
    }
}

class Manager extends C07_Employee{
float baseSal;
float bonus;
float salary;

    public Manager(float baseSal, float bonus) {
        this.baseSal = baseSal;
        this.bonus = bonus;
    }

    @Override
    public float calculateSalary() {
        salary=baseSal+bonus;
        return salary;
    }

    public float getSalary() {
        calculateSalary();
        System.out.println("Manager Salary: "+salary);
        return salary;
    }
}

class Developer extends C07_Employee{
    float salary;
    float hourlyRate;
    float hoursWorked;

    public Developer(float hourlyRate, float hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public float calculateSalary() {
        salary=hourlyRate*hoursWorked;
        return salary;
    }
    public float getSalary()
    {
        calculateSalary();
        System.out.println("Developer Salary: "+salary);
        return salary;
    }
}
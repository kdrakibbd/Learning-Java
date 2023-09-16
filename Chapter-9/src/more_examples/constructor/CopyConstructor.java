package more_examples.constructor;

class Employe {
    private String name;
    private String department;
    private double salary;

    // arugmented constructor
    public Employe(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employe (Employe employe) {
        this.name = employe.name;
        this.department = employe.department;
        this.salary = employe.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployeDetails () {
        System.out.println("Name : " +this.getName());
        System.out.println("Dpeartment : " +this.getDepartment());
        System.out.println("Salary : " +this.getSalary());
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Employe employe = new Employe("Sumon", "Software" , 25000);
        System.out.println("\nBefore the copy constructor");
        employe.printEmployeDetails();

        Employe employe1 = new Employe(employe);
        System.out.println("\nAfter the copy constructor");
        employe1.printEmployeDetails();
    }
}

package TestForNike;

public class Employee {
    private int empId = 0;
    private String name = "";
    private String ssn = "";
    private double salary = 0;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void getEmployee() {
        System.out.println("Id: " + empId);
        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Salary: " + salary);
    }

    private static void printEmployee(Employee emp) {
        System.out.println("Id: " + emp.empId);
        System.out.println("Name: " + emp.name);
        System.out.println("SSN: " + emp.ssn);
        System.out.println("Salary: " + emp.salary + "\n");


    }

    private void raiseSalary(double increase) {
        if (increase > 0) {
            salary += increase;
        }
    }

    public static void main(String[] args) {
        Employee myObj = new Employee(7, "Josh", "0-12-58", 120);

        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120.9);
        Admin admin = new Admin(101, "Jesse Pinkman", "012-34-5678", 127.5);

        Manager manager = new Manager(207, "Bill Munroe", "108-23-2367", 75.8, "US Marketing");
        Director dir = new Director(12, "Sysan Wheeler", "099-45-2340", 120.2, "Global Marketing", 100000.00);


        myObj.printEmployee(myObj);
        myObj.printEmployee(eng);
        myObj.printEmployee(admin);
        myObj.printEmployee(manager);
        myObj.printEmployee(dir);
    }

}
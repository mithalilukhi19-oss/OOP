// Base class
class Employee {
    String name;
    String department;

    // Constructor
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass
class Manager extends Employee {
    int teamSize;
    String projectName;

    // Constructor
    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Overriding method
    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

// Main class
public class Pr15 {
    public static void main(String[] args) {

        // Base class object
        Employee emp = new Employee("Rahul", "HR");

        // Subclass object
        Manager mgr = new Manager("Priya", "IT", 10, "Project Alpha");

        // Method calls
        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println("\nManager Details:");
        mgr.displayDetails();

        // Runtime Polymorphism
        System.out.println("\nRuntime Polymorphism:");
        Employee ref = new Manager("Amit", "Finance", 5, "Project Beta");
        ref.displayDetails(); // Calls Manager's method
    }
}
/* output 
  Employee Details:
Employee Name: Rahul
Department: HR

Manager Details:
Manager Name: Priya
Department: IT
Team Size: 10
Project: Project Alpha

Runtime Polymorphism:
Manager Name: Amit
Department: Finance
Team Size: 5
Project: Project Beta */

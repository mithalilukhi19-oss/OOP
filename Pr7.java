import java.util.Scanner;

class Employee {
    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read data from user
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: Rs." + employeeSalary);
    }
}

// Main class
public class Pr7 {
    public static void main(String[] args) {

        // Object creation
        Employee emp = new Employee();

        // Method invocation
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
/*output 
  Enter employee name: Rahul
Enter employee salary: 50000

Employee Details:
Name: Rahul
Salary: Rs.50000.0 */
  

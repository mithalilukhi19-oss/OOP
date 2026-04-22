import java.util.Scanner;

// Student class
class Student {
    protected int rollNo;
    protected String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

// Result class (inherits Student)
class Result extends Student {
    private int marks1, marks2, marks3;

    // Constructor
    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    // Display result
    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("\n--- Mark Sheet ---");
        displayStudent();
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

// Main class
public class Pr19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        // Create object
        Result res = new Result(roll, name, m1, m2, m3);

        // Display result
        res.displayResult();

        sc.close();
    }
}
/* output 
  Enter Roll No: 101
Enter Name: Rahul
Enter marks for 3 subjects: 80 75 90

--- Mark Sheet ---
Roll No: 101
Name: Rahul
Marks 1: 80
Marks 2: 75
Marks 3: 90
Total: 245
Average: 81.67 */

import java.util.Scanner;

// Outer class
class College {
    private String collegeName;

    // Constructor
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Inner class
    class Admission {
        private String studentName;
        private String course;

        // Method to accept data
        void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        // Method to display data
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

// Main class
public class Pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input college name
        System.out.print("Enter college name: ");
        String cname = sc.nextLine();

        // Create outer class object
        College college = new College(cname);

        // Create inner class object
        College.Admission admission = college.new Admission();

        // Accept and display details
        admission.acceptDetails();
        admission.displayDetails();

        sc.close();
    }
}
/* output 
  Enter college name: ABC College
Enter student name: Rahul
Enter course: BCA

--- Admission Details ---
College Name: ABC College
Student Name: Rahul
Course: BCA */

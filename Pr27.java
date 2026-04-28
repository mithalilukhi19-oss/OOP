import java.io.*;
import java.util.Scanner;

public class Pr27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Create file and write data
            fw = new FileWriter("students.txt");

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details of student " + i);

                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                // Write to file
                fw.write(roll + " " + name + " " + marks + "\n");
            }

            fw.close(); // close after writing

            // Read from file
            System.out.println("\n--- Student Records ---");

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File error occurred.");

        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }

            sc.close();
            System.out.println("\nProcess completed.");
        }
    }
}
/* output 
  Enter number of students: 3

Enter details of student 1
Roll No: 101
Name: Rahul
Marks: 80

Enter details of student 2
Roll No: 102
Name: Priya
Marks: 85

Enter details of student 3
Roll No: 103
Name: Amit
Marks: 78

--- Student Records ---
101 Rahul 80
102 Priya 85
103 Amit 78

Process completed. */

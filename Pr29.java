import java.util.*;

public class Pr29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        // Input marks (at least 5)
        System.out.print("Enter number of students (min 5): ");
        int n = sc.nextInt();

        if (n < 5) {
            System.out.println("Please enter at least 5 marks.");
            return;
        }

        // Add marks
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter mark " + i + ": ");
            marks.add(sc.nextInt());
        }

        // Display marks
        System.out.println("\nAll Marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        // Find highest and lowest
        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("\n\nHighest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        sc.close();
    }
}
/* output 
  Enter number of students (min 5): 5
Enter mark 1: 78
Enter mark 2: 85
Enter mark 3: 67
Enter mark 4: 90
Enter mark 5: 72

All Marks:
78 85 67 90 72

Highest Marks: 90
Lowest Marks: 67 */

import java.util.Scanner;

public class CramersRuleSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter value of d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter value of e: ");
        double e = scanner.nextDouble();

        System.out.print("Enter value of f: ");
        double f = scanner.nextDouble();

        // Calculate determinants
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        // Check if solution exists
        if (D == 0) {
            System.out.println("The system has no unique solution (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            // Display result
            System.out.printf("Value of x = %.2f%n", x);
            System.out.printf("Value of y = %.2f%n", y);
        }

        scanner.close();
    }
}
/*output 
  Enter value of a: 2
Enter value of b: 3
Enter value of c: 1
Enter value of d: 2
Enter value of e: 8
Enter value of f: 5
Value of x = 1.00
Value of y = 2.00 */

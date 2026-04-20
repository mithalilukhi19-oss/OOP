import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user 
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        // Convert to metric units
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display result
        System.out.printf("Your BMI is: %.2f%n", bmi);

        scanner.close();
    }
}
/* output 
Enter your weight in pounds: 150
Enter your height in inches: 65
Your BMI is: 24.96 */

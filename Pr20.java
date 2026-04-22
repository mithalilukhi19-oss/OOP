import java.util.scanner;
public class Pr20 {
    public static void main(String[] args) {

        try {
            // Check if arguments are provided
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide numerator and denominator.");
            }

            // Convert arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform division
            int result = numerator / denominator;

            // Display result
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command-line arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
/* output 
  Numerator: 10
Denominator: 2
Result: 5
Program execution completed. */

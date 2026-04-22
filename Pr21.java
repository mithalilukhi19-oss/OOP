import java.util.Scanner;

class VotingApp {

    // Method to check eligibility
    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}

// Main class
public class Pr21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp app = new VotingApp();

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            app.checkEligibility(age);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input.");

        } finally {
            System.out.println("Validation process completed");
        }

        sc.close();
    }
}
/* output 
  Enter age: 20
Eligible to vote
Validation process completed */

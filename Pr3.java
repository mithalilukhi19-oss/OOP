import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter a single letter: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);

        // Check if input is alphabet
        if (ch >= 'a' && ch <= 'z') {
            // Check vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        }

        scanner.close();
    }
}
/*output 
  Enter a single letter: A
  The character is a vowel.
  Enter a single letter: b
  The character is a consonant.
  Enter a single letter: 5
  Invalid input! Please enter an alphabet letter. */

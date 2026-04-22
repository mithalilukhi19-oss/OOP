import java.util.Scanner;

// Custom Exception
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Library class
class Library {
    int availableBooks;

    // Constructor
    Library(int books) {
        this.availableBooks = books;
    }

    // Method to issue books
    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully.");
            System.out.println("Books remaining: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

// Main class
public class Pr22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize with 3 books
        Library lib = new Library(3);

        try {
            // First attempt
            System.out.print("Enter number of books to issue (1st time): ");
            int first = sc.nextInt();
            lib.issueBook(first);

            // Second attempt
            System.out.print("\nEnter number of books to issue (2nd time): ");
            int second = sc.nextInt();
            lib.issueBook(second);

        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            System.out.println("\nLibrary transaction completed.");
        }

        sc.close();
    }
        }
/* output 
  Enter number of books to issue (1st time): 2
Book issued successfully.
Books remaining: 1

Enter number of books to issue (2nd time): 2
Error: Requested books not available

Library transaction completed. */

class BankAccount {
    String account_holder_name;
    double balance;

    // Static variable (common for all accounts)
    static double interest_rate = 5.0; // default 5%

    // Constructor
    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display details
    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Interest Earned: Rs." + calculateInterest());
        System.out.println();
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest rate updated to " + interest_rate + "%\n");
    }
}

// Main class
public class Pr10 {
    public static void main(String[] args) {

        // Create accounts
        BankAccount acc1 = new BankAccount("Rahul", 10000);
        BankAccount acc2 = new BankAccount("Priya", 20000);

        // Display initial details
        System.out.println("Before updating interest rate:");
        acc1.display();
        acc2.display();

        // Update interest rate (applies to all accounts)
        BankAccount.updateInterestRate(7.5);

        // Display after update
        System.out.println("After updating interest rate:");
        acc1.display();
        acc2.display();
    }
}
/* output 
  Before updating interest rate:
Account Holder: Rahul
Balance: Rs.10000.0
Interest Rate: 5.0%
Interest Earned: Rs.500.0

Account Holder: Priya
Balance: Rs.20000.0
Interest Rate: 5.0%
Interest Earned: Rs.1000.0

Interest rate updated to 7.5%

After updating interest rate:
Account Holder: Rahul
Balance: Rs.10000.0
Interest Rate: 7.5%
Interest Earned: Rs.750.0

Account Holder: Priya
Balance: Rs.20000.0
Interest Rate: 7.5%
Interest Earned: Rs.1500.0 */
  

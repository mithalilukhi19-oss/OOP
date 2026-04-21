import java.util.Scanner;

// Base class
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    Scanner sc = new Scanner(System.in);

    // Open account
    void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.nextLine(); // consume newline
    }

    // Deposit
    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw
    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }
}

// Subclass: SavingAccount
class SavingAccount extends BankAccount {

    // Calculate interest
    void calculateInterest() {
        double rate = 5.0; // 5% interest
        double interest = (balance * rate) / 100;
        System.out.println("Interest on Savings Account: Rs." + interest);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {

    // Calculate maturity amount
    void maturityAmount() {
        System.out.print("Enter FD duration (years): ");
        int years = sc.nextInt();

        double rate = 7.0; // 7% interest
        double maturity = balance * Math.pow((1 + rate / 100), years);

        System.out.println("Maturity Amount after " + years + " years: Rs." + maturity);
    }
}

// Main class
public class Pr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Saving Account");
        System.out.println("2. Fixed Deposit Account");
        System.out.print("Choose account type: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            SavingAccount sa = new SavingAccount();
            sa.openAccount();
            sa.deposit();
            sa.withdraw();
            sa.checkBalance();
            sa.calculateInterest();

        } else if (choice == 2) {
            FixedDepositAccount fd = new FixedDepositAccount();
            fd.openAccount();
            fd.deposit();
            fd.checkBalance();
            fd.maturityAmount();

        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
/* output 
  1. Saving Account
2. Fixed Deposit Account
Choose account type: 1
Enter Account Number: 101
Enter Account Holder Name: Rahul
Enter Initial Balance: 10000
Enter amount to deposit: 2000
Amount deposited successfully.
Enter amount to withdraw: 3000
Withdrawal successful.
Current Balance: Rs.9000.0
Interest on Savings Account: Rs.450.0 */

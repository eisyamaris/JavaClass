import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAccount {
    private double balance;
    private DecimalFormat df = new DecimalFormat("#.00"); 


    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("\nCurrent balance: RM" + df.format(balance));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("\nDeposit successful!");
            System.out.println("New balance: RM" + df.format(balance));
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawal successful!");
            System.out.println("New balance: RM" + df.format(balance));
        } else if (amount > balance) {
            System.out.println("\nError: Insufficient balance.");
        } else {
            System.out.println("\nInvalid withdrawal amount.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(0); 
        int choice;

        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: RM");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: RM");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

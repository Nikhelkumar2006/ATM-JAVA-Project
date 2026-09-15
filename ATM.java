import java.util.Scanner;

/**
 * Handles the ATM menu and interaction with a connected bank account.
 */
public class ATM {

    private final BankAccount account;
    private final Scanner scanner;

    public ATM(BankAccount account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
    }

    public void start() {
        boolean running = true;

        System.out.println("Welcome to the ATM");

        while (running) {
            displayMenu();
            int choice = readMenuChoice();

            switch (choice) {
                case 1:
                    showBalance();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    running = false;
                    System.out.println(
                        "Thank you for using the ATM. Goodbye!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please select an option from 1 to 4."
                    );
            }

            if (running) {
                System.out.println();
            }
        }
    }

    private void displayMenu() {
        System.out.println("===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    private int readMenuChoice() {
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine().trim();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            return -1;
        }
    }

    private void showBalance() {
        System.out.printf(
            "Balance: Rs. %.2f%n",
            account.getBalance()
        );
    }

    private void depositMoney() {
        double amount = readAmount("Enter deposit amount: ");

        if (amount <= 0) {
            System.out.println(
                "Deposit amount must be greater than 0."
            );
            return;
        }

        account.deposit(amount);

        System.out.println("Deposit successful.");

        System.out.printf(
            "Updated Balance: Rs. %.2f%n",
            account.getBalance()
        );
    }

    private void withdrawMoney() {
        double amount = readAmount("Enter withdrawal amount: ");

        if (amount <= 0) {
            System.out.println(
                "Withdrawal amount must be greater than 0."
            );
            return;
        }

        if (!account.withdraw(amount)) {
            System.out.println("Insufficient Funds!");

            System.out.printf(
                "Available Balance: Rs. %.2f%n",
                account.getBalance()
            );

            return;
        }

        System.out.println("Withdrawal successful.");

        System.out.printf(
            "Remaining Balance: Rs. %.2f%n",
            account.getBalance()
        );
    }

    private double readAmount(String prompt) {
        System.out.print(prompt);

        String input = scanner.nextLine().trim();

        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException exception) {
            return 0;
        }
    }

    // Program starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(1000);

        ATM atm = new ATM(account, scanner);

        atm.start();

        scanner.close();
    }
}
import java.util.Scanner;

/**
 * Starts the ATM application.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.00);

        try (Scanner scanner = new Scanner(System.in)) {
            ATM atm = new ATM(account, scanner);
            atm.start();
        }
    }
}

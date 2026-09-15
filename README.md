<<<<<<< HEAD
# ATM Interface

A beginner-friendly Java console application that demonstrates object-oriented programming through a simple ATM system.

## Features

- Check account balance
- Deposit money
- Withdraw money
- Reject zero or negative transaction amounts
- Reject withdrawals greater than the available balance
- Handle invalid menu choices and non-numeric input
- Use `private` account data with public methods for controlled access

## Project Structure

```text
ATMProject/
├── src/
│   ├── ATM.java
│   ├── BankAccount.java
│   └── Main.java
└── README.md
```

## Requirements

- Java Development Kit (JDK) 8 or later
- VS Code with the Extension Pack for Java (recommended)

No database, GUI framework, web framework, or external library is required.

## How to Compile and Run

Open the project folder in VS Code, then open the integrated terminal and run:

```powershell
javac -d out src\*.java
java -cp out Main
```

On macOS or Linux, use:

```bash
javac -d out src/*.java
java -cp out Main
```

You can also open `src/Main.java` and select **Run Java** in VS Code.

## Class Responsibilities

### `BankAccount`

Represents one bank account. It stores the balance in a private variable and provides methods to read the balance, deposit money, and withdraw money.

### `ATM`

Displays the menu, reads user input with `Scanner`, calls the appropriate account method, and prints transaction results or validation messages.

### `Main`

Creates the account and scanner, connects them to an `ATM` object, and starts the application.

## OOP Concepts Demonstrated

- **Classes and objects:** `Main` creates `BankAccount` and `ATM` objects.
- **Encapsulation:** `BankAccount.balance` is private. Other classes use `getBalance()`, `deposit()`, and `withdraw()` instead of changing it directly.
- **Methods:** Each responsibility is separated into a clear method.
- **Input validation:** Menu choices and transaction amounts are checked before an operation is performed.

## Transaction Rules

- Deposits must be greater than zero.
- Withdrawals must be greater than zero.
- A withdrawal cannot be greater than the current balance.
- Invalid menu entries are rejected and the menu is shown again.

## Sample Console Output

```text
Welcome to the ATM
===== ATM MENU =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 2
Enter deposit amount: 2000
Deposit successful.
Updated Balance: Rs. 7000.00

===== ATM MENU =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 3
Enter withdrawal amount: 3000
Withdrawal successful.
Remaining Balance: Rs. 4000.00

===== ATM MENU =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 4
Thank you for using the ATM. Goodbye!
```
=======
# ATM-JAVA-Project
>>>>>>> 8e0ebf4e0756f7fdcfbf4e96099d5fbb04d97716

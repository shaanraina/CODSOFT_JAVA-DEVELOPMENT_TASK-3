import java.util.Scanner;

// Class representing the user's bank account
class BankAccount {
    private double balance;

    // Constructor to initialize the account balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Method to withdraw an amount from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
            return false;
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
            return false;
        }
    }
}

// Class representing the ATM machine
class ATM {
    private BankAccount account;

    // Constructor to initialize the ATM with a bank account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method to display the ATM menu and process user input
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Loop to keep displaying the menu until the user chooses to exit
        while (!exit) {
            // Displaying the ATM menu options
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Reading user input
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        // Checking and displaying the account balance
                        checkBalance();
                        break;
                    case 2:
                        // Prompting the user to enter the deposit amount
                        System.out.print("Enter amount to deposit: ");
                        if (scanner.hasNextDouble()) {
                            double depositAmount = scanner.nextDouble();
                            deposit(depositAmount);
                        } else {
                            System.out.println("Invalid input. Please enter a valid amount.");
                            scanner.next(); // Clear invalid input
                        }
                        break;
                    case 3:
                        // Prompting the user to enter the withdrawal amount
                        System.out.print("Enter amount to withdraw: ");
                        if (scanner.hasNextDouble()) {
                            double withdrawAmount = scanner.nextDouble();
                            withdraw(withdrawAmount);
                        } else {
                            System.out.println("Invalid input. Please enter a valid amount.");
                            scanner.next(); // Clear invalid input
                        }
                        break;
                    case 4:
                        // Exiting the ATM interface
                        exit = true;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        // Handling invalid menu options
                        System.out.println("Invalid option. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.next(); // Clear invalid input
            }
        }
        // Closing the scanner object to release resources
        scanner.close();
    }

    // Method to check and display the account balance
    private void checkBalance() {
        System.out.println("Your current balance is $" + account.getBalance());
    }

    // Method to deposit an amount into the account
    private void deposit(double amount) {
        account.deposit(amount);
    }

    // Method to withdraw an amount from the account
    private void withdraw(double amount) {
        account.withdraw(amount);
    }
}

// Main class to run the ATM interface
class ATMInterface {
    public static void main(String[] args) {
        // Initializing the bank account with a starting balance
        BankAccount account = new BankAccount(1000.00);

        // Creating an ATM object with the bank account
        ATM atm = new ATM(account);

        // Starting the ATM interface
        atm.start();
    }
}

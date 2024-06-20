# CODSOFT_JAVA-DEVELOPMENT_TASK-3

Detailed Explanation:

BankAccount Class:

Attributes:

balance: Stores the account balance.

Constructor:

Ensures the initial balance is non-negative.

Methods:

getBalance(): Returns the current balance.

deposit(double amount): Adds the specified amount to the balance, with validation for positive amounts.

withdraw(double amount): Deducts the specified amount from the balance if sufficient funds are available, with validation for positive amounts.

ATM Class:

Attributes:

account: Holds a reference to the BankAccount object.

Constructor:

Initializes the ATM with a BankAccount object.

Methods:

start(): Displays the ATM menu and processes user input in a loop until the user chooses to exit.

checkBalance(): Displays the current account balance.

deposit(double amount): Deposits the specified amount into the account.

withdraw(double amount): Withdraws the specified amount from the account if sufficient funds are available.

ATMInterface Class (Main Class):

Main Method:

Initializes a BankAccount object with a starting balance.

Creates an ATM object with the BankAccount object.

Starts the ATM interface by calling the start method on the ATM object.

User Interface (UI) Design:

Menu Display:

Clearly displays the menu options to the user.

Prompts the user to choose an option.

User Input:

Reads the user's choice and validates the input.

Handles invalid inputs gracefully by prompting the user to enter a valid option.

Transaction Options:

Check Balance: Displays the current account balance.

Deposit Money: Prompts the user to enter an amount to deposit and validates the input.

Withdraw Money: Prompts the user to enter an amount to withdraw and validates the input.

Exit Option:

Allows the user to exit the ATM interface.

Displays a thank you message upon exiting.

Validation and Feedback:

Validates deposit and withdrawal amounts to ensure they are positive.

Provides appropriate feedback for successful and unsuccessful transactions.

Handles insufficient funds during withdrawal attempts.

This enhanced implementation ensures a comprehensive and user-friendly ATM interface, guiding the user through their options with clear instructions and feedback.

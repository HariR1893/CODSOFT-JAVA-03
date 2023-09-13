package Atm_Interfacce;

import java.util.Scanner;

//Represents an ATM machine
public class ATM {
	private Accounts account;
	private Scanner scanner = new Scanner(System.in);

	// Constructor to create an ATM with a specified bank account
	public ATM(Accounts CurrentAccount) {
		account = CurrentAccount;
	}

	// Displays the main menu of the ATM
	public void DisplayMenu() {
		System.out.println("\tATM");
		System.out.println("1. Check Balance");
		System.out.println("2. Amount Withdrawl");
		System.out.println("3. Amount Deposit");
		System.out.println("4. Exit\n");
	}

	// Runs the ATM, allowing users to perform transactions
	public void run() {
		int choice;
		do {
			DisplayMenu();
			System.out.print("Enter your choice to continue  : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				CheckBalance();
				System.out.println();
				break;
			case 2:
				withdrawl();
				System.out.println();
				break;

			case 3:
				deposit();
				System.out.println();
				break;
			case 4:
				System.out.println("Thank you for using the ATM!!!");
			}

		} while (choice != 4);
	}

	// Checks and displays the account balance
	private void CheckBalance() {
		System.out.println("You Account Balance is : " + account.getAccountBalance());
	}

	// Handles deposit operation, taking user input
	private void withdrawl() {
		try {
			System.out.println("Enter the amount to withdrawl");
			double amount = scanner.nextDouble();
			account.Withdrawl(amount);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input.. Pleace enter valid amount.");
			scanner.next();
		}
	}

	// Handles withdrawal operation, taking user input
	private void deposit() {
		try {
			System.out.println("Enter the amount to deposit");
			double amount = scanner.nextDouble();
			account.Deposit(amount);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input.. Pleace enter valid amount.");
			scanner.next();
		}
	}
}

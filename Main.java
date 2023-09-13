package Atm_Interfacce;

/*		Task 3: ATM INTERFACE
 *  1. Create a class to represent the ATM machine.
 *  2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
 *     checking the balance.
 *  3. Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance().
 *  4. Create a class to represent the user's bank account, which stores the account balance.
 *  5. Connect the ATM class with the user's bank account class to access and modify the account balance.
 *  6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
 *  7. Display appropriate messages to the user based on their chosen options and the success or failure
 *     of their transactions.
 */
 
//Main class to start the program
public class Main {
public static void main(String[] args) {
	// Create a bank account with an initial balance of 15000
	Accounts account = new Accounts(15000);
	// Create an ATM instance connected to the bank account
	ATM atm = new ATM(account);
	 // Run the ATM
	atm.run();
}
}

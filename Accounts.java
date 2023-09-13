package Atm_Interfacce;

// Represents a bank account
public class Accounts {

	private double AccountBalance;

	// Constructor to initialize the account with an initial balance
	Accounts(double initialBalance) {
		AccountBalance = initialBalance;
	}

	// Returns the current balance of the account
	public double getAccountBalance() {
		return AccountBalance;
	}

	// Deposits a specified amount into the account
	public void Withdrawl(double CurrentAmount) {
		if (CurrentAmount > 0 && CurrentAmount < AccountBalance) {
			AccountBalance -= CurrentAmount;
			System.out.println("Amount withdrawl successfully.. And the new Balance is : " + AccountBalance);
		} else if (CurrentAmount > AccountBalance) {
			System.out.println("Insufficient Balance... Try another Amount!!");
		} else {
			System.out.println("Withdrawl was unsuccessful.. Please try another amount!!");
		}
	}

	// Withdraws a specified amount from the account
	public void Deposit(double CurrentAmount) {
		if (CurrentAmount > 0) {
			AccountBalance += CurrentAmount;
			System.out.println("Amount Deposited successfully..New Balance is : " + AccountBalance);
		} else {
			System.out.println("Unsuccessful deposit..Try Again");
		}

	}
}

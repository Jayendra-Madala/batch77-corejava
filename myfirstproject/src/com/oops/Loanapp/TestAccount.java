package com.oops.Loanapp;

class Account{
	double balance = 10000;
	long accountNumber = 12475;
	
	
	void openAccount() {
		System.out.println("WELCOME TO BANKING");
		System.out.println("Your Account has been opened successfully!!");
	}
	
	void displayAccountDetails() {
		System.out.println("Your account details are : ");
	}
}

class BankAccount extends Account{
	void deposit(double amount) {
		System.out.println("Deposited amount is : " + amount);
		 balance = balance + amount;
		checkBalance();
	}


	void withdraw(double amount) {
	System.out.println("Withdraw amount is : " + amount);
	balance = balance - amount;
	checkBalance();
     }
	void checkBalance() {
	System.out.println("The current balance is : " + balance);
	}
}

	class SavingsAccount extends BankAccount{
		void calculateInterest() {
			System.out.println("Calculate interest called");
		}
	}
	public class TestAccount {

	public static void main(String[] args) {
		System.out.println("Main method started");
		SavingsAccount b1 = new SavingsAccount();
		b1.displayAccountDetails();
		b1.openAccount();
		b1.withdraw(1000);
		b1.deposit(19000);
		System.out.println("Main method ended");
	}

}

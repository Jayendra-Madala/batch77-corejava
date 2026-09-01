package com.langfundamentals.methods;
import java.util.*;
public class Bank {
	double balance = 12000.50;
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to jay's bank");
		Bank b1 = new Bank();
		b1.showbalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amounnt to deposit");
		double amount = sc.nextDouble();
		b1.deposit(amount);
		System.out.println("Enter the amounnt to withdraw");
		double amount1 = sc.nextDouble();
		b1.withdraw(amount1);
	}
	void deposit(double amount) {
		balance = balance + amount;
	    showbalance();
	}
	void showbalance() {
		System.out.println("The current balance is :" + balance);
	}
	void withdraw(double amount1) {
		 balance = balance - amount1;
		 showbalance();
	}
}

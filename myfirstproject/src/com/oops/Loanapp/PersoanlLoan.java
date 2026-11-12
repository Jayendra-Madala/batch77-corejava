package com.oops.Loanapp;

import java.util.Scanner;

public class PersoanlLoan extends Loan{
	static Scanner sc = new Scanner(System.in);
	
	void getPersonalLoanDocInfo() {
		System.out.println("Personal Loan Doc info recieved");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to personal Loan Banking");
		
		PersoanlLoan pl = new PersoanlLoan();
		
		double sal = pl.getEmpSal();
		int cibilScore = pl.getCibilScore();
		
		if(sal > 100000.00 && (cibilScore >= 300 && cibilScore <= 900) ) {
			System.out.println("Your loan can be approved and lets  start remaining process : ");
			if(pl.isAadharValid() && pl.isPanValid() && pl.isPhoneValid()) {
				System.out.println("Congrats !! Your loan got approved ..");
				 
				System.out.println("Personal loan rate of interest is : " + pl.getRateOfInterest() );
			}
			else {
				System.out.println("Something is wrong with your personal data re- check once");
			}
			
		}
		else {
			System.out.println("Your loan is rejected");
		}
	}

	double getEmpSal(){
		System.out.println("Enter your salary : ");
		double sal = sc.nextDouble();
		return sal;
	}
	
	int getEmpAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}
	
	int getCibilScore(){
		System.out.println("Enter your cibil score : ");
		int cibilScore = sc.nextInt();
		return cibilScore;
	}
	
	
	
}

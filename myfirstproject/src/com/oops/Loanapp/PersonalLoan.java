package com.oops.Loanapp;

import java.util.Scanner;

public class PersonalLoan extends LoanImpl{
	static Scanner sc = new Scanner(System.in);
	//Method overriding
	public double getRateOfInterest() {
		System.out.println("Rate of interest called from Personal Loan");
		int cibilScore = getCibilScore();
		double roi = 16.0;
		if(cibilScore > 800 && cibilScore <= 900) {
			System.out.println("Excellent :  very high approval chances.");
			roi = roi - 7.0;
		}
		else if(cibilScore > 770 && cibilScore <= 800) {
			System.out.println("Very good : preferred by most lenders ");
			roi =  roi - 6.0;
		}
		
		else if(cibilScore > 700 && cibilScore <= 760) {
			System.out.println("Good : many lenders approve. ");
			roi =  roi - 5.0;
		}
		
		else if(cibilScore > 600 && cibilScore <= 700) {
			System.out.println("Fair: needs improvement.");
			roi =  roi - 4.0;
		}
		else if(cibilScore > 300 && cibilScore <= 600) {
			System.out.println("Poor : high chance of rejection");
			roi =  roi - 3.5;
		}
		else {
			System.out.println("Invalid cibil Score !!");
		}
		return roi;
	
	}
	
	@Override
	public Double getOffer() {
		return  2.0;
	}
	
	@Override
	public void hello() {
		System.out.println("Hello method called from Personal Loan !!");
	}
	
	void getPersonalLoanDocInfo() {
		System.out.println("Personal Loan Doc info recieved");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to personal Loan Banking");
		
		//By using parent object and parent reference we can call only
		//parent class functionalities
		Loan l1 = new LoanImpl();
		
		//Parent Object child reference
		
		
		//Child Object parent reference
		Loan l2 = new PersonalLoan();
		
		//By using child object and child reference we can call both 
		//parent clas and child class functionalities.
		PersonalLoan pl = new PersonalLoan();
		
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

	public double getEmpSal(){
		System.out.println("Enter your salary : ");
		double sal = sc.nextDouble();
		return sal;
	}
	
	public int getEmpAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}
	
	public int getCibilScore(){
		System.out.println("Enter your cibil score : ");
		int cibilScore = sc.nextInt();
		return cibilScore;
	}
	
	
	
}

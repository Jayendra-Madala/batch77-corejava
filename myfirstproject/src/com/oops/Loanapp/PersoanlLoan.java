package com.oops.Loanapp;

import java.util.Scanner;

public class PersoanlLoan {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to personal Loan Banking");
		
		PersoanlLoan pl = new PersoanlLoan();
		
		double sal = pl.getEmpSal();
		int cibilScore = pl.getCibilScore();
		
		if(sal > 1000000.00 && (cibilScore >= 300 && cibilScore <= 900) ) {
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
	
	double getRateOfInterest() {
		int cibilScore = getCibilScore();
		double roi = 0;
		if(cibilScore > 800 && cibilScore <= 900) {
			System.out.println("Excellent :  very high approval chances.");
			roi = 9.0;
		}
		else if(cibilScore > 770 && cibilScore <= 800) {
			System.out.println("Very good : preferred by most lenders ");
			roi = 9.5;
		}
		
		else if(cibilScore > 700 && cibilScore <= 760) {
			System.out.println("Good : many lenders approve. ");
			roi = 10;
		}
		
		else if(cibilScore > 600 && cibilScore <= 700) {
			System.out.println("Fair: needs improvement.");
			roi = 12;
		}
		else if(cibilScore > 300 && cibilScore <= 600) {
			System.out.println("Poor : high chance of rejection");
			roi = 14;
		}
		else {
			System.out.println("Invalid cibil Score !!");
		}
		return roi;
	}
	
	boolean isAadharValid() {
		System.out.println("Enter your aadhar number : ");
		String aadhar = sc.next();
		boolean aadharStatus = aadhar.matches("[2-9][0-9]{11}");
		return aadharStatus;
	}
	
	boolean isPanValid() {
		System.out.println("Enter your pan number : ");
		String pan = sc.next();
		//ABCDE3751A
		boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panStatus;
	}
	
	boolean isPhoneValid() {
		System.out.println("Enter your phone number : ");
		String phone = sc.next();
		boolean phoneStatus = phone.matches("[6-9]{1}[0-9]{9}");
		return phoneStatus;
	}
	
	
}

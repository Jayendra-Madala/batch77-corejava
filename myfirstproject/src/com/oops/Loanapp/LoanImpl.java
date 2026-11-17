package com.oops.Loanapp;

import java.util.Scanner;
//Parent / Super / Base class
public class LoanImpl implements Loan{
	static Scanner sc = new Scanner(System.in);	
	
	public Number getOffer() {
		return 2.0;
	}
	
	@Override
	public void hello() {
		System.out.println("Hello method called from Loan !!");
	}
	
	@Override
	public double getEmpSal(){
		System.out.println("Enter your salary : ");
		double sal = sc.nextDouble();
		return sal;
	}
	
	@Override
	public int getEmpAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	@Override
	public int getCibilScore(){
		System.out.println("Enter your cibil score : ");
		int cibilScore = sc.nextInt();
		return cibilScore;
	}

	@Override
	public double getRateOfInterest() {
		System.out.println("Rate of interest called from Loan !!!");
		int cibilScore = getCibilScore();
		double roi = 15.5;
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

	@Override
	public boolean isAadharValid() {
		System.out.println("Enter your aadhar number : ");
		String aadhar = sc.next();
		boolean aadharStatus = aadhar.matches("[2-9][0-9]{11}");
		return aadharStatus;
	}

	@Override
	public boolean isPanValid() {
		System.out.println("Enter your pan number : ");
		String pan = sc.next();
		//ABCDE3751A
		boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panStatus;
	}

	@Override
	public boolean isPhoneValid() {
		System.out.println("Enter your phone number : ");
		String phone = sc.next();
		boolean phoneStatus = phone.matches("[6-9]{1}[0-9]{9}");
		return phoneStatus;
	}
	
	
}



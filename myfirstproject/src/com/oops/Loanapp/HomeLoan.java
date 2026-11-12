package com.oops.Loanapp;

public class HomeLoan extends Loan{

	public static void main(String[] args) {
		HomeLoan hl = new HomeLoan();
		if(hl.getEmpSal()>50000.00 && hl.getCibilScore()>300 && hl.getCibilScore()<=900) {
			
			if(hl.isAadharValid() && hl.isPanValid() && hl.isPhoneValid()) {
			System.out.println("Your Loan got approved!!");
			System.out.println("Home Loan Rate OF INTEREST IS : " + hl.getRateOfInterest());
			}
			
			else {
				System.out.println("Something is wrong with your personal !!, once re-check your details...");
			}
		}
		else {
			System.out.println("Your Loan got Rejected.. Please try again later.");
		}
	}

}

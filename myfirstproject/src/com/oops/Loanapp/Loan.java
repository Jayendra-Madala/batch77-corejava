package com.oops.Loanapp;

public interface Loan {
	
	public abstract double getEmpSal();
	
	int getEmpAge();
	
	int getCibilScore();
	
	double getRateOfInterest() ;
	
	boolean isAadharValid() ;
	
	boolean isPanValid();
	
	boolean isPhoneValid();
	
	void hello();
}

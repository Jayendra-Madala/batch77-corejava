package com.oops.Loanapp;

public class TestPolyDemo2 {

	public  void main(String[] args) {
		System.out.println("Main method started");
		addition();
		addition(100);
		addition(100.0F);
		addition(99.99);
	}
	
	void addition() {
		System.out.println("Addition method called");
	}

	void addition(int n) {
		System.out.println("Addition method called with int parameters : " + n);
	}
	
	void addition(long n) {
		System.out.println("Addition method called with long parameters : " + n);
	}

	void addition(float n) {
		System.out.println("Addition method called with float parameters : " + n);
	}
	
	void addition(double n) {
		System.out.println("Addition method called with double parameters : " + n);
	}
}

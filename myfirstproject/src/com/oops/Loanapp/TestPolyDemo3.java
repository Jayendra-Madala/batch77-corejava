package com.oops.Loanapp;

public class TestPolyDemo3 {

	public  void main(String[] args) {
		System.out.println("Main method started");
		add();
	}
	
	void add() {
		System.out.println("add method called");
	}

	void add(int i) {
		System.out.println("add method called with int");
	}
	
	void add(float i) {
		System.out.println("add method called with float");
	}
	
	void add(int i , int j) {
		System.out.println("add method called with int + int ");
	}

	void add(int i , float j) {
		System.out.println("add method called with int + float");
	}
	
	void add(float i , int j) {
		System.out.println("add method called with flaot + int");
	}
	

	void add(float i , float j) {
		System.out.println("add method called float + float");
	}






}

package com.oops;

public class TestPolyDemo6 {

	public  void main(String[] args) {
		System.out.println("Main  method started");
		
		addition();
		addition(10);
		addition(20,34);

		System.out.println("Main  method ended");
	}

	void addition() {
		
		System.out.println("Addition method called with no args");
		
	}
	void addition(int ...i) {
		
		System.out.println("Addition method called with one arg" + i);
		
	}
//	void addition(int i , int j) {
//		
//		System.out.println("Addition method called with two args" +  (i + j));
//		
//	}
}

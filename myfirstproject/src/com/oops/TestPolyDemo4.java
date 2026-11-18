package com.oops;

public class TestPolyDemo4 {

	public  void main(String[] args) {
		System.out.println("Main method started ");
		
		//hello(null);
		
		hello("JAVA");
		
		
		
		
		System.out.println("Main method ended ");
	}
		void hello(String s) {
		System.out.println("Hello method called with string");
	}
	
	void hello(Object o) {
		System.out.println("Hello method called with object");
	}

	void hello(Integer i) {
		System.out.println("Hello method called from integer method");
	}
}

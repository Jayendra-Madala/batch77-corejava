package com.exceptionhandling;

public class TestTryCatchFinallyDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		try {
			System.out.println("In try");
			System.out.println(10/0);;
		}
		finally {
			System.out.println("Finally !!");
		}
			System.out.println("Main method ended");
		
		
		
	}

}

package com.exceptionhandling;

public class TestTryCatchFinallyDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println(hello());
	}
	
	static int hello() {
		try {
			System.out.println("in try");
			return 111;
		}catch(Exception e) {
			System.out.println("In catch");
			return 222;
		}finally {
			return 333;
		}
	}

}

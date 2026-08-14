package com.javaintro;

public class TestDemo5 {
	
	static void method1() {
		System.out.println("Method 1 called");
		TestDemo5 obj = new TestDemo5();
		obj.method2();
		
	}
	void method2() {
		System.out.println("Method 2 called");
		method3();
		
	}
	static void method3() {
		TestDemo5 obj= new TestDemo5();
		obj.method4();
		System.out.println("Method 3 called");
	}
	void method4() {
		System.out.println("Method 4 called");
		method5();
	}
	void method5() {
		System.out.println("Method 5 called");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		method1();
		System.out.println("Main method ended");
	}

}





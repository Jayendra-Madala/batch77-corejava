package com.javaintro;

public class TestDemo2 {
	//instance method
	void welcome() {
		System.out.println("Welcome to java");
		System.out.println(Thread.currentThread());
	}
	//static method
	static void hello() {
		System.out.println("hello ! Good Morning");
	}
	//static main method
	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Main method ended");
		hello();
		TestDemo2 obj = new TestDemo2();
		obj.welcome();
		
		
	}

}

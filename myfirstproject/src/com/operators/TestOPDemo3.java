package com.operators;

public class TestOPDemo3 {
// Unary operators
	public static void main(String[] args) {
		System.out.println("Main methos started");
		
		int a = 5;
		int b = 6;
		
		System.out.println(+a);
		System.out.println(-b);
		System.out.println(++a);
		System.out.println(--b);
		System.out.println(a++);
		System.out.println(b--);
		
		System.out.println("Main method ended");
		
		System.out.println(++a + b++ + a-- + b--);
		
		System.out.println(a++ + ++b + --b + a-- + b++ + ++a + b++);
	}

}

package com.operators;

// Logical operators
public class TestOPDemo5 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(++a > 15 && ++a + 19 >  16);
		System.out.println("A value is : " + a);
		
		System.out.println(true && true);//true
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(!(false));
		System.out.println(!(true));
	}

}

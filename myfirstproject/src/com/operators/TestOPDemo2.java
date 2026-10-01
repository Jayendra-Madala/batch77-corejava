package com.operators;

public class TestOPDemo2 {
//Assignment operators = , += , -= , *= , /= , %=
	public static void main(String[] args) {
		
//		int result = 5;
//		result = (int)(result + 4.5);
//		
		int result = 4;
		result += 4.5; // o/p is 8 called narrowing
		System.out.println("Result is : " + result);
		
		double result1 = 5.5;
		result1 += 4;  // o/p is 9.5 and the process is called widening
		System.out.println("Result is : " + result1);

		
		result -= 3;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		
		result /= 2;
		System.out.println(result);
	
		result %= 2;
		System.out.println(result);
		
	}

}

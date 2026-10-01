package com.operators;
//Ternary operators
public class TestOPDemo8 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int a = 100;
		int b = 50;
		
		int max = (a > b) ? a : b;
		System.out.println("MAX value is : " + max);
		
		int x = 10;
		int y = 20;
		int z = 15;
		
		int max1 = (x > y)?((x>z)?x:y):((y > z)?y:z);
		System.out.println("Max is : " + max1);
				
		int age = 21;
		String eligible = (age > 18)?"Yes":"No";
		System.out.println("The person is eligible to vote" + eligible);
				
		
		System.out.println("Main method ended");
	}

}

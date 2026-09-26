package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator!!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your 1st number : ");
		double a = sc.nextDouble();
		System.out.println("Enter your 2nd number : ");
		double b = sc.nextDouble();
		
		System.out.println("Enter a symbol : ");
		
		String symb = sc.next();
		
		switch(symb) {
		case "+" :
			System.out.println("Sum of 2 nums is :" + (a + b));
			break;
		case "-" :
			System.out.println("Differencce of 2 nums is :" + (a - b));
			break;
		case "*" :
			System.out.println("Multiplication of 2 nums is :"+ (a * b));
			break;
		case "/" :
			System.out.println("Division of 2 nums is :" + (a / b));
			break;
		case "%" :
			System.out.println("Remainder of 2 nums is :" + (a % b));
			break;	
		default :
			System.out.println("Invalid operation");
			
		}
		
	}

}

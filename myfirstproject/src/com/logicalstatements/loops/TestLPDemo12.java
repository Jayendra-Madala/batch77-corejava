package com.logicalstatements.loops;

//WAP to convert from decimal to binary number
import java.util.Scanner;

public class TestLPDemo12 {
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your decimal number : ");
		int n = sc.nextInt();
		
		convertToBinary(n);
		
		
		
		
	}
	
	public static void convertToBinary(int n){
		
		int rem = 0;
		String str = " ";
		
		while(n > 0) {
			rem = n % 2;
			n = n / 2;
			str = rem + str;
		}
		System.out.println("Binary number is : " + str);
	}
	
}	
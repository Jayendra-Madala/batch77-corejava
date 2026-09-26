package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("Welcome to V Cube shopping mall");
		System.out.println("Enter your T Shirt Size : ");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();

		switch(size) {
		case 40 :
			System.out.println("Based on your T shirt number your size would be Xl");
			System.out.println("Cost is 999/-");
			break;
		case 38 :
			System.out.println("Based on your T shirt number your size would be l");
			System.out.println("Cost is 899/-");
			break;
		case 36 :
			System.out.println("Based on your T shirt number your size would be m");
			System.out.println("Cost is 799/-");
			break;
		case 34 :
			System.out.println("Based on your T shirt number your size would be s");
			System.out.println("Cost is 699/-");
			break;
			
		default :
			System.out.println("Size is not available");
		}
	}

}

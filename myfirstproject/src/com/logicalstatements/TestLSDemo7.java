package com.logicalstatements;

import java.util.Scanner;
public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter jersey number : ");
		int jsno = sc.nextInt();
		
		switch(jsno) {
		
			case 7:
				System.out.println("MSD + Jersey number : 7");
				System.out.println("Captain cool");
				System.out.println("Great batsmen ");
				break;
			
			case 18:
				System.out.println("Virat kohli + Jersey number : 18");
				System.out.println("King of Indian criket");
				System.out.println("GOAT OF ODI");
				break;
				
			case 45:
				System.out.println("Rohit Sharma + Jersey number : 45");
				System.out.println("GOOD Captain & BAtsman");
				break;
			
			case 3:
				System.out.println("Vaibhav sooryavanshi + Jersey number 3");
				System.out.println("Pocket dynamite");
				break;
				
			default:
				System.out.println("Entered Jersey number is not in my favourite List");
		}
		System.out.println("Main method ended");
	}

}

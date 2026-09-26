package com.logicalstatements;

import java.util.*;

//console based application
//checking eligibility for marriage in matimony site

public class TestLSDemo6 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to v cube matrimonial");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name : ");
		String fullName = sc.nextLine();
		
		System.out.println("Hello mr ." + fullName +"nice to meet you");
		System.out.println("Can you please enter your assets : ");
		double assets = sc.nextDouble();
		
		System.out.println("Can you please enter your salary : ");
		
		double sal = sc.nextDouble();
		
		if(assets >= 50000000.00 || sal >= 2500000.00) {
			System.out.println("okay !! lets continue the discussion");
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			if(age >=26 && age <= 29) {
				System.out.println("Ok to go we will discuss more ");
				
				System.out.println("Enter your height !! ");
				float height = sc.nextFloat();
				
				if(height >= 5.5 && height <= 6.2) {
					System.out.println("ok your height is matching with our profile lets continue");
					System.out.println("Enter your weight !!");
					int weight = sc.nextInt();
					if(weight >=65 && weight <= 75 ) {
						System.out.println("Ok! cool ! good to go");
						
						System.out.println("Do you have syblings !! ?");
						boolean is_siblings = sc.nextBoolean();
						
						if(is_siblings == false) {
							System.out.println("Congractulations !! You meet our criteria");
						}
						
						else {
							System.out.println("Sorry we will get back to you");
						}
					}
					
					else {
						System.out.println("You must need to join gym");
					}
				}
				else {
					System.out.println("You are short or long");
				}
				
			}
			else {
				System.out.println(" Sorry !! Your age is not maatching with our profile!!");
			}
		}
		
		
		else {
			System.out.println("You can leave for the day");
			System.out.println("Concentrate chey ra babu careeer meedha ");
		}
	}

}

package com.langfundamentals.methods;
import java.util.*;
public class Employeesalinfo {
	
	Scanner sc = new Scanner(System.in);
	
	 void main(String[] args) {
		System.out.println("Main method started");
		double bonus = getBonus();
		double hra = getHRA();
		double basicsal = getbasicsal();
		System.out.println("Your bonus is : " + bonus);
		System.out.println("Your hra is : " + hra);
		System.out.println("Your basicsal is : " + basicsal);
		
		
		System.out.println("Main method ended");
	}
	
	double getBonus() {

		System.out.println("Enter your bonus : ");
		
		double bonus = sc.nextDouble();
		return bonus;
	}
		
	double	getHRA(){
	System.out.println("Enter your hra : ");
	
	double hra = sc.nextDouble();
	return hra;
}
		double getbasicsal(){
			System.out.println("Enter your basic sal : ");
			double sal = sc.nextDouble();
			
			return sal;
		}
		
}

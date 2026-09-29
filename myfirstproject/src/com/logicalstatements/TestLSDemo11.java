package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day number : ");
		int day = sc.nextInt();
		String info = getDayInfo(day);
		System.out.println(info);
				
	
	}

	private static String getDayInfo(int day) {
		
		String info = switch(day) {
		case 1 ->{
			System.out.println("It is a holiday");
			yield  "Sunday";
			
		}
		case 2 ->{
			System.out.println("It is a lazy day");
			yield "Monday";
		}
		
		case 3,4,5 ->{
			System.out.println("These are routine days !!");
			yield "TWTH";
		}
		
		case 6 ->{
			System.out.println("Preparation day");
			yield "Friday";
			
		}
		
		case 7 ->{
			System.out.println("Exam day !!");
			yield "saturday";
		}
		default -> "not available";
		};
		
		
		return info;
	}
}

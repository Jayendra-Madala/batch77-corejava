package com.languagefundamentals;

public class TestDataTypesDemo3 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);
		Integer i1 = 10;  // wrapper object 
		System.out.println(i1);
		
		int i2 =  i1; // storing wrapper object data in primitive data is called auto boxing
		System.out.println(i2);
		System.out.println("Main method ended");
	}

}

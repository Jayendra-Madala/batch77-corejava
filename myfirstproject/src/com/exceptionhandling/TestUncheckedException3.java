package com.exceptionhandling;

public class TestUncheckedException3 {

	public static void main(String[] args) {
		String s1 = "Java";
		System.out.println(s1.length());
		
		String s2 = "Jay";
		System.out.println(s2.length());
		
		try {
		String s3 = "null";
		//null.any operation is called null pointer exception
		System.out.println(s3.length());
		}
		
		catch(Exception e) {
			System.out.println("In catch");
			
			System.err.println(e.getStackTrace());
			System.out.println(e);
			
		}
		String s4 = null;
		System.out.println(s4.length());
	}

}

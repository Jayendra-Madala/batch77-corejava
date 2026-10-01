package com.operators;

public class TestOPDemo4 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);
		
		String s3 = "jay";
		String s4 = new String("jay");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		int a = 10;
		int b = 20;
		int c = 10;
		
		System.out.println(a != b);//true
		System.out.println(a != c);//false
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(a < b);//true
		System.out.println(a <= b);//true
		System.out.println(a <= c);//true
		
		System.out.println(b < c);//false
		System.out.println(b >= c);//true
		System.out.println(b == c);//false
		
		System.out.println("-----------------------------------------------------------------------------------");
		float f = 5.9f;
		double f1 = 5.9;
		System.out.println(a == b);//false
		System.out.println(a==c);//true
		
		System.out.println(f == f1);//false
	}

}

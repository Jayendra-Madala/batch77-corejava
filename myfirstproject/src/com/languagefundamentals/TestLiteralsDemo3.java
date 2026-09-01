package com.languagefundamentals;

public class TestLiteralsDemo3 {

	public static void main(String[] args) {
		//null literals
		String s3 = null;
		TestLiteralsDemo3 td = null;
		
		//String literals
		String s1 = "Java";
		String s2 = new String("JAy loves java");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		//bool literals
		boolean status = true;
		if(status) {
			System.out.println("Congrats i will definitely get a job");
		}
		else {
			System.out.println("God will save you");
		}
		
		//char literals
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0040';
		char c4 = '\ufaaa';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	
	}

}

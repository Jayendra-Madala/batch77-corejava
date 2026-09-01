package com.languagefundamentals;

public class Student3 {
	//primitive + static
	static int rollno = 19;
	//Object + static
	static String clgname = " V cube";
	
	//primitive + instance
	int phno = 1234;
	//object + instance
	String stname = "JAY";
	
	public static void main(String[] args) {
	int rollno = 19;
	String stname = "JAY";
	String clgname = " V cube";
	
	System.out.println(stname);
	System.out.println(clgname);
	System.out.println(rollno);
	System.out.println(clgname);
	Student3 s3= new Student3();
	System.out.println(s3.phno);
	System.out.println(s3.stname);
	}

}

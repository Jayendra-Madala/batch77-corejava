package com.javaintro;

public class Student {
	int sid ;
	String sname ;
	static int collegeId = 123;
	static String collegeName  = "KITS" ;
	public static void main(String[] args) {
		Student jay = new Student();
		System.out.println("College Name : "+collegeName);
		System.out.println("CollegeId : "+collegeId);
		System.out.println("Student id : "+jay.sid);
		System.out.println("Student name : "+jay.sname);
		
		Student charan = new Student();
		System.out.println("College NAme :"+collegeName);
		System.out.println("College ID :"+collegeId);
		charan.sname = "cherry";
		charan.sid = 99;
		System.out.println("StudentName : "+charan.sname);
		System.out.println("Studebnt ID : "+charan.sid);
		
		Student aryan = new Student();
		int collegeId = 21;
		String collegeName = "v Cube";
		System.out.println("College NAme :"+collegeName);
		System.out.println("College ID :"+collegeId);
		System.out.println("StudentName : "+charan.sname);
		System.out.println("Studebnt ID : "+charan.sid);
		
		
		Student king = new Student();
		
		System.out.println("College NAme :"+collegeName);
		System.out.println("College ID :"+collegeId);
		System.out.println("StudentName : "+king.sname);
		System.out.println("Studebnt ID : "+king.sid);
		
	}

}

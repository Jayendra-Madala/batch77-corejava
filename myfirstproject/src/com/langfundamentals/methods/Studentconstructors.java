package com.langfundamentals.methods;

public class Studentconstructors {
	
	int rollno;
	String name;
	int age;
	// No arg constructor
	Studentconstructors(){
		System.out.println("NO arg constructor called");
		rollno = 100;
		name = "Jay";
		age = 22;
	}

		//parameterized constructor
		Studentconstructors(int rollno,String name,int age){
			System.out.println("Parameterized constructor called");
			this.rollno = rollno;
			this.name = name;
			this.age = age;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Studentconstructors s1 = new Studentconstructors();
		s1.studentInfo();
		
		Studentconstructors s2 = new Studentconstructors(19,"jay",22);
		s2.studentInfo();
		
		Studentconstructors s3 = new Studentconstructors(20,"King",23);
		s3.studentInfo();
		
		System.out.println("Main method ended");
	}
	
	void studentInfo() {
		System.out.println("Roll Number is " + rollno);
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
	}

}

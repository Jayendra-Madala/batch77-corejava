package com.langfundamentals.methods;

public class Student {
	void read() {
	System.out.println("Read method called");	
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Student s1 = new Student();
		s1.read();
		s1.getname();
		s1.write();
		
		System.out.println("Main method ended");
	}
	void getname() {
		System.out.println("My name is jay");
	}
	void write() {
		System.out.println("Write method called");
	}

}

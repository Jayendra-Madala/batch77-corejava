package com.langfundamentals.methods;

public class Employee2 {
	
	int eid;
	String name;
	
	Employee2(){
		System.out.println("NO arg constructor called");
	}
	
	//copy constructor
	Employee2(Employee2 e){
		eid = e.eid;
		name = e.name;
	}
	public static void main(String[] args) {
		
	   System.out.println("Main method started !!");
	   
	   Employee2 e2 = new Employee2();
	   
	   e2.eid = 101;
	   e2.name = "JAY";
	   e2.display();
	   
	   Employee2 e3 = new Employee2(e2);
	   e3.display();
	   System.out.println(e2);
	   System.out.println(e3);
	}
	void display() {
		System.out.println("Employee id : " + eid);
		System.out.println("Employee name : " + name);
	}
}

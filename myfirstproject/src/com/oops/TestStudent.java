package com.oops;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add = new Address("Hyd");
		Student s1 = new Student(101 , "Srikanth" , add);
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------");
		
		
		Student s2 = (Student)s1.clone();
		

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------");
		
		
	}
}
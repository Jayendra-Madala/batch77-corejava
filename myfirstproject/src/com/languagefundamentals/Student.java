package com.languagefundamentals;
import java.util.*;
public class Student {
	int student_id;
	String student_name;
	int student_age;
	
	void hello() {
		System.out.println("hello method called");
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.student_id);
		System.out.println(s1.student_name);
		System.out.println(s1.student_age);
		s1.hello();
	}

}

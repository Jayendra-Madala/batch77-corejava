package com.langfundamentals.methods;
//no return type with parameters
public class Person {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Person p1 = new Person();//arguments
		p1.getPersonName("Jayendra");
		p1.getAge(22);
		p1.getHeight(6.2f);
		
		System.out.println("Main method ended");
	}
	void getPersonName(String name) {
		System.out.println("Name of the person is :" +name );
	}
	void getAge(int age) {
		System.out.println("Person Age is : " + age);
	}
	void getHeight(float height) {
		System.out.println("Person height is : " + height);
	}
	
}

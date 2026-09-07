package com.langfundamentals.methods;


//parent class or super classs or base class
public class Animal {
	String breed = "persian";
	int age = 3;
	
	Animal(){
		System.out.println("Animal constructor called");
	}
	public static void main(String[] args) {
		System.out.println("Main method started from Animal class");
	}

}

class Dog extends Animal{

	String breed = "german shepherd";
	int age = 4;
	
	Dog(){
		System.out.println("Dog construtor called");
	}
	public static void main(String args[]) {
		System.out.println("Main method started from Dog class");
		
		Dog d = new Dog();
		d.dogInfo();
		
	}
	
	void dogInfo(){
		System.out.println("Breed of the cat : " + super.breed);
		System.out.println("Age of the cat : " + super.age);
		System.out.println("Breed of the dog : " + this.breed);
		System.out.println("Age of the dog : " + this.age);
		
	}
}
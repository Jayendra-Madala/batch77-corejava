package com.oops.Loanapp;

class Animal{
	public static void main(String args[]) {
		
	}
	 String sound() {
		return "Bow Bow";
	}
}

class Dog extends Animal{
public static void main(String args[]) {
	 
}
@Override
String sound() {
	return "Bow Bow hoooo";
}
}

public class TestDemo1 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println(d1.sound());
	}

}

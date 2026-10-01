package com.operators;

class A{
	
}

class B extends A{
	
}
public class TestInstanceOfDemo2 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(a instanceof A);
		System.out.println(a instanceof Object);
		System.out.println(b instanceof A);
		System.out.println(b instanceof Object);
	
		
	}

}

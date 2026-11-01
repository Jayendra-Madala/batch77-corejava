package com.accessmodifiers01;

public class TesteDemo1 {

	int sid1 = 1 ; 
	String name = "Jayendra";
	
	void method1() {
		System.out.println("Method1 called");
	}
	
	public static void main(String[] args) {
		TesteDemo1 td1 = new TesteDemo1();
		System.out.println(td1.sid1);
		System.out.println(td1.name);
		td1.method1();
	}

}

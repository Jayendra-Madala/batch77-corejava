package com.accessmodifiers01;

public class TesteDemo1 {
	//protected data members
	protected int sid4 = 7;
	protected String sname4 = "Thala !!!";
	
	protected void method4() {
		System.out.println("Method 4 called !!");
	}
	
	//public data members
	public int sid3 = 45;
	public String sname3 = "Rohit";
	
	static {
		System.out.println("Static block called");
	}
	
	{
		System.out.println("Instance block called");
	}
	public void method3() {
		System.out.println("Method 3 called ");
	}
	//default data members
	int sid2 = 18;
	String name2 = "KING";
	
	void method2() {
		System.out.println("Method 2 called");
	}
	//private data members
	private int sid1 = 1 ; 
	private String name = "Jayendra";
	
	void method1() {
		System.out.println("Method1 called");
	}
	
	public static void main(String[] args) {
		TesteDemo1 td1 = new TesteDemo1();
		
		//Accessing private data members with in the class 
		System.out.println(td1.sid1);
		System.out.println(td1.name);
		td1.method1();
		
		//Accessing default data members with in the class
		System.out.println(td1.name2);
		System.out.println(td1.sid2);
		td1.method2();
		
		
		//Accessing protected data members
		System.out.println(td1.sname4);
		System.out.println(td1.sid4);
		td1.method4();
	}

}

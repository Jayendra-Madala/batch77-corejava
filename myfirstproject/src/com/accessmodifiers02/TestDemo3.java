package com.accessmodifiers02;

import com.accessmodifiers01.*;

public class TestDemo3 extends TesteDemo1{

	public static void main(String[] args) {
		System.out.println("Main method started from test demo 3 ");
		
		TesteDemo1 td1 = new TesteDemo1();
		
		System.out.println(td1.sid3);
		System.out.println(td1.sname3);
		td1.method3();
		
		//Accessing protected data members from super class
		TestDemo3 t3 = new TestDemo3();
		t3.method4();
		System.out.println(t3.sid4);
		System.out.println(t3.sname4);
		System.out.println("Main method started from test demo 3 ");
	}

}

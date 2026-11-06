package com.accessmodifiers01;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started from TestDemo2 ");
		
		TesteDemo1 t1 = new TesteDemo1();
		
		System.out.println(t1.name2);
		
		t1.method2();
	}

}

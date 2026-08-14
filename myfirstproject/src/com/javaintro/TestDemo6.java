package com.javaintro;

public class TestDemo6 {
	void method1() {
		System.out.println("Method1 called");
		method2();
	}
	void method2() {
		System.out.println("Method2 called");
		method3();
	}
	void method3() {
		System.out.println("Method3 called");
		method4();
	}
	void method4() {
		System.out.println("Method4 called");
		method5();
	}
	void method5() {
		System.out.println("Method5 called");
		method6();
	
	}
	void method6() {
		System.out.println("Method6 called");
	}
	public static void main(String[] args) {
		System.out.println("MAin method started");
		TestDemo6 t= new TestDemo6();
		t.method1();
	}

}

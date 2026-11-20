package com.oops.abstracation;

interface In1{
	
	void method1();
	
	void method2();
}

interface In2{
	
	void method2();
	
	void method3();
}

interface In3 extends In1,In2{
	
	
}


	public class TestIn3Impl implements In3{

	@Override
	public void method1() {
		
		System.out.println("Method 1 called");		
	}

	@Override
	public void method2() {
		
		System.out.println("Method 2 called");		
		
	}

	@Override
	public void method3() {
		
		System.out.println("Method 3 called");		
		
	}
	
	
	
	
}
	
	 class TestDemo2{
		public static void main(String args[]) {
			TestIn3Impl t = new TestIn3Impl();
			t.method1();
			t.method2();
			t.method3();
			
		}
	}

package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Employee emp1 = new Employee();
		
		emp1.setEid(72);
		emp1.setEname("Tilak Varma");
		emp1.setEsal(1000000.00);
		
		
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getEsal());
		
		System.out.println("Main method ended");

	}

}

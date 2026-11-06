package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		
		//Parameterised constructor
		Employee emp2 = new Employee(77,"Jay" , 1200000.00);
		System.out.println(emp2.getEid());
		System.out.println(emp2.getEname());
		System.out.println(emp2.getEsal());
		Employee emp1 = new Employee();
		System.out.println("************************************************************************");
		
		//Modifying the data  Setters
		emp1.setEid(72);
		emp1.setEname("Tilak Varma");
		emp1.setEsal(1000000.00);
		
		//Reading the data  Getters
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getEsal());
		
		System.out.println("Main method ended");

	}

}

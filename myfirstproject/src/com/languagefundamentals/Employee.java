package com.languagefundamentals;

public class Employee {
	static String orgName = "V cube";
	
	int eid;
	double esal;
	String ename;
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		Employee e1 = new Employee();
		System.out.println(orgName);
		System.out.println(Employee.orgName);
		System.out.println(e1.orgName);
		
		
		Employee e2 = null;
		System.out.println(orgName);
		System.out.println(e1.eid);
		System.out.println(e1.esal);
		System.out.println(e1.ename);
		
		System.out.println("Main method ended");
	}

}

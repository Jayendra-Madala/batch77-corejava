package com.oops.copy;

class Employee{
	int eid;
	double sal;
	String name;
	Address1 add;
	public Employee(int eid, double sal, String name, Address1 add) {
		super();
		this.eid = eid;
		this.sal = sal;
		this.name = name;
		this.add = add;
	}
	//copy constructor
	public Employee(Employee emp) {
		super();
		this.eid = emp.eid;
		this.sal = emp.sal;
		this.name = emp.name;
		this.add = new Address1(emp.add);
	
	}
}

class Address1{

	String city;
	
	public Address1(String city) {
		super();
		this.city = city;
	}

	//copy constructor
	public Address1(Address1 add) {
		this.city = add.city;
	}
}



public class TestDeepCopyDemo1 {

	public static void main(String[] args) {
		Address1 add = new Address1("VNK");
		
		Employee emp1 = new Employee(102,1234567.00,"KIng",add);
		
		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.eid);
		System.out.println(emp2.sal);
		System.out.println(emp2.name);
		System.out.println(emp2.add.city);
		emp2.add.city = "hyd";
		System.out.println(emp2.add.city);
		System.out.println(emp1.add.city);
	}

}

package com.languagefundamentals;

class Student1{
	int sid;
	String sname;
	Address address;
}

class Address{
	String city;
	String state;
	String country;
}


public class TestDataTypesDemo4 {

	public static void main(String[] args) {
		
		
		Student1 s1 = new Student1();
		s1.sid = 101;
		s1.sname = "jay";
		s1.address = new Address();
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address);
		
		System.out.println(s1.address.city = "Hyderabad");
		System.out.println(s1.address.state = "Telanagana");
		System.out.println(s1.address.country = "INDIA");
	}

}

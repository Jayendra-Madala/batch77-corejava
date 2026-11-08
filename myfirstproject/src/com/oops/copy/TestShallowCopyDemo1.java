package com.oops.copy;

class Student implements Cloneable{
	int sid;
	String name;
	Address address;
	public Student(int sid, String name, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


class Address{
	public Address(String string) {
		// TODO Auto-generated constructor stub
	}

	String city;
}
public class TestShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address address = new Address("Guntur");
		Student s1 = new Student(1,"JAYEND",address);
		
		Student s2 = (Student)s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		
		s2.address.city = "NRT";
		System.out.println(s1.address.city);
		System.out.println(s2.address.city);
		
	}

}

package com.langfundamentals.methods;
// Random methods

interface In1{
	public abstract	void method1();
}

class Employee1 {
	int age;
	float height; 
	double weight; 
	double sal;
}
public class Testdemo1 {
	
	int addition(int a , int b) {
		byte sum =(byte) (a + b);
		return sum;
		
	}
	int getGen() {
		char c = 'M';
		return c;
	}
	
	char getAge() {
		int age = 21;
		return (char)age;//int cannot convert to char so we need to do explicit type casting
	}
	
Employee1 	getEmpDet(int age,float height , double weight , double sal){
		Employee1 e1= new Employee1();
		System.out.println(e1.age = age);
		e1.height = height;
		e1.weight = weight;
		e1.sal = sal;
		return e1;
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		Testdemo1 td1 = new Testdemo1();
		Employee1 e1 = td1.getEmpDet(21,5.8f,87,50000);
		
		//System.out.println(e1.age);
		System.out.println(e1.height);
		System.out.println(e1.weight);
		System.out.println(e1.sal);
		System.out.println("Main methnd ended");
	}

}

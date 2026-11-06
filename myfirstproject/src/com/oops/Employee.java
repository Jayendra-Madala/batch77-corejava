package com.oops;

//Data Tranfer object : DTO
//POJO : Plain Old Java Object
//Data Model
public class Employee {

	private int eid;
	private String ename;
	private double esal;
	public int getEid() {
		return eid;
	}
	
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	
	
}

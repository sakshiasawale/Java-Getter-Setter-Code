package com.accessprivatemembersthroughpublicmethod;

public class Student {

	private int id;
	private String name;
	private String address;
	private double fees;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setId(29);
		System.out.println("Student ID:"+s.getId());
		
		s.setName("Sakshi");
		System.out.println("Student Name:"+s.getName());
		
		s.setAddress("Takve BK");
		System.out.println("Student Address:"+s.getAddress());
		
		s.setFees(900000);
		System.out.println("Student Fees:"+s.getFees());
	}
	
}

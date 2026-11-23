package com.validatesalaryusingnegativevalues;

public class Salary {

	private double salary;
	
	public void setSalary(double Salary)
	{
		salary = Salary;
		if(salary >= 0)
		{
			System.out.println("Salary is Updated");
		}
		else
		{
			System.out.println("Invalid Salary");
		}
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args) {
		Salary s = new Salary();
		s.setSalary(5000);
		System.out.println(s.getSalary());
		
		
		s.setSalary(-9000);
		System.out.println(s.getSalary());
		
	}
}

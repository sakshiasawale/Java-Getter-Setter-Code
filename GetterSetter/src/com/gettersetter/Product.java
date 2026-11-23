package com.gettersetter;

public class Product {

	private int pid;
	private String name;
	private double price;
	
	public int getPid()
	{
		return pid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPid(int Pid)
	{
		pid = Pid;
	}
	
	public void setName(String Name)
	{
		name = Name;
	}
	
	public void setPrice(double Price)
	{
		price = Price;
	}
}

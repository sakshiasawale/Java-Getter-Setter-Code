package com.gettersetter;

public class MainClass {

	public static void main(String[] args) {
		
		Product p =new Product();
		p.setPid(29);
		p.setName("Sakshi");
		p.setPrice(9000);
		
		System.out.println(p.getPid()+" "+p.getName()+" "+p.getPrice());
	}
	
	
	
	
}

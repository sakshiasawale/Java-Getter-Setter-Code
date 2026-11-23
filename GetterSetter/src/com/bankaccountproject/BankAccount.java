package com.bankaccountproject;

import java.util.Scanner;

public class BankAccount {

	private double balance;
	Scanner sc = new Scanner(System.in);
	
	public void deposite()
	{
		System.out.println("Enter Your Balance Amount:");
		balance = sc.nextDouble();
		
		System.out.println("Enter Your Deposite Amount:");
		double amount = sc.nextDouble();
		
		if(amount >=0)
		{
			balance = balance + amount;
			System.out.println("Total Balance:"+balance);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}

	public void withdraw()
	{

		System.out.println("Enter Your Withdraw Amount");
		double amount1 = sc.nextDouble();
		
		if(amount1 <=0)
		{
			System.out.println("Not Valid");
		}
		else if(amount1 <= balance)
		{
			
			balance = balance - amount1;
			System.out.println("Total balance:"+balance);
		}
		else
		{
			System.out.println("Invalid Balance");
		}
	}
		
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposite();
		b.withdraw();
	}
}

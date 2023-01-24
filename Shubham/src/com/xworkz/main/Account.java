package com.xworkz.main;

class Account 
{
	private String bank;
	private String name;
	private long accno;
	private String ifsc;
	private String email;
	private String branch;
	private int pin;
	private double balance;

	public String getBank()
	{
		return bank;
	}
	public String getName()
	{
		return name;
	}
	public long getAccno()
	{
		return accno;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String oldmail,String newmail)
	{
		if (oldmail==email)
		{
			email=newmail;
			System.out.println("Email updated! ");
		}
		else
		{
			System.out.println("Incorrect details");
		}
	}
	public String getBranch()
	{
		return branch;
	}
	public void setpin(int oldpin,int newpin)
	{
		if (oldpin==pin)
		{
			this.pin=newpin;
			System.out.println("Pin Updated");
		}
		else
		{
			System.out.println("Incorrect Pin");
		}
	}
	public double getbalance(long accno,int pin)
	{
		if (accno==this.accno && this.pin==pin)
		{
			return balance;
		}
		else
		{
			System.out.println("Incorrect details");
			return 0;
		}
	}
	public void deposit(long accno,int pin,double amount)
	{
		if (this.accno==accno && this.pin==pin)
		{
			balance=balance+amount;
			System.out.println("Updated balance is: "+balance);
		}
		else
		{
			System.out.println("Incorrect details!");
		}
	}
	public void withdraw(long accno,int pin,double amount)
	{
		if (this.accno==accno && this.pin==pin)
		{
			if (amount>=1)
			{
				if(balance-amount>=2000)
				{
					balance=balance-amount;
					System.out.println(amount+"debited! your balance is: "+balance);
				}
				else
				{
					System.out.println("Insuffient Balance!");
				}
			}
			else
			{
				System.out.println("Enter amount Atleast 1 rupees");
			}
		}
		else
		{
			System.out.println("Incorrect Account details");
		}
	}
	Account(){}

	Account(String name,long accno,String ifsc,String branch,int pin,String email,
			double balance,String bank)
	{
		this.bank=bank;
		this.name=name;
		this.accno=accno;
		this.ifsc=ifsc;
		this.pin=pin;
		this.branch=branch;
		this.balance=balance;
		this.email=email;
		System.out.println("Mr/Ms "+name+"Account Created");
	}
}

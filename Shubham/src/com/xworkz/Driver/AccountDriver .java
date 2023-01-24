package com.xworkz.Driver;

class AccountDriver 
{
	public static void main(String[] args) 
	{
		Account acc=new Account("Shubham Kambale",0512500101620701l,"KARB000051","Bagalkot",2343,"kambleshubham394@gmail.com",
							500000.00,"Karnataka Bank");
		//a1.balance=0;	//CTE
		System.out.println(acc.getbalance(0512500101620701l,2343));

		acc.setpin(2343,3234);

		acc.deposit(0512500101620701l,3234,10000);

		acc.withdraw(0512500101620701l,3234,1000.00);

		System.out.println(acc.getbalance(0512500101620701l,3234));
	}
}

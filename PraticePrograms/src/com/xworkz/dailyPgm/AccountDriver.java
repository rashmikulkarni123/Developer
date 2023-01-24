
package com.xworkz.dailyPgm;

public class AccountDriver {
	public static void main(String[] args) 
	{
		Account a1=new Account("Shubham Kambale",0512500101620701l,"KARB000051","Bagalkot",2343,"kambleshubham394@gmail.com",
							500000.00,"Karnataka Bank");
		//a1.balance=0;	//CTE
		System.out.println(a1.getbalance(0512500101620701l,2343));

		a1.setpin(2343,3234);

		a1.deposit(0512500101620701l,3234,10000);

		a1.withdraw(0512500101620701l,3234,1000.00);

		System.out.println(a1.getbalance(0512500101620701l,3234));
	}

}

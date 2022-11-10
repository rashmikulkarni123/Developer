package com.xworkz.copy.Inheritane.ShoppingMall.constor;

public class Orien extends ShoppingMall {
	public boolean isMall;
public Orien(String location, int dailyVisitors,boolean isMall) {
		super(location, dailyVisitors);
		this.isMall=isMall;
		
	}

public void display()
{
	super.display();
	System.out.println(isMall);
	
}



}

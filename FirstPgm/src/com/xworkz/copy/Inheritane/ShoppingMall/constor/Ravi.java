package com.xworkz.copy.Inheritane.ShoppingMall.constor;

public class Ravi extends Criminal{
public double height;

	public Ravi(String name, int shirtno,double height) {
		super(name, shirtno);
		this.height=height;
		
	}
	public void display()
	{
		super.display();
		System.out.println(height);
		
	}
}

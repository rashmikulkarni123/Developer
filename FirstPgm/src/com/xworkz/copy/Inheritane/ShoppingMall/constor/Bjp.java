package com.xworkz.copy.Inheritane.ShoppingMall.constor;

public class Bjp extends PoliticalParty {
	public int femaleLeader;
	public Bjp(String leader, int members) {
		super(leader, members);
}
public void display()
{
	super.display();
	System.out.println(femaleLeader);
	
}
}
	



package com.xworkz.copy.Inheritane.ShoppingMall.constor;

public class PoliticalParty {
	public String leader;
	public int members;
	public PoliticalParty(String leader, int members) {
		super();
		this.leader = leader;
		this.members = members;
	}
	public void display()
	{
		System.out.println(leader);
		System.out.println(members);
		
		
	}

}

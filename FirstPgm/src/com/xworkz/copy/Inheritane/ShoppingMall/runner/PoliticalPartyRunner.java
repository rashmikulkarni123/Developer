package com.xworkz.copy.Inheritane.ShoppingMall.runner;

import com.xworkz.copy.Inheritane.ShoppingMall.constor.Bjp;
import com.xworkz.copy.Inheritane.ShoppingMall.constor.PoliticalParty;

public class PoliticalPartyRunner {
	public static void main(String args[])
	{
		PoliticalParty kamal = new Bjp("Ravi", 105);
		kamal.display();
	}
}
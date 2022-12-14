package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.IplDto;
import com.xworkz.crud.exception.ArraySizeIsFullCantAddMore;
import com.xworkz.crud.repository.IplRepositary;
import com.xworkz.crud.repository.IplRepositaryimpl;

public class IplRepositaryimplRunner {
	public static void main(String[] args) throws ArraySizeIsFullCantAddMore {
		// TODO Auto-generated method stub

		System.out.println(System.lineSeparator());	
		
	IplRepositary repositary = new IplRepositaryimpl();
	IplDto ipl= new IplDto();
	ipl.setCaptainName("Rohit Sharma");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(false);
	ipl.setTeamName("MUMBAI INDIANS");
	ipl.setPurse(100);
	ipl.setWins(129);
	ipl.setCreatedby("AAAA");
	ipl.setUpdatedBy("AAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	repositary.create(ipl);
	
	System.out.println(System.lineSeparator());
	ipl.setCaptainName("Virat Kholi");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("RCB");
	ipl.setPurse(100);
	ipl.setWins(117);
	ipl.setCreatedby("AAAAA");
	ipl.setUpdatedBy("AAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	ipl.display();
	repositary.create(ipl);
	
	System.out.println(System.lineSeparator());		
	
	ipl.setCaptainName("K Williams");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("Sunrises Hyderbad");
	ipl.setPurse(100);
	ipl.setWins(67);
	ipl.setCreatedby("AAAA");
	ipl.setUpdatedBy("AAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	ipl.display();
	repositary.create(ipl);
	
	System.out.println(System.lineSeparator());		
	
	ipl.setCaptainName("Ms Dhoni");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("Chennai Super Kings");
	ipl.setPurse(100);
	ipl.setWins(57);
	ipl.setCreatedby("AAAAA");
	ipl.setUpdatedBy("AAAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	repositary.create(ipl);
	
	System.out.println(System.lineSeparator());		
	

	ipl.setCaptainName("Kl Rahul");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("Gujarat Titans");
	ipl.setPurse(100);
	ipl.setWins(47);
	ipl.setCreatedby("AAAAr");
	ipl.setUpdatedBy("AAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	repositary.create(ipl);
	
	System.out.println(System.lineSeparator());		
	

	ipl.setCaptainName("Pandya");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("Lucknow Giants");
	ipl.setPurse(100);
	ipl.setWins(45);
	ipl.setCreatedby("AAAA");
	ipl.setUpdatedBy("AAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	repositary.create(ipl);

	System.out.println(System.lineSeparator());	
	
	ipl.setCaptainName("Dinesh Karthik");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("Kolkata knight Riders");
	ipl.setPurse(100);
	ipl.setWins(40);
	ipl.setCreatedby("AAAA");
	ipl.setUpdatedBy("AAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	repositary.create(ipl);
	
	System.out.println(System.lineSeparator());	
	
	ipl.setCaptainName("AAAA");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("Delhi Capitals");
	ipl.setPurse(100);
	ipl.setWins(55);
	ipl.setCreatedby("AAAA");
	ipl.setUpdatedBy("AAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	repositary.create(ipl);
	
	System.out.println(System.lineSeparator());	

	ipl.setCaptainName("sanju Samson");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("Rajastan Royals");
	ipl.setPurse(100);
	ipl.setWins(50);
	ipl.setCreatedby("AAAAA");
	ipl.setUpdatedBy("AAAAA");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	repositary.create(ipl);
	
	System.out.println(System.lineSeparator());	
	
	ipl.setCaptainName("Desmond");
	ipl.setDefeats(0);
	ipl.setOwnerAlive(true);
	ipl.setTeamName("Panjab Kings");
	ipl.setPurse(100);
	ipl.setWins(25);
	ipl.setCreatedby("Avinash Mullur");
	ipl.setUpdatedBy("Avinash Assassin");
	ipl.setCreatedDateTime(LocalDateTime.now());
	ipl.setUpdatedDateTime(LocalDateTime.now());
	repositary.create(ipl);
	
	
repositary.tempsetName("Desmond");
	// System.out.println(ref1);
	
	}
}

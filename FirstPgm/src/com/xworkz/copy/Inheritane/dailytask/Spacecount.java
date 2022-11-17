package com.xworkz.copy.Inheritane.dailytask;

public class Spacecount {
     
	public static void main(String[] args) {
		String name="a              b c ";
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("total words ="+count);

	}
	

}
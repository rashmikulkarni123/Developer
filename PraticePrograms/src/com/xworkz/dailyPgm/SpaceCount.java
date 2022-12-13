package com.xworkz.dailyPgm;

public class SpaceCount {

	public static void main(String[] args) {
	
				String name="a   bc ";
				int count=0;
				
				for(int i=0;i<name.length();i++) {
					if(name.charAt(i)!=' ') {
						count++;
					}
				}
				System.out.println("total space ="+count);
}
}

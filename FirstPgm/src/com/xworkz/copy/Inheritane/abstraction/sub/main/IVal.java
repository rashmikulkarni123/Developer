package com.xworkz.copy.Inheritane.abstraction.sub.main;

public class IVal {
	public static void main(String[] args)
	{
		System.out.println("======");
		int n=4;
		for(int i=n; i>=1; i--) {
		for(int j=n-1;j>=i;j--)	{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			System.out.print("   %   ");
	}
		System.out.println("");
	}
	}
}

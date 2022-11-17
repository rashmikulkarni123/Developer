package com.xworkz.copy.Inheritane.abstraction.sub.main;

public class I {
	public static void main(String[] args)
	{
		System.out.println("======");
		int n=4;
		for(int i=1; i<=n; i++) {
		for(int j=n-1;j>=i;j--)	{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			System.out.print(k);
	}
		System.out.println("");
	}
	}
}

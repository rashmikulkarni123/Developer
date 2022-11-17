package com.xworkz.copy.Inheritane.abstraction.sub.main;

public class Nam {
	public static void main(String[] args)
	{
		System.out.println("======");
		int n=4;
		for(int i=1; i<=n; i++) {
		for(int j=n-1;j>=i;j--)	{
			if(j==2) {
				System.out.print("name");
			}
			else {
				System.out.print("j");
			}
		}
		for(int k=1; k<=i; k++) {
			if(k==2)
			System.out.print("R");
	}
		System.out.println("");
	}
	}
}

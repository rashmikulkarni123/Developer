package com.xworkz.dailyPgm;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the even or odd number");
int num=Sc.nextInt();
int res=num/2;
if (num==res*2)
{
	System.out.println("its even");
}
else
{																																																			
	System.out.println("its odd");
}
	}

}

package com.xworkz.dailyPgm;

import java.util.Scanner;

public class Space {
		public static void main(String args[]){
			String str;
			int space=0;
			 Scanner scan=new Scanner(System.in); 
			    //create a scanner object for input
			    
			System.out.println("Enter the String  ");
			str=scan.nextLine();
			int i=0; 
			while(i<str.length()){
			char ch=str.charAt(i);
			 if(ch==' '){
			        space++;
			    }
			     i++;
			}
			System.out.println("Total white space : "+space);
			}
		}


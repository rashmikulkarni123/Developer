package com.xworkz.copy.Inheritane.abstraction.sub.main;

public class Main {
		public static void main(String[] args) {
			int length=0;
			
	                String s = "prepinsta";
	                char[] charArray = s.toCharArray();
					for (int i = 0; i < charArray.length; i++) {
						char c1 = charArray[i];
						length++;
					}
			System.out.println("Length of String is : "+length);
			
		}

	}


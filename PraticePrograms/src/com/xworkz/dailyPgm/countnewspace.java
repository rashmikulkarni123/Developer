package com.xworkz.dailyPgm;

public class countnewspace {
	public static void main(String[] args) {
		String name = "hands on learning happens here";
		int count = 0;
		String space = "";
		String newOne = "";
		for (char ch : name.toCharArray()) {
			if (ch == ' ') {
				count += 1;
			} else {
				space += ch;
			}

			if (count > 2 && count <= 3) {
				newOne = ch + newOne;

			}

		}
		System.out.println(newOne);

	}
}
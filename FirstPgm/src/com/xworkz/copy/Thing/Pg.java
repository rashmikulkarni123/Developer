package com.xworkz.copy.Thing;

public class Pg {
	public String pgname;
	public String pgcity;
	public String pgstate;
	public String pgcountry;
	public int pgcountryCode;

	public String[] pgroutes;
	public String[] pglocation;
	public String[] pgMangerName;
	public long[] pgManagerNumber;
	public String[] pgwonername;
	public String[] pgTimings;

	public Pg(String pgname, String pgcity, String pgstate, String pgcountry, int pgcountryCode, String[] pgroutes,
			String[] pglocation, String[] pgManagerName, long[] pgmanagerNumber, String[] pgwonername,
			String[] pgTimings) {

		this.pgname = pgname;
		this.pgcity = pgcity;
		this.pgstate = pgstate;
		this.pgcountry = pgcountry;
		this.pgcountryCode = pgcountryCode;

		this.pgroutes = pgroutes;
		this.pglocation = pglocation;
		this.pgMangerName = pgMangerName;
		this.pgManagerNumber = pgManagerNumber;
		this.pgwonername = pgwonername;
		this.pgTimings = pgTimings;

	}

	public void display() {
		System.out.println("Name : " + this.pgname);
		System.out.println("City : " + this.pgcity);
		System.out.println("State : " + this.pgstate);
		System.out.println("Country : " + this.pgcountry);
		System.out.println("Country Code :" + this.pgcountryCode);

		System.out.println(System.lineSeparator() + "====Pg Routes====");
		for (int i = 0; i < pgroutes.length; i++) {
			String string = pgroutes[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Pg location====");
		for (int i = 0; i < pglocation.length; i++) {
			String string = pglocation[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Pg Manger Names====");
		for (int i = 0; i < pgMangerName.length; i++) {
			String string = pgMangerName[i];
			System.out.println(string);
		}

		System.out.println(System.lineSeparator() + "====Pg Manager Numbers====");
		for (int i = 0; i < pgManagerNumber.length; i++) {
			long l = pgManagerNumber[i];
			System.out.println(l);
		}
		System.out.println(System.lineSeparator() + "====Pg woner hesru====");
		for (int i = 0; i < pgwonername.length; i++) {
			String string = pgwonername[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Timing of pg====");
		for (int i = 0; i < pgTimings.length; i++) {
			String string = pgTimings[i];
			System.out.println(string);
		}
		
	}

}

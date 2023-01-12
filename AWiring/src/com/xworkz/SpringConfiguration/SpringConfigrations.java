package com.xworkz.SpringConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

	@Configuration
	@ComponentScan("com.xworkz.thing")
	public class SpringConfigrations { 
		
		@Bean
		public String name() {
			return "Ragavendra hardwares";
		}
		@Bean
		public int id() {
			return 1;
		}
		@Bean
		public String ownername() {
			return "Ragavendra";
		}
		@Bean
		public int gstno() {
			return 1;
		}
		@Bean
		public String address() {
			return "Bagalkot";
		}
		//software
		@Bean
		public String name3() {
			return "whatsup";
		}
		@Bean
		public int version() {
			return 1;
		}
		@Bean
		public String developer() {
			return "Ragavendra";
		}
		@Bean
		public boolean free() {
			return true;
		}
		
		@Bean
		public double date() {
			return 5.40D;
		}
		//software engineer
		@Bean
		public String name2() {
			return "Rashmi";
		}
		@Bean
		public int salary() {
			return 500000;
		}
		@Bean
		public String companyname() {
			return "tcs";
		}
		@Bean
		public int experience() {
			return 2;
		}
		//pencil
		@Bean
		public String name4() {
			return "camlin";
		}
		@Bean
		public String type() {
			return "wooden";
		}
		@Bean
		public double price() {
			return 10;
		}
		@Bean
		public String color() {
			return "orange and yellow";
		}
		@Bean
		public boolean sharp() {
			return true;
		}
		@Bean
		public boolean stolen() {
			return false;
		}
		@Bean
		public String size() {
			return "large";
		}
		//rubber
		@Bean
		public String name1() {
			return "apsara";
		}
		@Bean
		public String type1() {
			return "brand";
		}
		@Bean
		public int price1() {
			return 10;
		}
		@Bean
		public String color1() {
			return "white";
		}
		@Bean
		public boolean sharp1() {
			return true;
		}
		@Bean
		public boolean stolen1() {
			return true;
		}
		@Bean
		public String size1() {
			return "S";
		}
		
		//own
		@Bean
		public boolean clean() {
			return true;
		}
		@Bean
		public char name5() {
			return  'x';
		}
		
		@Bean
		public byte workers() {
			return 10;
		}
		
		@Bean
		public Short peoples() {
			return 160;
		}
		@Bean
		public int floores () {
			return 6;
		}
		@Bean
		public long pgno() {
			return 733858293;
		}
		@Bean
		public double rent() {
			return 7.5;
		}
		@Bean
		public String warden() {
			return "suma";
		}
		}	
		
		


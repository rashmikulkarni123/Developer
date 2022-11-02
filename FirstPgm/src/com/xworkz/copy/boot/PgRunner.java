package com.xworkz.copy.boot;

import com.xworkz.copy.Thing.Pg;

public class PgRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				String[] pgroutes = { "Kuvempu metro", "Harischandra ghat" };
				String[] pgName = { "Kushi paying guest"};
				String[] pgMangerName = { "dnt knw" };
				long[] pgManagerNumber = { 7338582932L };
				String[] pgwonername = { "Adhu dnt knw"};
				String[] pgTimings = { "5am - 11pm", "7am - 11pm" };

				Pg pg = new Pg("Kushi pg", "Bengaluru", "Karnataka", "INDIA", 91, pgroutes, pgName, pgMangerName,
						pgManagerNumber, pgwonername, pgTimings);
				

				pg.display();

			}

		
	}



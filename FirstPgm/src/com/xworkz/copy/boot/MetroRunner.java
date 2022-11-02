package com.xworkz.copy.boot;

import com.xworkz.copy.Thing.Metro;

public class MetroRunner {

	public static void main(String[] args) {

		String[] routes = { "Purple line", "Green line" };
		String[] metroStationNames = { "Nagasandra", "Jalahalli Cross", "Peenya", "GoraguntePalya" };
		String[] stationMangerName = { "Mr.Bommai", "Mr.Siddaramanna", "Mr. Kuamaranna", "Ms.Anitha Kumaranna" };
		long[] stationManagerNumber = { 7859996956l, 9658545632l, 9875963852l, 8412652563l };
		String[] finalStops = { "Nagasandra", "Baiyapanahalli", "Silk Factory", "Kengeri" };
		String[] metroTimings = { "5am - 11pm", "7am - 11pm" };

		Metro metro = new Metro(null, null, null, null, 0, routes, metroStationNames, stationMangerName,
				stationManagerNumber, finalStops, metroTimings);
		metro.name = "Namma Metro";
		metro.city = "Bengaluru";
		metro.state = "Karnataka";
		metro.country = "INDIA";
		metro.countryCode = 91;

		metro.display();

	}

}

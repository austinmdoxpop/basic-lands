package com.basiclands.jackson;

import java.util.ArrayList;

public class BasicLandNames {
	private static ArrayList<String> landNames = new ArrayList<String>();
	
	public static ArrayList<String> getNames() {
		landNames.add("Plains");
		landNames.add("Island");
		landNames.add("Swamp");
		landNames.add("Mountain");
		landNames.add("Forest");
		landNames.add("Snow-Covered Plains");
		landNames.add("Snow-Covered Island");
		landNames.add("Snow-Covered Swamp");
		landNames.add("Snow-Covered Mountain");
		landNames.add("Snow-Covered Forest");
		landNames.add("Wastes");
		return landNames;
	}
}

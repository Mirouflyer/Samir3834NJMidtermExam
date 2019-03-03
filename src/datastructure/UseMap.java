package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		Map<String,String> monthSeason = new HashMap<>();
		monthSeason.put("January","Winter");
		monthSeason.put("April","Spring");
		monthSeason.put("July","Summer");
		monthSeason.put("October","Fall");

		System.out.println(monthSeason.get("January"));
		System.out.println(monthSeason.get("April"));
		System.out.println(monthSeason.get("July"));
		System.out.println(monthSeason.get("October"));

		List<String> volsksvagenModel = new ArrayList<String>();
		volsksvagenModel.add("Golf");
		volsksvagenModel.add("Jetta");
		volsksvagenModel.add("Passat");

		List<String> hondanModel = new ArrayList<String>();
		hondanModel.add("Accord");
		hondanModel.add("Civic");
		hondanModel.add("Pilot");


		Map<String, List<String>> engine = new HashMap<>();
		engine.put("TSI",volsksvagenModel);
		engine.put("VTEC",hondanModel);


		for(Map.Entry<String,List<String>> cars : engine.entrySet() ){
			System.out.println(cars.getKey()+" "+cars.getValue());
		}

	

	}



}

package datastructure;

import java.util.HashMap;
import java.util.Map;

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


	}



}

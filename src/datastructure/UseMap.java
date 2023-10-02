package datastructure;

import databases.ConnectToSqlDB;

import java.sql.Statement;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 */

// Create a Map to store a list of strings for each key
		Map<String, List<Object>> map = new HashMap<>();

		// Add some data to the map
		map.put("numbers", Arrays.asList(1, 2, 3, 4, 5));
		map.put("colors", Arrays.asList("red", "green", "blue"));





		// Retrieving data using a for-each loop
		for (Map.Entry<String, List<Object>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<Object> values = entry.getValue();
			System.out.println("Key: " + key);
			System.out.println("Values: " + values);
		}

		// Retrieving data using a while loop with an Iterator
		Iterator<Map.Entry<String, List<Object>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<Object>> entry = iterator.next();
			String key = entry.getKey();
			List<Object> values = entry.getValue();
			System.out.println("Key: " + key);
			System.out.println("Values: " + values);
		}

	}

}

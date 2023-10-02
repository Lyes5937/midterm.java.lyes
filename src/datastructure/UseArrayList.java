package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		// Create an ArrayList to store numbers
		ArrayList<Integer> numbers = new ArrayList<>();

		// Add numbers to the ArrayList
		numbers.add(5);
		numbers.add(9);
		numbers.add(3);
		numbers.add(7);

		// Peek at the first element
		Integer firstElement = numbers.get(0);
		System.out.println("Peek at the first element: " + firstElement);

		// Remove an element from the ArrayList
		numbers.remove(Integer.valueOf(2));

		// Retrieve and print all elements using a for-each loop
		System.out.println("Retrieve elements using a for-each loop:");
		for (Integer number : numbers) {
			System.out.println(number);
		}

		// Retrieve and print all elements using a while loop with an Iterator
		System.out.println("\nRetrieve elements using a while loop with an Iterator:");
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			Integer number = iterator.next();
			System.out.println(number);
		}

		// Sort the ArrayList
		Collections.sort(numbers);

		// Store the sorted data into a hypothetical database (e.g., print them here)
		System.out.println("\nSorted data stored in the database:");
		for (Integer number : numbers) {
			System.out.println(number);
			// Replace this with your database storage code
			// You'd typically use JDBC or another database library to interact with your database
		}
	}
}

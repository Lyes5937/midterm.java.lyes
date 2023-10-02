package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

	public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		// Create a Queue using LinkedList
		Queue<String> queue = new LinkedList<>();
// Adding elements to the queue
		queue.add("Element 1");
		queue.add("Element 2");
		queue.add("Element 3");

		// Peeking at the first element (without removing it)
		String peekedElement = queue.peek();
		System.out.println("Peeked Element: " + peekedElement);

		// Removing and retrieving the first element
		String removedElement = queue.remove();
		System.out.println("Removed Element: " + removedElement);

		// Polling and retrieving the first element (removes it if it exists)
		String polledElement = queue.poll();
		System.out.println("Polled Element: " + polledElement);

		// Using a For Each loop to retrieve and print all elements
		System.out.println("Elements using For Each loop:");
		for (String element : queue) {
			System.out.println(element);
		}

		// Using a while loop with an Iterator to retrieve and print all elements
		System.out.println("Elements using while loop with Iterator:");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}


}

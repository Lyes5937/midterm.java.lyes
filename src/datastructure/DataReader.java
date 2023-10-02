package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.io.IOException;
import java.util.Stack;
public class DataReader {

	public static void main(String[] args) {
		/*
		 * Use API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";


		LinkedList<String> linkedList = new LinkedList<>();
		Stack<String> stack = new Stack<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");

				for (String word : words) {
					linkedList.addLast(word);
					stack.push(word);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("An error occurred while reading the file.");
			return;
		}


		// Demonstrate stack operations
		System.out.println("Stack Operations:");
		System.out.println("Pushing elements into the stack:");
		stack.push("Element 1");
		stack.push("Element 2");
		stack.push("Element 3");

		System.out.println("Peek: " + stack.peek());
		System.out.println("Search for 'Element 2': " + stack.search("Element 2"));
		System.out.println("Pop: " + stack.pop());

		System.out.println("Stack after operations: " + stack);

		// Iterate through the linked list (FIFO)
		System.out.println("\nLinked List (FIFO):");
		for (String word : linkedList) {
			System.out.println(word);
		}
	}
}


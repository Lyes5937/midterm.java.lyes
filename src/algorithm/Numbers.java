package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");

		printValue(numbers);
		int n = num.length;
		randomize (num, n);

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//By following above, Continue for rest of the Sorting Algorithm....

		// Bubble Sort
		randomize(num, n);
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort: " + bubbleSortExecutionTime + " milli sec");

		// Quick Sort
		randomize(num, n);
		long startTime = System.currentTimeMillis();
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort: " + quickSortExecutionTime + " milli sec");

		// Compare the execution times to determine the best sorting algorithm
		if (selectionSortExecutionTime < insertionSortExecutionTime && selectionSortExecutionTime < bubbleSortExecutionTime && selectionSortExecutionTime < quickSortExecutionTime) {
			System.out.println("Selection Sort is the fastest.");
		} else if (insertionSortExecutionTime < selectionSortExecutionTime && insertionSortExecutionTime < bubbleSortExecutionTime && insertionSortExecutionTime < quickSortExecutionTime) {
			System.out.println("Insertion Sort is the fastest.");
		} else if (bubbleSortExecutionTime < selectionSortExecutionTime && bubbleSortExecutionTime < insertionSortExecutionTime && bubbleSortExecutionTime < quickSortExecutionTime) {
			System.out.println("Bubble Sort is the fastest.");
		} else {
			System.out.println("Quick Sort is the fastest.");
		}
		//Come to conclusion about which Sorting Algo is better in given data set.
		// Result is: Quick Sort is the fastest (test tried with num = 10000).
	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}

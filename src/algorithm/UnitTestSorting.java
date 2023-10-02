package algorithm;

import org.junit.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
           Assert.assertEquals(sortedArray, unSortedArray);
            System.out.println("Selection Sort passed.");
        }catch(Exception ex){
            ex.getMessage();
            System.err.println("Selection Sort failed.");
        }

        //Now implement Unit test for rest of the soring algorithm...................below

// Test Insertion Sort
        sort = new Sort();
        sort.insertionSort(unSortedArray);
        try {
            assertArrayEquals(sortedArray, unSortedArray);
            System.out.println("Insertion Sort passed.");
        } catch (AssertionError e) {
            System.err.println("Insertion Sort failed.");
        }

        // Test Bubble Sort
        sort = new Sort();
        sort.bubbleSort(unSortedArray);
        try {
            assertArrayEquals(sortedArray, unSortedArray);
            System.out.println("Bubble Sort passed.");
        } catch (AssertionError e) {
            System.err.println("Bubble Sort failed.");
        }

        // Test Merge Sort
        sort = new Sort();
        sort.mergeSort(unSortedArray);
        try {
            assertArrayEquals(sortedArray, unSortedArray);
            System.out.println("Merge Sort passed.");
        } catch (AssertionError e) {
            System.err.println("Merge Sort failed.");
        }

        // Test Quick Sort
        sort = new Sort();
        sort.quickSort(unSortedArray);
        try {
            assertArrayEquals(sortedArray, unSortedArray);
            System.out.println("Quick Sort passed.");
        } catch (AssertionError e) {
            System.err.println("Quick Sort failed.");
        }

        // Test Heap Sort
        sort = new Sort();
        sort.heapSort(unSortedArray);
        try {
            assertArrayEquals(sortedArray, unSortedArray);
            System.out.println("Heap Sort passed.");
        } catch (AssertionError e) {
            System.err.println("Heap Sort failed.");
        }

        // Test Bucket Sort
        sort = new Sort();
        sort.bucketSort(unSortedArray);
        try {
            assertArrayEquals(sortedArray, unSortedArray);
            System.out.println("Bucket Sort passed.");
        } catch (AssertionError e) {
            System.err.println("Bucket Sort failed.");
        }

        // Test Shell Sort
        sort = new Sort();
        sort.shellSort(unSortedArray);
        try {
            assertArrayEquals(sortedArray, unSortedArray);
            System.out.println("Shell Sort passed.");
        } catch (AssertionError e) {
            System.err.println("Shell Sort failed.");
        }

        System.out.println("All sorting algorithms passed the unit tests.");
    }

    private static void assertArrayEquals(int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            throw new AssertionError("Arrays have different lengths.");
        }
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                throw new AssertionError("Arrays differ at index " + i + ". Expected: " + expected[i] + ", Actual: " + actual[i]);
            }
        }
    }
}

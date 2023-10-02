package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < list.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < list.length; i++) {
                if (list[i] < list[min])
                    min = i;
            }

            int temp = list[min];
            list[min] = list[j];
            list[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            array[j + 1] = key;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }


        return list;
    }


    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here
        mergeSortRecursive(list, 0, list.length - 1);

        return list;
    }

    private void mergeSortRecursive(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortRecursive(array, left, mid);
            mergeSortRecursive(array, mid + 1, right);
            merge(array, left, mid, right);
        }

    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here

        quickSortRecursive(list, 0, list.length - 1);

        return list;
    }

    private void quickSortRecursive(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSortRecursive(array, low, pivotIndex - 1);
            quickSortRecursive(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        buildMaxHeap(list);

        for (int i = list.length - 1; i >= 0; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            heapify(array, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    private void buildMaxHeap(int[] array) {
        int n = array.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
    }

    private void heapify(int[] array, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }


    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();

        int max = getMaxValue(list);
        int min = getMinValue(list);

        int bucketCount = (max - min) / list.length + 1;
        List<Integer>[] buckets = new ArrayList[bucketCount];

        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int value : list) {
            int bucketIndex = (value - min) / list.length;
            buckets[bucketIndex].add(value);
        }

        int currentIndex = 0;
        for (int i = 0; i < bucketCount; i++) {
            Collections.sort(buckets[i]);
            for (int value : buckets[i]) {
                list[currentIndex] = value;
                currentIndex++;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;


        return list;
    }

    private int getMaxValue(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private int getMinValue(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    public int[] shellSort ( int[] array){
            int[] list = array;
            //implement here
        final long startTime = System.currentTimeMillis();
        int n = list.length;
            for (int gap = n / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < n; i++) {
                    int temp = list[i];
                    int j;
                    for (j = i; j >= gap && list[j - gap] > temp; j -= gap) {
                        list[j] = list[j - gap];
                    }
                    list[j] = temp;
                }
            }

            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;


            return list;
        }

        public static void printSortedArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        // declare and assign number of Fibonacci numbers to generate
        // Array to store the Fibonacci numbers
        int n = 40;
        long[] fibonacciNumbers = new long[n];

        // Initialize the first two Fibonacci numbers
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        // Calculate the remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {

            // Each Fibonacci number is the sum of the two previous numbers
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Print the first 40 Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i]);

            // Add a comma and space if it's not the last number in the sequence
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

    }
}

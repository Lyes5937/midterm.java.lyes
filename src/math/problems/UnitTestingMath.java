package math.problems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UnitTestingMath {

       @Test
        public void testFactorialRecursion() {

           assertEquals(1, Factorial.factorialRecursion(0));
           assertEquals(1, Factorial.factorialRecursion(1));
           assertEquals(2, Factorial.factorialRecursion(2));
           assertEquals(6, Factorial.factorialRecursion(3));
           assertEquals(24, Factorial.factorialRecursion(4));
           assertEquals(120, Factorial.factorialRecursion(5));
       }
    @Test
    public void testFactorialIteration() {

        assertEquals(1, Factorial.factorialIteration(0));
        assertEquals(1, Factorial.factorialIteration(1));
        assertEquals(2, Factorial.factorialIteration(2));
        assertEquals(6, Factorial.factorialIteration(3));
        assertEquals(24, Factorial.factorialIteration(4));
        assertEquals(120, Factorial.factorialIteration(5));

    }
    @Test
    public void testFibonacci() {
        int n = 10;
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        long[] fibonacciNumbers = new long[n];

        // Initialize the first two Fibonacci numbers
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        // Calculate the remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Compare the calculated Fibonacci sequence with the expected sequence
        assertArrayEquals(expected, fibonacciNumbers);

    }
}

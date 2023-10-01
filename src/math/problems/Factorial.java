package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        // set and assignment of a value of num to (5)
        int num = 5;

        // Calculate factorial using recursion
        int resultRecursion = factorialRecursion(num);
        System.out.println("Factorial of " + num + " using recursion is " + resultRecursion);

        // Calculate factorial using iteration
        int resultIteration = factorialIteration(num);
        System.out.println("Factorial of " + num + " using iteration is " + resultIteration);

    }

    // Factorial using recursion
    public static int factorialRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursion(n - 1);
        }
    }

    // Factorial using iteration
    public static int factorialIteration(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}

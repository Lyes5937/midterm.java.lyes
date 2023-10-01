package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         int x = findMissingNumber(array);
        System.out.println("The missing number is: " + x);
    }
    // Static helper method to find the missing number
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; // The expected length of the array if no number is missing
        int totalSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
        int arraySum = 0; // Sum of elements in the array

        for (int num : nums) {
            arraySum += num;
        }

        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;

    }
}

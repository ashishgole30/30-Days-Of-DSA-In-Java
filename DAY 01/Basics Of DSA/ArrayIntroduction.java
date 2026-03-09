public class ArrayIntroduction {
    public static void main(String[] args) {
        // ARRAY INTRODUCTION
        /*
         * An Array is a collection of elements stored in contiguous memory locations.
         * All elements must have the same data type.
         * Example
         * int[] numbers = {10, 20, 30, 40};
         * 
         * Memory:
         * Index: 0 1 2 3
         * Value: 10 20 30 40
         * 
         */

        /*
         * leetcode 1929
         * * Data Structure Used:Array
         * Concept Used:Array traversal,Index manipulation.
         * // Array declaration
         * int[] nums;
         * // Array length property
         * int n = nums.length;
         * // Array creation using new keyword
         * int[] ans = new int[n * 2];
         * // For loop for array traversal
         * for (int i = 0; i < nums.length; i++)
         * // Array indexing
         * nums[i]
         * // Index manipulation
         * ans[] = nums[i];
         * ans[i + n] = nums[i];
         * // Return statement
         * return ans;
         * 
         * Important DSA Pattern:
         * Array Concatenation Pattern
         * ans[i] = nums[i]
         * ans[i + n] = nums[i]
         */

        /*
         * leetcode 1480
         * Data Structure Used: Array
         * Concept Used: Array traversal, Prefix Sum (Running Sum), Index-based access.
         * // Array declaration
         * int[] nums;
         * // Array length property
         * int n = nums.length;
         * // Array creation using new keyword
         * int[] runningSum = new int[n];
         * // Array indexing
         * nums[i]
         * // Initializing first element
         * runningSum[0] = nums[0];
         * // For loop for array traversal
         * for (int i = 1; i < n; i++)
         * // Prefix sum / running sum calculation
         * runningSum[i] = runningSum[i - 1] + nums[i];
         * // Return statement
         * return runningSum;
         * 
         * Important DSA Pattern:
         * Prefix Sum Pattern
         * prefix[i] = prefix[i-1] + nums[i]
         */
    }
}
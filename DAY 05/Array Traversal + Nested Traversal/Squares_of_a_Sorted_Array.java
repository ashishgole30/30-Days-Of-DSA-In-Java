import java.util.Arrays;

public class Squares_of_a_Sorted_Array {

    public static void main(String[] args) {
        // 977 Squares of a Sorted Array
        /*
         * Given an integer array nums sorted in non-decreasing order, return an array
         * of the squares of each number sorted in non-decreasing order.
         * 
         * Example 1:
         * Input: nums = [-4,-1,0,3,10]
         * Output: [0,1,9,16,100]
         * Explanation: After squaring, the array becomes [16,1,0,9,100].
         * After sorting, it becomes [0,1,9,16,100].
         * 
         * Example 2:
         * Input: nums = [-7,-3,2,3,11]
         * Output: [4,9,9,49,121]
         * 
         * Constraints:
         * 1 <= nums.length <= 104
         * -104 <= nums[i] <= 104
         * nums is sorted in non-decreasing order.
         */

        /* VS CODE Code: */

        int[] nums = { -4, -1, 0, 3, 10 };
        int n = nums.length;
        int[] resultArray = new int[n];

        for (int i = 0; i < n; i++) {
            int square = nums[i] * nums[i];
            resultArray[i] = square;
        }
        Arrays.sort(resultArray);

        for (int result : resultArray) {
            System.out.print(result + " ");
        }
    }
}
/*
 * Thinking Process:
 * 1️⃣ Understand the input
 * You are given a sorted integer array.
 * Numbers can be negative, zero, or positive.
 * Example:
 * [-4, -1, 0, 3, 10]
 * 
 * 2️⃣ Create a result array
 * Create a new array of same length as input.
 * This will store the squares of elements.
 * 
 * 3️⃣ Traverse the input array
 * Use a single loop from index 0 to length - 1.
 * 
 * 4️⃣ Square each element
 * For each element:
 * Take the number
 * Multiply it by itself
 * Conceptually:
 * square = number × number
 * 
 * 5️⃣ Store square in result array
 * Store the square at the same index in the result array.
 * 
 * 6️⃣ Sort the result array
 * Because squaring negatives can break the order.
 * So after filling the array, sort it.
 * 
 * 7️⃣ Return / print the result array
 * Now the array will contain:
 * [0,1,9,16,100]
 * 
 * Input Array
 * ↓
 * Traverse
 * ↓
 * Square each element
 * ↓
 * Store in result array
 * ↓
 * Sort result array
 * ↓
 * Output result
 * 
 */

/*
 * Leetcode code:
 * class Solution {
 * public int[] sortedSquares(int[] nums) {
 * int n = nums.length;
 * int[] resultArray = new int[n];
 * for (int i = 0; i < n; i++) {
 * int square = nums[i] * nums[i];
 * resultArray[i] = square;
 * }
 * Arrays.sort(resultArray);
 * return resultArray;
 * }
 * }
 */
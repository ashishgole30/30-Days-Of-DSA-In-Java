public class Build_Array_from_Permutation {

    public static void main(String[] args) {
        /*
         * 1920. Build Array from Permutation
         */
        /*
         * Given a zero-based permutation nums (0-indexed), build an array ans of the
         * same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and
         * return it.
         * A zero-based permutation nums is an array of distinct integers from 0 to
         * nums.length - 1 (inclusive).
         * 
         * Example 1:
         * Input: nums = [0,2,1,5,3,4]
         * Output: [0,1,2,4,5,3]
         * Explanation: The array ans is built as follows:
         * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]],
         * nums[nums[4]], nums[nums[5]]]
         * = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
         * = [0,1,2,4,5,3]
         * 
         * Example 2:
         * Input: nums = [5,0,1,2,3,4]
         * Output: [4,5,0,1,2,3]
         * Explanation: The array ans is built as follows:
         * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]],
         * nums[nums[4]], nums[nums[5]]]
         * = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
         * = [4,5,0,1,2,3]
         * 
         * Constraints:
         * 1 <= nums.length <= 1000
         * 0 <= nums[i] < nums.length
         * The elements in nums are distinct.
         */

        /* VS CODE Code: */
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        for (int answers : ans) {
            System.out.print(answers + " ");
        }
    }
}

/*
 * Concept
 * ans[i] = nums[nums[i]]
 * i tells you where to go first
 * that location tells you where to go next
 * "Go to index i, take the value there, and use that value as a new index to fetch another value."
 * Suppose:
 * nums = [0, 2, 1, 5, 3, 4]
 * Let’s pick:
 * i = 3
 * Step 1:
 * nums[i] = nums[3] = 5
 * Step 2:
 * Now use that 5 as index:
 * nums[5] = 4
 * So:
 * nums[nums[3]] = 4
 */

/*
 * Leetcode Code:class Solution {
 * public int[] buildArray(int[] nums) {
 * 
 * int n = nums.length;
 * int [] ans = new int[n];
 * 
 * for (int i= 0 ; i<n ;i++)
 * {
 * ans[i] = nums[nums[i]];
 * }
 * return ans;
 * }
 * }
 */

public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        /*
         * LEETCODE 1512 Number of Good Pairs
         * Given an array of integers nums, return the number of good pairs.
         * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
         * 
         * Example 1:
         * Input: nums = [1,2,3,1,1,3]
         * Output: 4
         * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
         * 
         * Example 2:
         * Input: nums = [1,1,1,1]
         * Output: 6
         * Explanation: Each pair in the array are good.
         * 
         * Example 3:
         * Input: nums = [1,2,3]
         * Output: 0
         * 
         * Constraints:
         * 1 <= nums.length <= 100
         * 1 <= nums[i] <= 100
         */

        /* VS CODE Code: */

        int[] nums = { 1, 2, 3 };
        int numOfGoodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    numOfGoodPairs++;
                }
            }
        }
        System.out.println(numOfGoodPairs);
    }
}
/*
 * Concepts Used:
 * Data Structure Used: Array
 * Concept Used:Traversal,Nested traversal,Conditional checking (if),Counter
 * variable
 */
/*
 * Initial Thought Process:
 * 1.Created nums array
 * 2. Traversed nums array twice using for loops
 * 3. if the condition nums[i] == nums[j] and i < j is true
 * 4. Increment numofgoodpairs by 1
 * 5. print numofgoodpairs
 */
/*
 * Final Thought Process:
 * same as initial thought process
 */
/*
 * Notes:
 * No special age case
 */
/*
 * Leetcode Code:
 * class Solution {
 * public int numIdenticalPairs(int[] nums) {
 * int numOfGoodPairs = 0;
 * for (int i = 0; i < nums.length; i++) {
 * for (int j = 0; j < nums.length; j++) {
 * if (nums[i] == nums[j] && i < j) {
 * numOfGoodPairs++;
 * }
 * }
 * }
 * return numOfGoodPairs;
 * }
 * }
 */
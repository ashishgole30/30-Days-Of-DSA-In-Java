public class Move_Zeroes {
    public static void main(String[] args) {
        // 283 Move Zeroes
        /*
         * Given an integer array nums, move all 0's to the end of it while maintaining
         * the relative order of the non-zero elements.
         * Note that you must do this in-place without making a copy of the array.
         * 
         * Example 1:
         * Input: nums = [0,1,0,3,12]
         * Output: [1,3,12,0,0]
         * 
         * Example 2:
         * Input: nums = [0]
         * Output: [0]
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 104
         * -231 <= nums[i] <= 231 - 1
         * 
         * Follow up: Could you minimize the total number of operations done?
         */
    }
}
/*
 * First Understand the Goal
 * Input:
 * [0,1,0,3,12]
 * Output:
 * [1,3,12,0,0]
 * 
 * Rules:
 * Maintain relative order of non-zero elements
 * Do it in-place
 * No extra array
 * 
 * Core Idea
 * Collect all non-zero elements in front.
 * Zeros automatically shift to back.
 * This is Same Direction (Slow–Fast).
 * 
 * Step 1: Understand What Slow Means
 * Slow pointer represents:
 * Next position to place a non-zero number.
 * So:
 * slow = 0
 * Because first non-zero (if found) goes at index 0.
 * 
 * Step 2: Fast Pointer Scans Entire Array
 * Fast goes from:
 * 0 → n-1
 * It checks every element.
 * 
 * Step 3: When Fast Finds Non-Zero
 * If:
 * nums[fast] != 0
 * Then:
 * Place nums[fast] at nums[slow]
 * Increase slow
 * Why?
 * Because we are compacting non-zero values to front.
 * 
 * Step 4: After Fast Finishes
 * At this point:
 * All non-zero elements are placed from index 0 to slow-1
 * Remaining elements from slow to end should be zero
 * So:
 * Fill remaining positions with 0
 * 
 * Dry Run
 * Example:
 * [0,1,0,3,12]
 * slow = 0
 * fast = 0 → 0 → ignore
 * fast = 1 → 1 → place at index 0
 * array becomes:
 * [1,1,0,3,12]
 * slow = 1
 * fast = 2 → 0 → ignore
 * fast = 3 → 3 → place at index 1
 * array:
 * [1,3,0,3,12]
 * slow = 2
 * fast = 4 → 12 → place at index 2
 * array:
 * [1,3,12,3,12]
 * slow = 3
 * Now fill remaining indices (3 and 4) with 0:
 * Final:
 * [1,3,12,0,0]
 */

/*
 * Algorithm (Step-by-Step)
 * Initialize slow = 0
 * (This represents the next position to place a non-zero element.)
 * Traverse the array using fast from index 0 to n - 1.
 * For each element:
 * If nums[fast] is not zero:
 * Place it at index slow
 * Increment slow
 * After the traversal ends:
 * All non-zero elements are placed from index 0 to slow - 1.
 * From index slow to n - 1:
 * Set each element to 0.
 * End.
 * 
 * One-Line Understanding
 * Collect non-zero elements at the front,
 * then fill remaining positions with zero.
 */
/*
 * leetcode code
 * class Solution {
 * public void moveZeroes(int[] nums) {
 * int slow = 0;
 * for(int fast = 0 ; fast<nums.length ; fast++){
 * if ( nums[fast] != 0 ) {
 * nums[slow] = nums[fast];
 * slow++;
 * }
 * }
 * while (slow<nums.length){
 * nums[slow] = 0;
 * slow++;
 * }
 * }
 * }
 */
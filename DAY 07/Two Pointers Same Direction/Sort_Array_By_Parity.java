public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        // 905. Sort Array By Parity
        /*
         * Given an integer array nums, move all the even integers at the beginning of
         * the array followed by all the odd integers.
         * Return any array that satisfies this condition.
         * 
         * Example 1:
         * Input: nums = [3,1,2,4]
         * Output: [2,4,3,1]
         * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be
         * accepted.
         * 
         * Example 2:
         * Input: nums = [0]
         * Output: [0]
         * 
         * Constraints:
         * 1 <= nums.length <= 5000
         * 0 <= nums[i] <= 5000
         */

        /* VS CODE Code: */
        int[] nums = { 3, 1, 2, 4 };

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] % 2 == 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
/*
 * thinking process;
 * 1.int nums array given
 * 2. we have to move all even integers at the beginning followed by odd
 * integers
 * 3.Initialized slow pointer = 0 = This will track the position where the next
 * even number should go
 * 4.Traverse array using for loop fast = 0 to fast<nums.length , increment fast
 * by 1
 * 5. If nums[fast] is even
 * Swap nums[slow] and nums[fast]
 * Increment slow
 * 6. return array
 * 
 * Example
 * Input: [3,1,2,4]
 * 
 * slow=0
 * fast=0 → 3 (odd) → skip
 * fast=1 → 1 (odd) → skip
 * fast=2 → 2 (even) → swap → [2,1,3,4] slow=1
 * fast=3 → 4 (even) → swap → [2,4,3,1] slow=2
 * 
 * Output: [2,4,3,1]
 */

/*
 * leetcode code:
 * class Solution {
 * public int[] sortArrayByParity(int[] nums) {
 * int slow = 0;
 * for (int fast = 0; fast < nums.length; fast++) {
 * if (nums[fast] % 2 == 0) {
 * int temp = nums[slow];
 * nums[slow] = nums[fast];
 * nums[fast] = temp;
 * slow++;
 * }
 * }
 * return nums;
 * }
 * }
 */
public class Find_the_Middle_Index_in_Array {
    public static void main(String[] args) {
        // NOTE - SAME AS FIND PIVOT INDEX 724
        // 1991. Find the Middle Index in Array
        /*
         * Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e.,
         * the smallest amongst all the possible ones).
         * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1]
         * == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
         * If middleIndex == 0, the left side sum is considered to be 0. Similarly, if
         * middleIndex == nums.length - 1, the right side sum is considered to be 0.
         * Return the leftmost middleIndex that satisfies the condition, or -1 if there
         * is no such index.
         * 
         * Example 1:
         * Input: nums = [2,3,-1,8,4]
         * Output: 3
         * Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
         * The sum of the numbers after index 3 is: 4 = 4
         * 
         * Example 2:
         * Input: nums = [1,-1,4]
         * Output: 2
         * Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
         * The sum of the numbers after index 2 is: 0
         * 
         * Example 3:
         * Input: nums = [2,5]
         * Output: -1
         * Explanation: There is no valid middleIndex.
         * 
         * Constraints:
         * 1 <= nums.length <= 100
         * -1000 <= nums[i] <= 1000
         */

        /*
         * Leetcode Code: class Solution {
         * public int findMiddleIndex(int[] nums) {
         * int n = nums.length;
         * int [] prefix = new int[n];
         * prefix[0] = nums[0];
         * for ( int i = 1 ; i < n ; i++){
         * prefix[i] = prefix[i-1] + nums [i];
         * }
         * int pivotindex = -1;
         * for( int i = 0 ; i < n ; i++){
         * int leftsum = ( i == 0 ) ? 0 : prefix[i-1];
         * int rightsum = prefix[n-1] -prefix[i];
         * if( leftsum == rightsum ){
         * return i;
         * }
         * }
         * return pivotindex;
         * }
         * }
         */
    }
}
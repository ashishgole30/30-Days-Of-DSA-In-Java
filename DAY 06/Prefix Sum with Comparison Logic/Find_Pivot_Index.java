public class Find_Pivot_Index {
    public static void main(String[] args) {
        // 724 Find Pivot Index
        /*
         * Given an array of integers nums, calculate the pivot index of this array.
         * The pivot index is the index where the sum of all the numbers strictly to the
         * left of the index is equal to the sum of all the numbers strictly to the
         * index's right.
         * If the index is on the left edge of the array, then the left sum is 0 because
         * there are no elements to the left. This also applies to the right edge of the
         * array.
         * Return the leftmost pivot index. If no such index exists, return -1.
         * 
         * Example 1:
         * Input: nums = [1,7,3,6,5,6]
         * Output: 3
         * Explanation:
         * The pivot index is 3.
         * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
         * Right sum = nums[4] + nums[5] = 5 + 6 = 11
         * 
         * Example 2:
         * Input: nums = [1,2,3]
         * Output: -1
         * Explanation:
         * There is no index that satisfies the conditions in the problem statement.
         * 
         * Example 3:
         * Input: nums = [2,1,-1]
         * Output: 0
         * Explanation:
         * The pivot index is 0.
         * Left sum = 0 (no elements to the left of index 0)
         * Right sum = nums[1] + nums[2] = 1 + -1 = 0
         * 
         * Constraints:
         * 1 <= nums.length <= 104
         * -1000 <= nums[i] <= 1000
         */

        /* VS CODE Code: */
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int pivotindex = -1;

        for (int i = 0; i < n; i++) {
            int leftsum = (i == 0) ? 0 : prefix[i - 1];
            int rightsum = prefix[n - 1] - prefix[i];
            if (leftsum == rightsum) {
                pivotindex = i;
                break;
            }
        }
        System.out.println(pivotindex);
    }
}
/*
 * Thinking process:
 * 1.Take input array nums
 * 2. Find its length store in 'n'
 * 3. Initialize prefix array of length 'n'
 * 4.Set first element of prefix array equal to first element of nums array
 * prefix[0] = nums[0]
 * 5.Traverse from i=1 to i<n and increment i by 1
 * we start from i = 1 cause i =0 is already set up
 * use prefix array creation formula
 * prefix[i] = prefix[i-1] + nums[i]
 * 6.Lets assume pivotindex = -1 as per the question
 * 7.traverse from i = 0 to i<n and increment i by 1
 * 8. Calculating int leftsum
 * leftsum = prefix[i-1]
 * edge case if i = 0 , leftsum = 0
 * 9. Calculating int rightsum
 * rightsum =prefix[n-1] - prefix[i]
 * 10. If leftsum == rightsum
 * Set pivotindex = i
 * break out of the loop
 * 11. Return pivotindex
 */

/*
 * Leetcode code:
 * class Solution {
 * public int pivotIndex(int[] nums) {
 * int n = nums.length;
 * int[] prefix = new int[n];
 * prefix[0] = nums[0];
 * for (int i = 1; i < n; i++) {
 * prefix[i] = prefix[i - 1] + nums[i];
 * }
 * int pivotindex = -1;
 * for (int i = 0; i < n; i++) {
 * int leftsum = (i == 0) ? 0 : prefix[i - 1];
 * int rightsum = prefix[n - 1] - prefix[i];
 * if (leftsum == rightsum) {
 * pivotindex = i;
 * break;
 * }
 * }
 * return pivotindex;
 * }
 * }
 */
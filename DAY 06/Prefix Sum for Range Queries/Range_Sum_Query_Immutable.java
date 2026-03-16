public class Range_Sum_Query_Immutable {
    public static void main(String[] args) {
        // 303 Range Sum Query - Immutable
        /*
         * Given an integer array nums, handle multiple queries of the following type:
         * Calculate the sum of the elements of nums between indices left and right
         * inclusive where left <= right.
         * Implement the NumArray class:
         * NumArray(int[] nums) Initializes the object with the integer array nums.
         * int sumRange(int left, int right) Returns the sum of the elements of nums
         * between indices left and right inclusive (i.e. nums[left] + nums[left + 1] +
         * ... + nums[right]).
         * 
         * Example 1:
         * Input
         * ["NumArray", "sumRange", "sumRange", "sumRange"]
         * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
         * Output
         * [null, 1, -1, -3]
         * Explanation
         * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
         * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
         * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
         * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 104
         * -105 <= nums[i] <= 105
         * 0 <= left <= right < nums.length
         * At most 104 calls will be made to sumRange.
         */
    }
}
/*
 * Thinking Process:
 * 1.Consider an numarray as input
 * 2. Consider subrange as input
 * 3. Build prefix array of numarray
 * 4.Create answer array of length equal to num array length
 * 4. if sumrange (number1,number2)
 * use formula sumrange(number1,number2) = prefix(number2) - prefix(number1-1)
 * store answer in answerarray
 * 5. if sumrange (0,number2)
 * use formula sumrange(0,number2) = prefix(number2)
 * store answer in answerarray
 * 6. Output the asnwerarray
 */

/*
 * Correct thinking process:
 * thinking process is slightly off structurally.
 * You wrote:
 * Create answer array
 * This problem does NOT require storing answers in an array.
 * Why?
 * Because:sumRange(left, right) is called multiple times.
 * Each time you just return a single integer.
 * You do NOT store all answers together.
 * 
 * You assumed:
 * subrange as input
 * Actually structure is:
 * Constructor takes full array.
 * sumRange() takes left & right.
 * Returns single integer.
 * No separate “subrange array”.
 * 
 * Correct Thinking Process
 * We are given an array in constructor.
 * We must answer multiple sumRange(left, right) queries.
 * To avoid recalculating sum every time, build a prefix array once.
 * Store prefix array as an instance variable.
 * In sumRange(left, right):
 * If left == 0, return prefix[right].
 * Else return prefix[right] - prefix[left-1].
 * Do NOT rebuild prefix every time.
 * Do NOT store answers in separate array.
 * This is:
 * Design a class that answers many queries efficiently
 * That’s why prefix must be stored globally inside class.
 * 
 * Summary Correction
 * Remove this from your thinking:
 * “Create answer array”
 * “Store result in answer array”
 * Replace with:
 * “Return result directly from sumRange method”
 */

/*
 * Leetcode Code:
 * class NumArray {
 * int [] prefix;
 * public NumArray(int[] nums) {
 * int n = nums.length;
 * prefix = new int[n];
 * prefix[0] = nums[0];
 * for(int i=1;i<n;i++){
 * prefix[i] = prefix[i-1] + nums[i];
 * }
 * }
 * public int sumRange(int left, int right) {
 * if(left==0){
 * return prefix[right];
 * }
 * else{
 * return prefix[right] - prefix[left - 1];
 * }
 * }
 * }
 * /**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
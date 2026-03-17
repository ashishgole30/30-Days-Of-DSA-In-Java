public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        // 26. Remove Duplicates from Sorted Array
        /*
         * Given an integer array nums sorted in non-decreasing order, remove the
         * duplicates in-place such that each unique element appears only once. The
         * relative order of the elements should be kept the same.
         * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After
         * removing duplicates, return the number of unique elements k.
         * The first k elements of nums should contain the unique numbers in sorted
         * order. The remaining elements beyond index k - 1 can be ignored.
         * Custom Judge:
         * The judge will test your solution with the following code:
         * int[] nums = [...]; // Input array
         * int[] expectedNums = [...]; // The expected answer with correct length
         * int k = removeDuplicates(nums); // Calls your implementation
         * assert k == expectedNums.length;
         * for (int i = 0; i < k; i++) {
         * assert nums[i] == expectedNums[i];
         * }
         * If all assertions pass, then your solution will be accepted.
         * 
         * Example 1:
         * Input: nums = [1,1,2]
         * Output: 2, nums = [1,2,_]
         * Explanation: Your function should return k = 2, with the first two elements
         * of nums being 1 and 2 respectively.
         * It does not matter what you leave beyond the returned k (hence they are
         * underscores).
         * 
         * Example 2:
         * Input: nums = [0,0,1,1,1,2,2,3,3,4]
         * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
         * Explanation: Your function should return k = 5, with the first five elements
         * of nums being 0, 1, 2, 3, and 4 respectively.
         * It does not matter what you leave beyond the returned k (hence they are
         * underscores).
         * 
         * Constraints:
         * 1 <= nums.length <= 3 * 104
         * -100 <= nums[i] <= 100
         * nums is sorted in non-decreasing order.
         */
        /* VS CODE Code: */
        int[] nums = { 1, 1, 2 };

        int slow = 1;

        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[fast] != nums[slow - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        System.out.println(slow);
    }
}
/*
 * Thinking Process:
 * 🟢 First Understand the Core Fact
 * Array is sorted.
 * That means:
 * Duplicates are always next to each other.
 * 
 * Example:
 * 0 0 1 1 1 2 2 3 3 4
 * You don’t need to search entire array for duplicates.
 * Just compare with previous unique element.
 * 
 * Step-by-Step Thinking Process
 * 
 * ✅ Step 1: Handle First Element
 * First element is always unique.
 * So:
 * We already have 1 unique element.
 * That means:
 * slow = 1
 * Why 1?
 * Because:
 * index 0 is already filled with first unique
 * next unique should go at index 1
 * 
 * ✅ Step 2: Start Fast Pointer From Index 1
 * Because index 0 is already handled.
 * fast moves from 1 to n-1
 * 
 * ✅ Step 3: Compare Current With Last Unique
 * Now ask:
 * Is nums[fast] different from the last unique number?
 * Where is last unique number stored?
 * At:
 * index slow - 1
 * If different → it's a new unique value.
 * 
 * ✅ Step 4: Store New Unique
 * If new unique found:
 * Place it at index slow
 * Increase slow
 * so slow always means:
 * "Next position to fill"
 * 
 * ✅ Step 5: After Loop Ends
 * Slow represents:
 * Total number of unique elements
 * Return slow.
 * 
 * Final Summary (Write This in Notes)
 * 1. First element is always unique → slow = 1
 * 2. Fast scans from index 1
 * 3. If nums[fast] != last unique (nums[slow-1])
 * 4. Store nums[fast] at index slow
 * 5. Increase slow
 * 6. Return slow
 * 
 * What You Must Remember
 * Slow = next position to insert unique value
 * Fast = scanning pointer
 */
/*
 * Leetcode code:
 * class Solution {
 * public int removeDuplicates(int[] nums) {
 * int slow = 1;
 * 
 * for (int fast = 1; fast < nums.length; fast++) {
 * 
 * if (nums[fast] != nums[slow - 1]) {
 * nums[slow] = nums[fast];
 * slow++;
 * }
 * }
 * return slow;
 * }
 * }
 */
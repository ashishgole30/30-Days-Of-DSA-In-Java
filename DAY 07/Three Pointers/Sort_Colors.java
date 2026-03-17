public class Sort_Colors {
    public static void main(String[] args) {
        // 75 Sort Colors
        /*
         * Given an array nums with n objects colored red, white, or blue, sort them
         * in-place so that objects of the same color are adjacent, with the colors in
         * the order red, white, and blue.
         * We will use the integers 0, 1, and 2 to represent the color red, white, and
         * blue, respectively.
         * You must solve this problem without using the library's sort function.
         * 
         * Example 1:
         * Input: nums = [2,0,2,1,1,0]
         * Output: [0,0,1,1,2,2]
         * 
         * Example 2:
         * Input: nums = [2,0,1]
         * Output: [0,1,2]
         * 
         * Constraints:
         * n == nums.length
         * 1 <= n <= 300
         * nums[i] is either 0, 1, or 2.
         * 
         * Follow up: Could you come up with a one-pass algorithm using only constant
         * extra space?
         */
        /* VS CODE Code: */

        int[] nums = { 2, 0, 2, 1, 1, 0 };
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");

        }
    }
}
/*
 * thinking process:
 * ✅ Goal
 * Sort an array containing only:
 * 0 → Red
 * 1 → White
 * 2 → Blue
 * In-place, one pass, O(n).
 * 
 * ✅ Core Idea
 * Divide the array into 4 regions:
 * [ 0 zone | 1 zone | unknown zone | 2 zone ]
 * We will shrink the unknown zone until everything is sorted.
 * 
 * ✅ Step-by-Step Algorithm
 * 1️⃣ Initialize Three Pointers
 * low = 0 → next position for 0
 * mid = 0 → current element
 * high = n - 1 → next position for 2
 * 
 * 2️⃣ Loop Condition
 * Repeat while:
 * mid <= high
 * Because once mid crosses high, unknown zone is finished.
 * 
 * 3️⃣ Check Value at mid
 * Now handle 3 cases:
 * 
 * 🔵 Case 1: If element == 0
 * Swap element at low and mid
 * Increment low
 * Increment mid
 * Reason:
 * 0 is placed correctly, and swapped value at mid is already processed.
 * 
 * ⚪ Case 2: If element == 1
 * Just increment mid
 * Reason:
 * 1 belongs in the middle zone already.
 * 
 * 🔴 Case 3: If element == 2
 * Swap element at mid and high
 * Decrement high
 * ❗ Do NOT increment mid
 * Reason:
 * The swapped element from high is unknown, so we must check it again.
 * 
 * 4️⃣ Stop When mid > high
 * At this point:
 * All 0s are in front
 * All 1s in middle
 * All 2s at end
 * Sorted.
 * 
 * ✅ Important Rules to Remember
 * ✔ Increment both low and mid only when value is 0
 * ✔ Increment only mid when value is 1
 * ✔ Decrement only high when value is 2
 */
/*
 * leetcode code:
 * class Solution {
 * public void sortColors(int[] nums) {
 * int low = 0;
 * int mid = 0;
 * int high = nums.length - 1;
 * 
 * while (mid <= high) {
 * if (nums[mid] == 0) {
 * int temp = nums[low];
 * nums[low] = nums[mid];
 * nums[mid] = temp;
 * low++;
 * mid++;
 * } else if (nums[mid] == 1) {
 * mid++;
 * } else {
 * int temp = nums[high];
 * nums[high] = nums[mid];
 * nums[mid] = temp;
 * high--;
 * }
 * }
 * 
 * }
 * }
 */
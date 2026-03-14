public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        // 1365. How Many Numbers Are Smaller Than the Current Number
        /*
         * Given the array nums, for each nums[i] find out how many numbers in the array
         * are smaller than it. That is, for each nums[i] you have to count the number
         * of valid j's such that j != i and nums[j] < nums[i].
         * Return the answer in an array.
         * 
         * Example 1:
         * Input: nums = [8,1,2,2,3]
         * Output: [4,0,1,1,3]
         * Explanation:
         * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
         * For nums[1]=1 does not exist any smaller number than it.
         * For nums[2]=2 there exist one smaller number than it (1).
         * For nums[3]=2 there exist one smaller number than it (1).
         * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
         * 
         * Example 2:
         * Input: nums = [6,5,4,8]
         * Output: [2,1,0,3]
         * 
         * Example 3:
         * Input: nums = [7,7,7,7]
         * Output: [0,0,0,0]
         */
        /* VS CODE Code: */

        int[] nums = { 8, 1, 2, 2, 3 };
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            array[i] = count;
        }

        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
/*
 * Thinking Process:
 * 1. Start
 * 2. Input array nums
 * 3. Create result array
 * 4. For each element i in nums
 * 5. Set count = 0
 * 6. Compare nums[i] with every element j
 * 7. If nums[j] < nums[i], increase count
 * 8. Store count in result[i]
 * 9. Repeat for all elements
 * 10. Output result array
 * 11. End
 */

/*
 * Leetcode Code:
 * class Solution {
 * public int[] smallerNumbersThanCurrent(int[] nums) {
 * int[] array = new int[nums.length];
 * 
 * for (int i = 0; i < nums.length; i++) {
 * int count = 0;
 * for (int j = 0; j < nums.length; j++) {
 * if (j != i && nums[j] < nums[i]) {
 * count++;
 * }
 * array[i] = count;
 * }
 * }
 * return array;
 * }
 * }
 */
public class Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
        // 167 Two Sum II - Input Array Is Sorted
        /*
         * Given a 1-indexed array of integers numbers that is already sorted in
         * non-decreasing order, find two numbers such that they add up to a specific
         * target number. Let these two numbers be numbers[index1] and numbers[index2]
         * where 1 <= index1 < index2 <= numbers.length.
         * Return the indices of the two numbers index1 and index2, each incremented by
         * one, as an integer array [index1, index2] of length 2.
         * The tests are generated such that there is exactly one solution. You may not
         * use the same element twice.
         * Your solution must use only constant extra space.
         * 
         * Example 1:
         * Input: numbers = [2,7,11,15], target = 9
         * Output: [1,2]
         * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We
         * return [1, 2].
         * 
         * Example 2:
         * Input: numbers = [2,3,4], target = 6
         * Output: [1,3]
         * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We
         * return [1, 3].
         * 
         * Example 3:
         * Input: numbers = [-1,0], target = -1
         * Output: [1,2]
         * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We
         * return [1, 2].
         * 
         * Constraints:
         * 
         * 2 <= numbers.length <= 3 * 104
         * -1000 <= numbers[i] <= 1000
         * numbers is sorted in non-decreasing order.
         * -1000 <= target <= 1000
         * The tests are generated such that there is exactly one solution.
         */
        /* VS CODE Code: */
        int[] numbers = { 2, 3, 4 };
        int target = 6;
        int[] answer = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                answer[0] = left + 1;
                answer[1] = right + 1;
                for (int ans : answer) {
                    System.out.print(ans + " ");
                }
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
/*
 * Thinking Process:
 * 1. '1' Indexex array of int data type called "numbers" is given
 * '1' indexed means array starts from index 1 instead of usual index 0
 * 2.The array is already in ascending order
 * 3.int target is given
 * 4.We have to find two elements such that their sum is equal to target
 * 5.the numbers should be number[index1] and number[index2]
 * where 1<=[index1]<[index2]<numbers.length
 * 6.we have to return the indices of the numebers , each incremented by 1
 * as an integer array [index1 , index2] of length 2.
 */
/*
 * Algorithm Explanation
 * Pattern Used
 * Two Pointers – Opposite Direction
 * Key Idea
 * Since array is sorted, we can:
 * Start from both ends
 * Adjust pointers based on sum
 * This avoids nested loops.
 * 
 * Step-by-Step Algorithm
 * 1️⃣ Initialize Two Pointers
 * left = 0
 * right = n - 1
 * left → smallest element
 * right → largest element
 * 
 * 2️⃣ Loop Until They Meet
 * while (left < right)
 * We stop when both pointers cross.
 * 
 * 3️⃣ Calculate Sum
 * sum = numbers[left] + numbers[right]
 * 
 * 4️⃣ Compare Sum with Target
 * Case 1: sum == target
 * ✔ Pair found
 * ✔ Store indices (1-based indexing)
 * ✔ Stop loop
 * Case 2: sum > target
 * 👉 We need smaller sum
 * 👉 Since array is sorted
 * 👉 Move right pointer left
 * right--
 * Case 3: sum < target
 * 👉 We need bigger sum
 * 👉 Move left pointer right
 * left++
 * 
 * 🔷 Why This Works
 * Because array is sorted:
 * Moving right pointer → decreases sum
 * Moving left pointer → increases sum
 * So we intelligently reduce search space.
 * 
 * 🔷 Dry Run Example
 * numbers = [2,3,4]
 * target = 6
 * Step 1:
 * left=0 (2)
 * right=2 (4)
 * 2+4=6 ✅
 * Answer = [1,3]
 * 
 * 🔷 Time & Space Complexity
 * Time : O(n)
 * Space : O(1)
 * Only one pass through array.
 * 
 * 🔷 Final Summary (Write This Line in Notes)
 * Use two pointers from both ends.
 * If sum too large → move right.
 * If sum too small → move left.
 * Stop when sum equals target.
 */

/*
 * Leetcode code:
 * class Solution {
 * public int[] twoSum(int[] numbers, int target) {
 * 
 * int left = 0;
 * int right = numbers.length - 1;
 * 
 * while (left < right) {
 * 
 * int sum = numbers[left] + numbers[right];
 * 
 * if (sum == target) {
 * return new int[]{left+1,right+1};
 * } else if (sum > target) {
 * right--;
 * } else {
 * left++;
 * }
 * }
 * return new int[]{-1,-1};
 * }
 * }
 */
public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        /*
         * LEETCODE 1295
         * Given an array nums of integers, return how many of them contain an even
         * number of digits.
         * 
         * Example 1:
         * Input: nums = [12,345,2,6,7896]
         * Output: 2
         * Explanation:
         * 12 contains 2 digits (even number of digits).
         * 345 contains 3 digits (odd number of digits).
         * 2 contains 1 digit (odd number of digits).
         * 6 contains 1 digit (odd number of digits).
         * 7896 contains 4 digits (even number of digits).
         * Therefore only 12 and 7896 contain an even number of digits.
         * 
         * Example 2:
         * Input: nums = [555,901,482,1771]
         * Output: 1
         * Explanation:
         * Only 1771 contains an even number of digits.
         * 
         * Constraints:
         * 1 <= nums.length <= 500
         * 1 <= nums[i] <= 105
         */

        /*
         * VS CODE Code:
         */
        int[] nums = { 12, 1223, 1231, 453, 564, 3233 };
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int digitCount = 0;
            int number = nums[i];
            if (number == 0) {
                digitCount = 1;
            } else {

                while (number > 0) {
                    number = number / 10;
                    digitCount++;
                }
            }
            if (digitCount % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);
    }
}
/*
 * Concepts Used:
 * Data Structure Used: Array
 * Concept Used: Array traversal, Conditional checking, Digit counting (using
 * division by 10), Counter variable tracking.
 */
/*
 * Initial thought process:
 * 1. find length of array nums using nums.length
 * 2. Store it in int variable n
 * 3. now we have to examine every index of array nums
 * 4. so to examine we traverse it using for loop
 * 5. for loop starts with i = 0 , goes till n(length of array), and increments
 * by 1
 * 6. in this loop we have to check how many digits each index has?
 * 7. we do this by while loop
 * 8.handle edge case of number being 0 separatelty
 * 8. keep dividing number by 10 and increment counter variable
 * 9. now print counter...if counter is even number...those many indexes have
 * even umber of digits
 */
/*
 * Final thought process:
 * digitCount = 0
 * number = nums[i]
 * 
 * if number == 0
 * digitCount = 1
 * else
 * while number > 0
 * divide by 10
 * increment digitCount
 * 
 * if digitCount is even
 * evenCount++
 */
/*
 * Notes:
 * 1.
 * You don’t actually need n
 * You can store it, but not mandatory.
 * That’s fine though — not wrong.
 * 
 * 2.
 * So there are two counters conceptually:
 * digitCount → resets for every number
 * evenCount → tracks how many numbers have even digits
 * 
 * 3.Edge case for 0
 * Good that you thought of it
 * If number is 0 → it has 1 digit, not 0.
 * So digitCount should become 1.
 */

/*
 * Leetcode Code:
 * class Solution {
 * public int findNumbers(int[] nums) {
 * int evenCount = 0;
 * for (int i = 0; i < nums.length; i++) {
 * int digitCount = 0;
 * int number = nums[i];
 * if (number == 0) {
 * digitCount = 1;
 * } else {
 * while (number > 0) {
 * number = number / 10;
 * digitCount++;
 * }
 * }
 * if (digitCount % 2 == 0) {
 * evenCount++;
 * }
 * }
 * return evenCount;
 * }
 * }
 */
public class A_Number_After_a_Double_Reversal {
    public static void main(String[] args) {
        // 2119. A Number After a Double Reversal
        /*
         * Reversing an integer means to reverse all its digits.
         * For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the
         * leading zeros are not retained.
         * Given an integer num, reverse num to get reversed1, then reverse reversed1 to
         * get reversed2. Return true if reversed2 equals num. Otherwise return false.
         * 
         * Example 1:
         * Input: num = 526
         * Output: true
         * Explanation: Reverse num to get 625, then reverse 625 to get 526, which
         * equals num.
         * 
         * Example 2:
         * Input: num = 1800
         * Output: false
         * Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not
         * equal num.
         * 
         * Example 3:
         * Input: num = 0
         * Output: true
         * Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.
         * 
         * Constraints:
         * 0 <= num <= 106
         */

        /* VS CODE Code: */

        int num = 526;
        if (num == 0) {
            System.out.println(true);
        } else if (num % 10 == 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
/*
 * Thinking Process:
 * 1.int num is given
 * 2.Reverse num to get reversednum1
 * 3. reverse reversednum1 to get reversednum2
 * if(num == reversednum2){
 * return true;}
 * else{
 * return false;}
 * 
 * 
 * NOTE-->
 * Step 1: What happens when you reverse a number?
 * When you reverse a number, digits go from back to front.
 * Example:
 * 123 → reverse → 321
 * 
 * Step 2: Special case — numbers ending with 0
 * If a number ends with 0, that zero disappears after reversing.
 * Example:
 * 120 → reverse → 21
 * Why?
 * Because numbers cannot start with 0.
 * So 021 becomes 21.
 * 
 * Step 3: Reverse again
 * Now reverse again:
 * 21 → reverse → 12
 * Now compare:
 * Original = 120
 * After two reversals = 12
 * They are not the same.
 * 
 * Step 4: When does the number stay the same*
 * If the number does NOT end with 0.
 * Example:
 * 123 → reverse → 321
 * 321 → reverse → 123
 * Original number comes back.
 * 
 * Step 5: Special case
 * 0 → reverse → 0 → reverse → 0
 * So 0 is always valid.
 * Final Simple Rule
 * The number only changes if:
 * it ends with 0
 * and it is not 0
 * Otherwise it stays the same.
 * 
 * One-line idea
 * If a number ends with 0, double reversal will change it.
 * Otherwise it will stay the same.
 * 
 * Check Special case first
 * if special case do something
 * else if do something
 * else do something
 */

/*
 * leetcode Code:
 * class Solution {
 * public boolean isSameAfterReversals(int num) {
 * if (num == 0) {
 * return true;
 * } else if (num % 10 == 0) {
 * return false;
 * } else {
 * return true;
 * }
 * }
 * }
 */
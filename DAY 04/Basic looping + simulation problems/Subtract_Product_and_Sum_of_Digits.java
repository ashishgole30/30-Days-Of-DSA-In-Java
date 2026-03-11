public class Subtract_Product_and_Sum_of_Digits {
    public static void main(String[] args) {
        // LEETCODE 1281 – Subtract Product and Sum of Digits
        /*
         * Given an integer number n, return the difference between the product of its
         * digits and the sum of its digits.
         * 
         * Example 1:
         * Input: n = 234
         * Output: 15
         * Explanation:
         * Product of digits = 2 * 3 * 4 = 24
         * Sum of digits = 2 + 3 + 4 = 9
         * Result = 24 - 9 = 15
         * 
         * Example 2:
         * Input: n = 4421
         * Output: 21
         * Explanation:
         * Product of digits = 4 * 4 * 2 * 1 = 32
         * Sum of digits = 4 + 4 + 2 + 1 = 11
         * Result = 32 - 11 = 21
         * 
         * Constraints:
         * 1 <= n <= 10^5
         */
        /* VS CODE Code: */
        int n = 4421;
        int copy = n;
        int sum = 0;
        int product = 1;

        while (copy != 0) {
            int lastDigit = copy % 10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            copy = copy / 10;
        }
        System.out.println(product - sum);
    }
}
/*
 * Concepts Used:
 * 🔎 Prerequisites
 * 1️⃣ While loop
 * Traverse digits until number becomes 0
 * 2️⃣ Digit extraction
 * Use % 10 to get last digit
 * 3️⃣ Digit removal
 * Use / 10 to remove last digit
 * 4️⃣ Two accumulator variables
 * One for sum of digits
 * One for product of digits
 * 5️⃣ Initialization understanding
 * Sum starts from 0
 * Product starts from 1
 * 6️⃣ Final subtraction
 * Return product - sum
 */

/* Notes: */
/* Leetcode Code: */
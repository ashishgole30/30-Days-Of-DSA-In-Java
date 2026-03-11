public class Count_the_Digits_That_Divide_a_Number {
    public static void main(String[] args) {
        // LEETCODE 2520 Count the Digits That Dividen a Number
        /*
         * Given an integer num, return the number of digits in num that divide num.
         * An integer val divides nums if nums % val == 0.
         * 
         * Example 1:
         * Input: num = 7
         * Output: 1
         * Explanation: 7 divides itself, hence the answer is 1.
         * 
         * Example 2:
         * Input: num = 121
         * Output: 2
         * Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a
         * digit, we return 2.
         * 
         * Example 3:
         * Input: num = 1248
         * Output: 4
         * Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
         * 
         * Constraints:
         * 1 <= num <= 109
         * num does not contain 0 as one of its digits.
         */
        /* VS CODE Code: */

        int originalNum = 121;
        int copy = 121;
        int count = 0;

        while (copy != 0) {
            int lastDigit = copy % 10;
            if (lastDigit != 0 && originalNum % lastDigit == 0) {
                count++;
            }
            copy = copy / 10;
        }
        System.out.println(count);
    }
}

/*
 * Concepts Used:
 * 1️⃣ While loop traversal of digits
 * Process number until it becomes 0
 * 2️⃣ Digit extraction
 * Use % 10 to get last digit
 * 3️⃣ Digit removal
 * Use / 10 to remove last digit
 * 4️⃣ Modulo operation
 * Check if original number % digit == 0
 * 5️⃣ Edge case handling
 * Avoid division by 0
 * 6️⃣ Counter variable
 * Count valid digits
 */
/*
 * Notes:
 * 🔴 Problem
 * You are modifying num while also using it for divisibility check.
 * Inside loop:
 * lastDigit = num % 10
 * if (num % lastDigit == 0)
 * But notice:
 * You are dividing num each time.
 * So after first iteration:
 * 121 → 12 → 1 → 0
 * Now you are checking divisibility against a changing number, not the original
 * 121.
 * 
 * 🧠 What Should Happen?
 * The condition says:
 * Check if the original number is divisible by the digit.
 * Not the reduced number.
 * Correct Thinking Pattern
 * You need:
 * 1️⃣ One variable that stays constant → original number
 * 2️⃣ One variable that you reduce digit by digit
 * Right now you are using the same variable for both purposes.
 * That’s why result becomes incorrect.
 * 
 * 🔥 Second Issue (Important)
 * What if digit is 0?
 * Then:
 * num % 0
 * Will crash (division by zero).
 * Now for the second issue (division by zero) — idea only:
 * Inside your loop you extract:
 * lastDigit = copy % 10
 * Now think:
 * What if lastDigit becomes 0?
 * If you directly check:
 * originalNum % lastDigit
 * That becomes:
 * originalNum % 0
 * Which causes ArithmeticException (divide by zero) ❌
 * 
 * 🧠 Idea to Fix
 * Before checking divisibility, add a guard condition:
 * If lastDigit is NOT 0
 * then check divisibility
 * So logically:
 * if lastDigit != 0 AND originalNum % lastDigit == 0
 * count++
 * 
 * ⚠️ One More Important Observation
 * Right now you are doing:
 * copy = copy / 10
 * inside the if block only.
 * Think carefully:
 * What happens if the digit is 0 or not divisible?
 * Will copy reduce?
 * If not, the loop may get stuck.
 * 
 * Things learnt:
 * Digit extraction
 * State separation (original vs copy)
 * Guard condition
 * Loop control correctness
 */
/*
 * Leetcode Code:
 * class Solution {
 * public int countDigits(int num) {
 * int copy = num;
 * int count = 0;
 * while (copy != 0) {
 * int lastDigit = copy % 10;
 * if (lastDigit != 0 && num % lastDigit == 0) {
 * count++;
 * }
 * copy = copy / 10;
 * }
 * return count;
 * }
 * }
 */
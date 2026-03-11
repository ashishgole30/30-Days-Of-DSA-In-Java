public class Count_Operations_to_Obtain_Zero {
    public static void main(String[] args) {
        // LEETCODE 2169 Count Operations to Obtain Zero
        /*
         * You are given two non-negative integers num1 and num2.
         * In one operation, if num1 >= num2, you must subtract num2 from num1,
         * otherwise subtract num1 from num2.
         * For example, if num1 = 5 and num2 = 4, subtract num2 from num1, thus
         * obtaining num1 = 1 and num2 = 4. However, if num1 = 4 and num2 = 5, after one
         * operation, num1 = 4 and num2 = 1.
         * Return the number of operations required to make either num1 = 0 or num2 = 0.
         * 
         * Example 1:
         * Input: num1 = 2, num2 = 3
         * Output: 3
         * Explanation:
         * - Operation 1: num1 = 2, num2 = 3. Since num1 < num2, we subtract num1 from
         * num2 and get num1 = 2, num2 = 3 - 2 = 1.
         * - Operation 2: num1 = 2, num2 = 1. Since num1 > num2, we subtract num2 from
         * num1.
         * - Operation 3: num1 = 1, num2 = 1. Since num1 == num2, we subtract num2 from
         * num1.
         * Now num1 = 0 and num2 = 1. Since num1 == 0, we do not need to perform any
         * further operations.
         * So the total number of operations required is 3.
         * 
         * Example 2:
         * Input: num1 = 10, num2 = 10
         * Output: 1
         * Explanation:
         * - Operation 1: num1 = 10, num2 = 10. Since num1 == num2, we subtract num2
         * from num1 and get num1 = 10 - 10 = 0.
         * Now num1 = 0 and num2 = 10. Since num1 == 0, we are done.
         * So the total number of operations required is 1.
         * 
         * Constraints:
         * 0 <= num1, num2 <= 105
         */

        /* VS CODE Code: */
        int num1 = 2;
        int num2 = 3;

        int numberOfOperations = 0;

        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 = num1 - num2;
                numberOfOperations++;
            } else {
                num2 = num2 - num1;
                numberOfOperations++;
            }
        }
        System.out.println(numberOfOperations);

    }
}
/*
 * Concepts Used:
 * 1️⃣ While loop
 * 
 * Continue until one number becomes 0
 * 
 * 2️⃣ Conditional checking (if-else)
 * 
 * Compare two numbers
 * 
 * 3️⃣ Basic subtraction
 * 
 * Subtract smaller from larger
 * 
 * 4️⃣ Counter variable
 * 
 * Count number of operations
 * 
 * 5️⃣ Loop termination understanding
 * 
 * Stop when either number becomes 0
 */

/*
 * Notes: 🔴 Main Issue → Loop Condition
 * 
 * You wrote:
 * 
 * while (num1 != 0 || num2 != 0)
 * 
 * Think carefully:
 * 
 * The problem says:
 * 
 * Stop when either number becomes 0.
 * 
 * But your condition says:
 * 
 * Continue while at least one is non-zero
 * 
 * That means if one becomes 0 and the other is not,
 * your loop will still continue ❌
 * 
 * Now imagine:
 * 
 * num1 = 0
 * num2 = 5
 * 
 * Condition:
 * 
 * 0 != 0 OR 5 != 0 → true
 * 
 * So loop continues.
 * 
 * Now inside:
 * 
 * if (num1 >= num2)
 * 
 * 0 >= 5 → false
 * So else:
 * 
 * num2 = num2 - num1
 * 
 * 5 - 0 = 5
 * 
 * Nothing changes.
 * 
 * You get infinite loop 🚨
 * 
 * 🧠 Correct Logical Thinking
 * 
 * You should continue only while BOTH are non-zero.
 * 
 * Meaning:
 * 
 * Loop should stop immediately when either becomes 0.
 */
/* Leetcode Code: */

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        // 1342 LEETCODE Number of Steps to Reduce a Number to Zero
        /*
         * Given an integer num, return the number of steps to reduce it to zero.
         * In one step, if the current number is even, you have to divide it by 2,
         * otherwise, you have to subtract 1 from it.
         * 
         * Example 1:
         * Input: num = 14
         * Output: 6
         * Explanation:
         * Step 1) 14 is even; divide by 2 and obtain 7.
         * Step 2) 7 is odd; subtract 1 and obtain 6.
         * Step 3) 6 is even; divide by 2 and obtain 3.
         * Step 4) 3 is odd; subtract 1 and obtain 2.
         * Step 5) 2 is even; divide by 2 and obtain 1.
         * Step 6) 1 is odd; subtract 1 and obtain 0.
         * 
         * Example 2:
         * Input: num = 8
         * Output: 4
         * Explanation:
         * Step 1) 8 is even; divide by 2 and obtain 4.
         * Step 2) 4 is even; divide by 2 and obtain 2.
         * Step 3) 2 is even; divide by 2 and obtain 1.
         * Step 4) 1 is odd; subtract 1 and obtain 0.
         * 
         * Example 3:
         * Input: num = 123
         * Output: 12
         * 
         * Constraints:
         * 0 <= num <= 106
         */

        /* VS CODE Code: */

        int num = 123;
        int numOfSteps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            numOfSteps++;
        }
        System.out.println(numOfSteps);
    }
}
/*
 * Concepts Used:
 * Concept Used:While loop,Conditional checking (if-else),Modulo operator
 * (%),Basic arithmetic operations,Counter variable
 */

/*
 * Initial Thought Process:
 * 1. create variable int num with some value
 * 2.create variable int steps =0 to keep count of steps
 * 3. we continue as long as num is not equal to zero
 * 4. if num is equal to zero we stop
 * 5. we check if number is even
 * 6. if even , divide itself by 2
 * 7. if odd , subtract itself by 1
 * 8. increment steps by 1
 * 9. print steps
 */

/*
 * Final Thought Process:
 * Same as initial thought process
 */

/* Notes: */

/*
 * Leetcode Code:
 * class Solution {
 * public int numberOfSteps(int num) {
 * int numOfSteps = 0;
 * while (num != 0) {
 * if (num % 2 == 0) {
 * num = num / 2;
 * } else {
 * num = num - 1;
 * }
 * numOfSteps++;
 * }
 * return numOfSteps;
 * }
 * }
 */
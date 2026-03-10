public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        // LeetCode 1672 – Richest Customer Wealth
        /*
         * You are given an m x n integer grid accounts where accounts[i][j] is the
         * amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
         * bank. Return the wealth that the richest customer has.
         * A customer's wealth is the amount of money they have in all their bank
         * accounts. The richest customer is the customer that has the maximum wealth.
         * 
         * Example 1:
         * Input: accounts = [[1,2,3],[3,2,1]]
         * Output: 6
         * Explanation:
         * 1st customer has wealth = 1 + 2 + 3 = 6
         * 2nd customer has wealth = 3 + 2 + 1 = 6
         * Both customers are considered the richest with a wealth of 6 each, so return
         * 6.
         * 
         * Example 2:
         * Input: accounts = [[1,5],[7,3],[3,5]]
         * Output: 10
         * Explanation:
         * 1st customer has wealth = 6
         * 2nd customer has wealth = 10
         * 3rd customer has wealth = 8
         * The 2nd customer is the richest with a wealth of 10.
         * 
         * Example 3:
         * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
         * Output: 17
         */
        /* VS CODE Code: */

        int[][] twoDimensionalArray = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 } };

        int maxWealth = 0;

        for (int[] arrays : twoDimensionalArray) {
            int currentWealth = 0;
            for (int array : arrays) {
                currentWealth = currentWealth + array;

            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        System.out.println(maxWealth);
    }
}
/*
 * Concepts Used: 2D Array traversal ,Nested for loops ,Sum accumulation ,Max
 * tracking variable
 * Data Structure Used: 2D Array
 */
/*
 * Thought Process:
 * maxWealth = 0
 * 
 * for each row:
 * currentWealth = 0
 * 
 * for each value in row:
 * currentWealth += value
 * 
 * update maxWealth
 * 
 * print maxWealth
 */

/*
 * LeetCode Code:
 * class Solution {
 * public int maximumWealth(int[][] accounts) {
 * int maxWealth = 0;
 * 
 * for (int[] arrays : accounts) {
 * int currentWealth = 0;
 * for (int array : arrays) {
 * currentWealth = currentWealth + array;
 * 
 * }
 * if (currentWealth > maxWealth) {
 * maxWealth = currentWealth;
 * }
 * }
 * return maxWealth;
 * }
 * }
 */
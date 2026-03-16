public class Find_the_Highest_Altitude {
    public static void main(String[] args) {

        // 1732 Find the Highest Altitude
        /*
         * There is a biker going on a road trip. The road trip consists of n + 1 points
         * at different altitudes. The biker starts his trip on point 0 with altitude
         * equal 0.
         * You are given an integer array gain of length n where gain[i] is the net gain
         * in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the
         * highest altitude of a point.
         * 
         * Example 1:
         * Input: gain = [-5,1,5,0,-7]
         * Output: 1
         * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
         * 
         * Example 2:
         * Input: gain = [-4,-3,-2,-1,4,3,2]
         * Output: 0
         * Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
         * 
         * Constraints:
         * n == gain.length
         * 1 <= n <= 100
         * -100 <= gain[i] <= 100
         */

        /* VS Code code: */
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        int n = gain.length;
        int currentAltitude = 0;
        int maximumAltitude = 0;
        for (int i = 0; i < n; i++) {
            currentAltitude = currentAltitude + gain[i];
            if (currentAltitude > maximumAltitude) {
                maximumAltitude = currentAltitude;
            }
        }
        System.out.println(maximumAltitude);
    }
}
/*
 * Thinking process:
 * We start at altitude 0.
 * Each element in gain[] tells how much we move up or down.
 * Build a running sum to track current altitude.
 * After updating altitude at each step, check:
 * Is this the highest altitude reached so far?
 * If yes, update the maximum altitude.
 * After traversing the array, return the highest altitude recorded.
 * Core Idea in One Line
 * Keep adding gains to current altitude and track the maximum value reached.
 * 
 */
/*
 * Leetcode code:
 * class Solution {
 * public int largestAltitude(int[] gain) {
 * int n = gain.length;
 * int currentAltitude = 0;
 * int maximumAltitude = 0;
 * for (int i = 0; i < n; i++) {
 * currentAltitude = currentAltitude + gain[i];
 * if (currentAltitude > maximumAltitude) {
 * maximumAltitude = currentAltitude;
 * }
 * }
 * return maximumAltitude;
 * }
 * }
 */
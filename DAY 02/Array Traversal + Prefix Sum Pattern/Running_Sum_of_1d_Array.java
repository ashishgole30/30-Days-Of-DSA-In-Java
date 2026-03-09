public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        // Leetcode 1480 Running Sum of 1d Array
        /*
         * Given an array nums. We define a running sum of an array as runningSum[i] =
         * sum(nums[0]…nums[i]).
         * Return the running sum of nums.
         * 
         * Example 1:
         * Input: nums = [1,2,3,4]
         * Output: [1,3,6,10]
         * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         * 
         * Example 2:
         * Input: nums = [1,1,1,1,1]
         * Output: [1,2,3,4,5]
         * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1,
         * 1+1+1+1+1].
         * 
         * Example 3:
         * Input: nums = [3,1,2,10,1]
         * Output: [3,4,6,16,17]
         * 
         * Constraints:
         * 1 <= nums.length <= 1000
         * -10^6 <= nums[i] <= 10^6
         */

        /*
         * Concepts Used:
         * Data Structure Used: Array
         * Concept Used: Array traversal, Running sum accumulation, Index-based access.
         */

        /*
         * Initial thought process:
         * 1.Store length of array nums in variable int n
         * 2.Create an array called int runningSum[] of size = n
         * 3. now i think we need two foor loops
         * 4. one for i to increase index of running sum
         * 5. one for j to accumulate and sum index of nums
         * 6. dry run i think should be something like this: for nums={1,2,3,4}
         * iteration 1:
         * i = 0
         * runningSum at index i = 0 is equal to nums at index i = 0
         * runningSum{1}
         * 
         * iteration 2:
         * i = 1
         * runningSum at index i = 1 should be equal to nums at index 0 + nums at index
         * 1
         * runningSum{1,1+2=3}
         * 
         * iteration 3:
         * i = 2
         * runningSum at index i = 2 should be equal to nums at index 0 + nums at index
         * 1 + nums at index 2
         * runningSum{1,1+2=3,1+2+3=6}
         * 
         * iteration 3:
         * i = 3
         * runningSum at index i = 3 should be equal to nums at index 0 + nums at index
         * 1 + nums at index 2 + nums at index 3
         * runningSum{1,1+2 =3 , 1+2+3 = 5 , 1+2+3+4 = 10}
         * 
         * iteration 4:
         * not possible
         * since i<n
         * n = 4
         * 4<4 is not correct
         * 7. return running sum
         */

        /*
         * Final thought process:
         * 1. Store length of nums in n
         * 2. Create runningSum array of size n
         * 3. runningSum[0] = nums[0]
         * 4. Traverse array from index 1 to n-1
         * 5. runningSum[i] = runningSum[i-1] + nums[i]
         * 6. Return runningSum
         */

        /*
         * Notes:
         * Complexity Insight
         * Your two-loop idea
         * O(n²)
         * Better approach:
         * O(n)
         * Interviewers always prefer O(n).
         * One Small Tip for You
         * When solving array problems, always ask:
         * Can I reuse previous computation?
         * If yes → avoid nested loops.
         */

        /*
         * VS CODE Code:
         */
        // created nums array with 4 values
        // indexes 0,1,2,3
        int nums[] = { 1, 2, 3, 4 };
        // stored length of nums array in variable n
        // n = 4
        int n = nums.length;
        // created runningsum array with length n = 4
        int runningSum[] = new int[n];

        // hardcoded value of running sum at index 0 = value of nums at index 0
        runningSum[0] = nums[0];

        // for loop
        // i starts from index 1 since 0 index is already dealt with
        // i goes tiil <=n-1 <=4-1 <=3
        // i = 1 , i = 2 , i = 3
        // increment 1 by one
        // runningsum at index i = running sum at index of i-1 + nums at index of i

        // Dry run
        /*
         * for nums{1,2,3,4}
         * 
         * Initially
         * runningSum[0] = nums[0]
         * nums[0] = 1
         * runningSum[0] = 1
         * runningSum = [1,0,0,0]
         * 
         * iteration 1:
         * i = 1
         * runningSum[ i = 1] = runningSum[ i-1 = 1-1 = 0] + nums[i=1]
         * = 1 + 2
         * runningSum[1] = 3
         * runningSum =[1,3,0,0]
         * 
         * Iteration 2
         * i = 2
         * runningSum[ i = 2] = runningSum[ i-1 = 2-1 = 1 ] + nums[i=2]
         * = 3 + 3
         * runningSum[2]= 6
         * runningSum =[1,3,6,0]
         * 
         * * Iteration 3
         * i = 3
         * runningSum[ i = 3] = runningSum[ i-1 = 3-1 = 2 ] + nums[i=3]
         * = 6 + 4
         * runningSum[3] = 10
         * runningSum =[1,3,6,10]
         */
        for (int i = 1; i <= n - 1; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        // printed array runningsum
        for (int runningsums : runningSum) {
            System.out.print(runningsums + " ");
        }

        /*
         * Leetcode Code:
         * class Solution { public int[] runningSum(int[] nums) {
         * int n = nums.length;
         * int runningSum[] = new int[n];
         * runningSum[0] = nums[0];
         * for (int i = 1; i < n; i++) {
         * runningSum[i] = runningSum[i - 1] + nums[i];
         * }
         * return runningSum; }
         * }
         */
    }
}
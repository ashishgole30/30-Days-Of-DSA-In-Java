public class Concatenation_of_Array {
    public static void main(String[] args) {
        // LEETCODE 1929 Concatenation_of_Array

        /*
         * Given an integer array nums of length n, you want to create an array ans of
         * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
         * (0-indexed).
         * Specifically, ans is the concatenation of two nums arrays.
         * Return the array ans.
         * 
         * Example 1:
         * Input: nums = [1,2,1]
         * Output: [1,2,1,1,2,1]
         * Explanation: The array ans is formed as follows:
         * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
         * - ans = [1,2,1,1,2,1]
         * 
         * Example 2:
         * Input: nums = [1,3,2,1]
         * Output: [1,3,2,1,1,3,2,1]
         * Explanation: The array ans is formed as follows:
         * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
         * - ans = [1,3,2,1,1,3,2,1]
         * 
         * Constraints:
         * n == nums.length
         * 1 <= n <= 1000
         * 1 <= nums[i] <= 1000
         */

        /*
         * Data Structure Used:Array
         * Concept Used:Array traversal,Index manipulation.
         * 
         * Initial thought process
         * Steps:
         * 1.I will Create array called nums of integer data type with size n,I will
         * create of size 3 , with elemets 10,11,12
         * 2.I will create an array called ans of integer data type with size 6 now
         * 3.Now i will assign ans array[0]= 10,array[1]= 12,array[2]= 13,array[3]=
         * 10,array[4]= 11,array[5]= 12,
         * 4.Then I will print ans array using enhanched for loop
         */

        /*
         * Final thought process
         * 1. In LeetCode, you do NOT create the input array yourself. The platform
         * already gives you the array.
         * 2. The input array nums is already given.
         * 3. Find the length of nums → n
         * 4.you should not hardcode 6 indexes, Because input size may change.
         * 5.Create a new array ans with size = 2 * n
         * 6.Traverse the nums array using for loop
         * 7.for every idex of i
         * 8. ans[i] = nums[i]
         * 9. ans[i+1] = nums[i]
         * 10.In LeetCode you do not print.Instead you return the array.Return ans
         */

        /*
         * NOTES -->
         * In VS Code, you wrote a full program:
         * class
         * main() method
         * created nums
         * printed result
         * But LeetCode is different.
         * LeetCode already provides the main method and input.
         * You only need to write the function logic.
         * Step 1 — Remove main() completely
         * Step 2 — Do NOT create nums
         * In LeetCode:
         * nums is already given
         * It is passed as a parameter
         * Step 3 — Work inside the given function
         * Inside that function you write:Exactly the same logic you used in VS Code.
         * Step 4 — Do NOT print
         * In VS Code you wrote:
         * Instead you return the array.
         * LeetCode prints it automatically.
         * Step 5 — Run & Submit
         * Buttons you will use:
         * Run Code
         * → tests your code on example inputs.
         * Submit
         * → runs code on hidden test cases.
         */

        // VS CODE:CODE -->
        int[] nums = { 1, 2, 3 };
        // created integer data type array called nums with 3 elements 1,2,3
        // index o = 1
        // index 1 = 2
        // index 2 = 3
        // therefore length of nums array = 3
        int n = nums.length;
        // length of array is stored in integer variable n
        int[] ans = new int[n * 2];
        // ans array is created with lenght = n*2 = 3*2 = 6

        // for every index i starting from 0
        // goes till length of array of nums
        // increment i by 1

        // iteration 1
        // i = 0, i = 0 is less than nums length(3)
        // ans[index 0] = nums[index 0] values same at both index
        // ans[i+n]=ans[0+3]=ans[3]=nums[0] value of nums at index 0 copied to value of
        // ans at index 3
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        // printed array using enhanced for loop
        for (int answers : ans) {
            System.out.print(answers + " ");
        }
    }
}

// LEETCODE:CODE -->
/*
 * class Solution { public int[] getConcatenation(int[] nums) {
 * int n = nums.length;
 * int[] ans = new int[n * 2];
 * for (int i = 0; i <n ; i++) {
 * ans[i] = nums[i]; ans[i + n] = nums[i];
 * }
 * return ans;
 * }
 * }
 */
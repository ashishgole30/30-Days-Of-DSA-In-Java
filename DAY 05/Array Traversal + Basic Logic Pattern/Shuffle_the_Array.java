public class Shuffle_the_Array {
    public static void main(String[] args) {

        // 1470 Shuffle the Array
        /*
         * Given the array nums consisting of 2n elements in the form
         * [x1,x2,...,xn,y1,y2,...,yn].
         * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
         * 
         * Example 1:
         * Input: nums = [2,5,1,3,4,7], n = 3
         * Output: [2,3,5,4,1,7]
         * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
         * [2,3,5,4,1,7].
         * 
         * Example 2:
         * Input: nums = [1,2,3,4,4,3,2,1], n = 4
         * Output: [1,4,2,3,3,2,4,1]
         * 
         * Example 3:
         * Input: nums = [1,1,2,2], n = 2
         * Output: [1,2,1,2]
         * 
         * Constraints:
         * 1 <= n <= 500
         * nums.length == 2n
         * 1 <= nums[i] <= 10^3
         */

        /*
         * Thinking Process:
         * 1. array "nums" of integer data type is give
         * 2. it is in the form of (x1,x2,x3 ...upto xn , y1 , y2 , y3 ...upto yn)
         * 3. so number of x elements = number of y elements
         * 4. also int n is given
         * 5. length of total array = 2n = 2 times the value of n , so array will always
         * be even in length
         * 6. example if n = 3 , length of array = 2n = 2*3 = 6
         * 7. now the output is in the form of (first value of x ,first value of
         * y,second value of x , second value of y, upto n value of , n value of y)
         * 8. So now
         * we create array "answer" of integer data type of same length as nums array
         * since array is always even in length we can divide it into two halves
         * first half for fetching x values
         * second half for fetching y values
         * access first value of first half , access first value of second half
         * print these two values in our new array answer at calculated posiitons
         * repeat the process for entire array
         * return answer array
         * 
         * Algorithm:
         * nums array given
         * n = 3 given
         * 2n = 6 = total length of array
         * results array of length = total length of array initialized
         * for i starting from 0 to i<n = i<3 increment i by 1
         * so i is 0,1,2
         * x = nums[i] = nums[o] hence 1st value
         * x = nums[i] = nums[1] hence 2nd value
         * x = nums[i] = nums[2] hence 3rd value
         * y = nums[i+n] = nums[i+3] = nums[o+3=3] hence 4rth value
         * y = nums[i+n] = nums[i+3] = nums[1+3=4] hence 5th value
         * y = nums[i+n] = nums[i+3] = nums[2+3=5] hence 6th value
         * 
         * x1,y1,x2,y2,x3,y3
         * 0 ,1 ,2 ,3, 4, 5
         * Notice how values of x are always at even positions (o,2,4)
         * and values of y are always at odd posoitons(1,3,5)
         *
         * result[2*i] = x;
         * 2*0= 0 = x
         * 2*1 =2 = x
         * 2*2= 4 = x
         * 
         * result[2*i+1] = x;
         * 2*0 +1 = 1 = y
         * 2*1 +1 =3 = y
         * 2*2 +1 = 5 = y
         * 
         * print array
         * thus answer = [x1,y1,x2,y2,x3,y3....xn,yn]
         */

        /* VS CODE Code: */
        int nums[] = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int totalLength = 2 * n;
        int[] results = new int[totalLength];

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int y = nums[i + n];
            results[2 * i] = x;
            results[2 * i + 1] = y;
        }
        for (int result : results) {
            System.out.print(result + " ");
        }
    }
}
/*
 * Concepts Used:
 * 1️⃣Array traversal (1D)
 * Loop through elements from start to n-1
 * 
 * 2️⃣ Understanding array halves
 * Recognize first
 * half (x values)
 * Recognize second
 * half (y values)
 * 
 * 3️⃣ Index calculation logic
 * Understand how output positions are formed
 * Alternate placement pattern (x, y, x, y...)
 * 
 * 4️⃣ New array creation concept
 * Store result separately
 * Same size as original array
 * 
 * 5️⃣ Position mapping thinking
 * For each index in first half → place two elements in output
 * Maintain correct order
 * 
 * 6️⃣ Basic logical sequencing
 * Pick from first half
 * Pick from second half
 * Repeat until done
 */

/*
 * Leetcode Code:
 * class Solution {
 * public int[] shuffle(int[] nums, int n) {
 * int totalLength = 2 * n;
 * int[] results = new int[totalLength];
 * for (int i = 0; i < n; i++) {
 * int x = nums[i];
 * int y = nums[i + n];
 * results[2 * i] = x;
 * results[2 * i + 1] = y;
 * }
 * return results;
 * }
 * }
 */
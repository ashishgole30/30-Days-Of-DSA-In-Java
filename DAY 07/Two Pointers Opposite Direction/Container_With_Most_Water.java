public class Container_With_Most_Water {
    public static void main(String[] args) {
        // 11 Container with most water
        /*
         * You are given an integer array height of length n. There are n vertical lines
         * drawn such that the two endpoints of the ith line are (i, 0) and (i,
         * height[i]).
         * Find two lines that together with the x-axis form a container, such that the
         * container contains the most water.
         * Return the maximum amount of water a container can store.
         * Notice that you may not slant the container.
         * 
         * Example 1:
         * Input: height = [1,8,6,2,5,4,8,3,7]
         * Output: 49
         * Explanation: The above vertical lines are represented by array
         * [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the
         * container can contain is 49.
         * 
         * Example 2:
         * Input: height = [1,1]
         * Output: 1
         * 
         * Constraints:
         * n == height.length
         * 2 <= n <= 105
         * 0 <= height[i] <= 104
         */

        /* VS CODE Code: */
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
    }
}
/*
 * Thinking Process:
 * 
 * 1. heights array given ={1,8,6,2,5,4,8,3,7}
 * each number = vertical line height
 * 2. We must pick 2 lines such that
 * Area = width * minimum height
 * where
 * width = right - left
 * height = min(height[left],height[right])
 * therefore
 * area = (right - left) * min(height[left], height[right])
 * 3. Using pointers
 * left = 0 initializing 0 pointer to left , left = first vertical line
 * right = n -1 , length of array -1 so that right = last vertical line
 * maxarea = 0, set max area initially to be 0
 * 4. We continue loop until they meet
 * while(left<right)
 * 5.Calculating current area
 * width = right - left
 * height = min(height[left], height[right])
 * area = width * height
 * area = (right - left) * min(height[left], height[right])
 * update
 * maxArea = max(maxArea, area)
 * 6. Moving Pointers
 * Move the pointer with smaller height
 * because area depends on smaller height
 * Example
 * left height = 2
 * right height = 10
 * area uses 2 (minimum)
 * if you move right , minumum is still 2 , no change
 * so only moving left will increase minumum height
 * so
 * if height[left]<height[right]
 * left++
 * else
 * right--
 * 
 * ALGORITHM:
 * 1. Use two pointers (left=0, right=n-1)
 * 2. Calculate area = (right-left) × min(height[left], height[right])
 * 3. Update maxArea
 * 4. Move pointer with smaller height
 * 5. Repeat until left >= right
 * 6. Return maxArea
 * 
 * FORMULAS:
 * 
 * Formula 1: Area = width * minimum height
 * Since we pick two vertical lines and x axis from the container
 * the shape is rectangle
 * so area of rectangle = width * height
 * 
 * Formula 2: Width = right - left
 * lets say height {1,3,2,5,4}
 * left = 1
 * right = 4
 * distance between the, = 4-1=3
 * that is horizontal distance
 * so width = right - left
 * 
 * Formula 3: HEIGHT = min(height[left], height[right])
 * Imagine left height is 3
 * right height is 10
 * Can water go up to height 10?
 * NO
 * Because water will spill out of the container after it reaches 3
 * so container height is limited by smaller wall
 * so height = min(height[left], height[right])
 * because water cannot exceed smaller wall
 * So fomrula 1 uses area = width * minimum height
 * 
 * Formula 4:Final Formula
 * area = width * height
 * width = (right - left)
 * height = min(height[left], height[right]
 * so
 * Area = (right - left) * min(height[left], height[right]
 * 
 * BASICALLY:
 * 
 * Water level is controlled by smaller wall.
 * Width is distance between walls.
 * Area = width × smaller height.
 */
/*
 * Leetcode code:
 * class Solution {
 * public int maxArea(int[] height) {
 * int left = 0;
 * int right = height.length - 1;
 * int maxArea = 0;
 * 
 * while (left < right) {
 * 
 * int width = right - left;
 * 
 * int minHeight = Math.min(height[left], height[right]);
 * 
 * int area = width * minHeight;
 * 
 * maxArea = Math.max(maxArea, area);
 * 
 * if (height[left] < height[right]) {
 * left++;
 * }
 * else {
 * right--;
 * }
 * }
 * return maxArea;
 * }
 * }
 */
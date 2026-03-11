public class Jewels_and_Stones {
    public static void main(String[] args) {
        // LEETCODE 771 Jewels and Stones
        /*
         * You're given strings jewels representing the types of stones that are jewels,
         * and stones representing the stones you have. Each character in stones is a
         * type of stone you have. You want to know how many of the stones you have are
         * also jewels.
         * Letters are case sensitive, so "a" is considered a different type of stone
         * from "A".
         * 
         * Example 1:
         * Input: jewels = "aA", stones = "aAAbbbb"
         * Output: 3
         * 
         * Example 2:
         * Input: jewels = "z", stones = "ZZ"
         * Output: 0
         * 
         * Constraints:
         * 1 <= jewels.length, stones.length <= 50
         * jewels and stones consist of only English letters.
         * All the characters of jewels are unique.
         */

        /* VS CODE Code: */
        String jewels = "aA";
        String stones = "aAAbbbb";
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
/*
 * Concepts:
 * String traversal
 * Loop through characters using charAt(i)
 * Use .length() for size
 * Nested traversal
 * Outer loop → stones
 * Inner loop → jewels
 * Character comparison
 * Compare two characters
 * Counter variable
 * Count matching stones
 * Basic conditional (if)
 * If stone character matches any jewel → increment
 * Nested traversal + Character comparison + Counter
 */
/*
 * Thought Process:
 * 1.for each stone check if its jewel
 * 2. loop through stone string
 * 3. loop through jewels string
 * 4. check if stone character i IS EQUAL TO jewel at character j
 * 5. if yes increment counter variable
 * 6. print counter variable
 */
/*
 * Leetcode Code:
 * class Solution {
 * public int numJewelsInStones(String jewels, String stones) {
 * int count = 0;
 * for (int i = 0; i < stones.length(); i++) {
 * for (int j = 0; j < jewels.length(); j++) {
 * if (stones.charAt(i) == jewels.charAt(j)) {
 * count++;
 * }
 * }
 * }
 * return count;
 * }
 * }
 */
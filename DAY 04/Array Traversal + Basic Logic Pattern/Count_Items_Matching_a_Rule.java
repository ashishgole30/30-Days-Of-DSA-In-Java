public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        // LEETCODE 1773 Count Items Matching a Rule
        /*
         * You are given an array items, where each items[i] = [typei, colori, namei]
         * describes the type, color, and name of the ith item. You are also given a
         * rule represented by two strings, ruleKey and ruleValue.
         * The ith item is said to match the rule if one of the following is true:
         * ruleKey == "type" and ruleValue == typei.
         * ruleKey == "color" and ruleValue == colori.
         * ruleKey == "name" and ruleValue == namei.
         * Return the number of items that match the given rule.
         * 
         * Example 1:
         * Input: items =
         * [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold",
         * "iphone"]], ruleKey = "color", ruleValue = "silver"
         * Output: 1
         * Explanation: There is only one item matching the given rule, which is
         * ["computer","silver","lenovo"].
         * 
         * Example 2:
         * Input: items =
         * [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold",
         * "iphone"]], ruleKey = "type", ruleValue = "phone"
         * Output: 2
         * Explanation: There are only two items matching the given rule, which are
         * ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item
         * ["computer","silver","phone"] does not match.
         * 
         * Constraints:
         * 1 <= items.length <= 104
         * 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
         * ruleKey is equal to either "type", "color", or "name".
         * All strings consist only of lowercase letters.
         */

        /* VS CODE Code: */

        String[][] items = {
                { "phone", "blue", "pixel" },
                { "computer", "silver", "phone" },
                { "phone", "gold", "iphone" }
        };

        int index;
        String ruleKey = "type";
        String ruleValue = "phone";

        int matchingItems = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }

        for (String[] strings : items) {
            if (strings[index].equals(ruleValue)) {
                matchingItems++;
            }
        }
        System.out.println(matchingItems);
    }
}

/*
 * Concepts Used:
 * Data Structure Used: 2D array
 * Concepts Used:String comparison,Conditional checking (if),Counter variable
 */

/*
 * Thought Process:
 * 2D array is given
 * {string array 1} , {string array 2}, {string array 3}
 * {index 0 = type ,index 1 = color, index 3 = name}
 * rulekey = type
 * ruleValue = phone
 * matching pair if: index = 0 type and value = phone
 * 
 * create int index; variable
 * create int matchingitems = 0;
 * If ruleKey is "type" → index = 0
 * If ruleKey is "color" → index = 1
 * If ruleKey is "name" → index = 2
 * For each item:
 * If item[index] equals ruleValue:
 * increase machtingitmes by 1
 * Return machtingitmes
 * 
 */

/*
 * Leetcode Code:
 * class Solution {
 * public int countMatches(List<List<String>> items, String ruleKey, String
 * ruleValue) {
 * int index;
 * int matchingItems = 0;
 * 
 * if (ruleKey.equals("type")) {
 * index = 0;
 * } else if (ruleKey.equals("color")) {
 * index = 1;
 * } else {
 * index = 2;
 * }
 * 
 * for (List<String> item : items) {
 * if (item.get(index).equals(ruleValue)) {
 * matchingItems++;
 * }
 * }
 * return matchingItems;
 * }
 * }
 */
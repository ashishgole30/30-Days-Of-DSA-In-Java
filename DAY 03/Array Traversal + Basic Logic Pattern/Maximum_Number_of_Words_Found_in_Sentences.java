public class Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args) {
        // LEETCODE 2114 Maximum Number of Words Found in Sentences
        /*
         * A sentence is a list of words that are separated by a single space with no
         * leading or trailing spaces.
         * You are given an array of strings sentences, where each sentences[i]
         * represents a single sentence.
         * Return the maximum number of words that appear in a single sentence.
         * 
         * Example 1:
         * Input: sentences = ["alice and bob love leetcode", "i think so too",
         * "this is great thanks very much"]
         * Output: 6
         * Explanation:
         * - The first sentence, "alice and bob love leetcode", has 5 words in total.
         * - The second sentence, "i think so too", has 4 words in total.
         * - The third sentence, "this is great thanks very much", has 6 words in total.
         * Thus, the maximum number of words in a single sentence comes from the third
         * sentence, which has 6 words.
         * 
         * Example 2:
         * Input: sentences = ["please wait", "continue to fight", "continue to win"]
         * Output: 3
         * Explanation: It is possible that multiple sentences contain the same number
         * of words.
         * In this example, the second and third sentences (underlined) have the same
         * number of words.
         * 
         * Constraints:
         * 1 <= sentences.length <= 100
         * 1 <= sentences[i].length <= 100
         * sentences[i] consists only of lowercase English letters and ' ' only.
         * sentences[i] does not have leading or trailing spaces.
         * All the words in sentences[i] are separated by a single space.
         */
        /* VS CODE code: */

        String[] sentences = { "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much" };
        int maxWords = 0;

        for (String sentence : sentences) {
            int spaces = 0;
            int words = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spaces++;
                }
            }
            words = spaces + 1;
            if (words > maxWords) {
                maxWords = words;
            }
        }
        System.out.println(maxWords);
    }
}
/*
 * Concepts Used:Data Structure Used: 1D Array (String array)
 * Pattern Used: Array traversal + String traversal + Space counting + Maximum
 * tracking
 */

/*
 * Initial Thought Process:
 * 1. String array called "sentences" is given
 * 2. sentences[i] = is a single sentence
 * 3. we have to return maximum number of words that appear in sentence
 * 4. so we compare sentence[0],sentence[1],ssentence[2]...upto length of
 * array
 * 5. in the comparision, we should count the number of empty spaces " "
 * 6.if sentence[o] has the most empty spaces , it will have the most words
 * 7.if sentence[1] has the most empty spaces , it will have the most words
 * and so on
 * 8.maximum words will be 1 more than number of spaces
 * since "word1_word2"
 * if 1 space two words
 * "word1_word2_word3"
 * if 2 space three words
 * 9. print maximum words
 */
/*
 * Final Thought Process:
 * 
 * ✔ Sentences is a String array
 * ✔ Each sentences[i] is one sentence
 * ✔ Words are separated by " " (spaces)
 * ✔ Number of words = spaces + 1
 * ✔ You need to find the maximum words among all sentences
 * ✔ You must traverse the array
 * 
 * Small Improvements
 * compare sentence[0], sentence[1]...
 * You are not really comparing sentences.
 * You are checking each sentence one by one and tracking the maximum word
 * count.
 * Better idea:
 * Traverse each sentence and compute its word count.
 * Track the maximum word count seen so far.
 * You wrote:
 * count the number of empty spaces
 * More accurate:
 * Count the number of spaces " " in the sentence.
 * They are not empty spaces, just space characters.
 * Missing Variable
 * Your plan should include:
 * maxWords variable
 * Because you must store the maximum value found so far.
 * 
 * Algorithm:
 * Traverse sentences array
 * For each sentence:
 * count spaces
 * words = spaces + 1
 * update maxWords if needed
 * Return maxWords
 */

/* Notes: */
/*
 * Leetcode Code:
 * class Solution {
 * public int mostWordsFound(String[] sentences) {
 * int maxWords = 0;
 * for (String sentence : sentences) {
 * int spaces = 0;
 * int words = 0;
 * for (int i = 0; i < sentence.length(); i++) {
 * if (sentence.charAt(i) == ' ') {
 * spaces++;
 * }
 * }
 * words = spaces + 1;
 * if (words > maxWords) {
 * maxWords = words;
 * }
 * }
 * return maxWords;
 * }
 * }
 */
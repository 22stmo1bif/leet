/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Starting with this problem I will try to show my thought process through frequent comments

        // 1. To find solution we need to compare next char against all previous chars in the string
        // -> problem! If the longest substring is not at the start it wont work. 
        // When you only use this approach it will always give you the first substring without duplicate characters.
        // We somehow have to compare all substrings without duplicates to find the longest one.
        // Probably easiest to split the string in all existing substrings and then compare.
        // For efficency you could also immediatly disregard substrings that are smaller than previously found substrings immediatly.
        // 
        // Doing what I described above is not feasable in a strait forward manner.
        // The substrings should not be compared directly! 
        // Instead only their length is saved, whenever a duplicate is found and the length is longer than the previous substring
        // 
        int result = 0;
        if (s.length()== 0) return result;

    
        int start = 0; // tracks start of substring
        char[] chars = new char[s.length()];

        for (int n = 0; n < s.length(); n++) {   // go through entire string
            char currentChar = s.charAt(n);

            for (int i = start; i < n; i++) { // go through current substring 
                    
                if (chars[i] == currentChar) {  // check if char is duplicate
                    start = i + 1; // duplicate is found so change starting point of substring
                    break;

                }
            }
            chars[n] = currentChar; // save currentChar in substring array
            
            int currentLength = n - start + 1; // calculate current substring length
            if (currentLength > result) { // save length in result var if longer than before
                result = currentLength;
            }



        }
    return result;

    }
}
// @lc code=end


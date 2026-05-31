/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {

        // Take input integer and reverse order of digits
   
        // Problem with negative integers hard to reverse without using tricks.
        // -> so just ignore them. They must always return false according to logic of the example

        if (x >= 0){
            int reversed;
            int copy = x;
            reversed = 0;
            while (copy > 0){
                reversed = reversed * 10; // 1 -> 10 ; 19-> 190
                reversed = reversed + (copy % 10); // reversed +1, +9, +1     
                copy = copy / 10; // go from 191 to 19 to 1

            }

            return reversed == x;


        } 
        return false;
        
        // not possible due to lack of Stringutils in Leetcode
        

    }
}
// @lc code=end


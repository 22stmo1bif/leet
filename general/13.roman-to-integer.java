/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int location = s.length() - 1;
        int result = 0;
        char pre = 'a';
        while (location >= 0){
            
            switch (s.charAt(location)) {
                case 'I': 
                if (pre == 'V' || pre == 'X') {
                    result -= 1;
                } else result += 1;
                pre = 'I';
                break;
                case 'V': 
                result += 5;
                pre = 'V';
                break;
                case 'X': 
                if (pre == 'L' || pre == 'C') {
                    result -= 10;
                } else result += 10;
                pre = 'X';
                break;
                case 'L': 
                result += 50;
                pre = 'L';
                break;
                case 'C':
                if (pre == 'D' || pre == 'M') {
                    result -= 100;
                } else result += 100;
                pre = 'C';
                break;
                case 'D':
                result += 500;
                pre = 'D';
                break;
                case 'M':
                result += 1000;     
                pre = 'M';
                    break;
                default:
                    throw new AssertionError();
            }
        location--;
            
        }
        return result;
    }
}
// @lc code=end


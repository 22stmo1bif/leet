/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // First instinct and simple concept is to go through array
        // in layered for loops trying all sums of nums until sum is = target --- there is definitely a more elegant solution
        // We need to make sure to not use the same element twice so
        // to do this we can very simply use an if statement that checks
        // if they are both at the same place in the array --- once again there is definitely a more elegant solution
        int x = 0;
        int y = 0;
        int[] indices = new int [2];
        completed: for (int i = 0; i < nums.length; i++){
            x = nums[i];
            for (int n = 0; n < nums.length; n++){
                y = nums[n];
                if (i != n){
                   if((x + y) == target){
                    indices[0] = i;
                    indices[1] = n;
                    break completed;
                   }
                }
            }
        }
        
        return indices;
        
    }
}
// @lc code=end


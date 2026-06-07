

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Brute approach: add linked list elements one-by-one and carry over for additions that go over 10*
       
        int x;
        int y;
        int sum;
        int carry = 0;

        ListNode head = new ListNode(0); // points to start of the list for return
        ListNode product = head; // essentially just a pointer to previously created List

        while  (l1 != null || l2 != null || carry != 0){
            if(l1 != null){
                x = l1.val;
                l1 = l1.next;
            } 
            else x = 0;
            if(l2 != null){
                y = l2.val;
                l2 = l2.next;
            } 
            else y = 0;
            
            sum = x + y + carry;
            carry = sum / 10;
            product.next = new ListNode(sum % 10);
            product = product.next;
        }
        return head.next;
    }
}
// @lc code=end


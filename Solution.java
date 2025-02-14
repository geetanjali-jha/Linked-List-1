// Time complexity:- 
// Space complexity:- 
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach 
/**
 * Approach: 
 * 
 * 
 */ 
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       
       while(fast != null && fast.next != null) {           
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) {
            slow = head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
    }
}


   

     
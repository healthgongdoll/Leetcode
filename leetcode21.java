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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        	ListNode head = new ListNode(0);
	        ListNode newList = head;
	        
	        while(l1 != null && l2 != null) {
	        	
	        	if(l1.val >= l2.val)
	        	{
	        		newList.next = l2;
	        		l2 = l2.next;
	        	}else
	        	{
	        		newList.next = l1;
	        		l1 = l1.next;
	        	}
	        	
	        	newList = newList.next;
	        }
	        
	        if(l1 != null)
	        {
	        	newList.next = l1;
	        }
	        if(l2 != null)
	        {
	        	newList.next = l2;
	        }
	        return head.next;
	      
    }
}
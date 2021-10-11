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
        ListNode head = new ListNode(0);
	         ListNode l3 = head;
	         boolean ten = false;
        
        
	         while(l1 != null && l2 != null)
	         {
	        	 
	        	 if(l1.val +l2.val >= 10)
	        	 {
	        		 l3.next = new ListNode((l1.val + l2.val) % 10); // 10을 넘었을때 처리
	        		if(l1.next == null)
                     {
                     l1.next = new ListNode(0);
                     }
                     if(l2.next == null)
                     {
                     l2.next = new ListNode(0);
                     }
                     l1.next.val = l1.next.val +1;
                     
	        	 }else
	        	 {
	        		 l3.next = new ListNode(l1.val + l2.val); 
                     if(l1.next != null && l2.next == null)
                     {
                         l2.next = new ListNode(0);
                     }
                      if(l2.next != null && l1.next == null)
                     {
                         l1.next = new ListNode(0);
                     }
	        	 }
                
                 
	        	    l1 = l1.next;
	        	     l2 = l2.next;
	        	 
	        	 l3 = l3.next;
	         }
	         
	         return head.next;
}
}
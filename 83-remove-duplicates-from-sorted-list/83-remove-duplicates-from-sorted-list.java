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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode current = head;        
        ListNode previous = head.next;
        while(current!=null){
             while (previous!= null && current.val == previous.val){
                current.next=previous.next;
                previous=previous.next;
            }
            current=current.next;
        }
        return head;
    }
}
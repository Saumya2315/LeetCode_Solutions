/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // while(node.next!=null ){
            ListNode previous = node.next;
            int value=node.val;
            node.val=node.next.val;
            node.next.val=value;
            node.next=previous.next;
        // }
        // node.next=null;
    }
}
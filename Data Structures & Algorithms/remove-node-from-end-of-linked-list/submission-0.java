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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp= head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(n==1 && length==1) return null;
        if(n==length) return head.next;
        ListNode temp1=head;
        
        length=length-n-1;
        while(temp1!=null && length>0){
            temp1=temp1.next;
            length--;
        }
        temp1.next=temp1.next.next;
        return head;
        

    }
}

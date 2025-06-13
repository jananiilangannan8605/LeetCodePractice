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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode copy=head;
        if(head==null||head.next==null) return head;
        int count=1;
        while(temp.next!=null){
           
            temp=temp.next;
             count++;
            
        }
        temp.next=head;
        k=k%count;
        
       for(int i=1;i<count-k;i++){
            copy=copy.next;
       }
        head=copy.next;
        copy.next=null;
        return head;
    }
}
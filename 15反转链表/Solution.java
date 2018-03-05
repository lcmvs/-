/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        /*
运行时间：18ms
占用内存：10632k
        */
        ListNode p=null;
        ListNode next=head;
        ListNode temp;
        while(next!=null){
            temp=next.next;
            next.next=p;
            p=next;
            next=temp;
        }
        return p;
    }
}
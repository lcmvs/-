/*
 public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
/*
运行时间：21ms
占用内存：8956k
*/
       ListNode helpHead=new ListNode(-1);
       helpHead.next=pHead;
       ListNode left=helpHead;
       ListNode right;
       while(left!=null){
           right=left.next;
           boolean b=false;
           while(right!=null&&right.next!=null&&right.val==right.next.val){
               right=right.next;
               b=true;
           }
           if(b){
               left.next=right.next;
           }else{
               left.next=right;
               left=left.next;
           }
       }
       return helpHead.next;
    }
}
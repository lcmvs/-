/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        /*
运行时间：21ms
占用内存：8964k
 
if(list1==null&&list2==null){
            return null;
        }
        ListNode head=new ListNode(-1);
        ListNode next=head;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                next.next=list1;
                next=next.next;
                list1=list1.next;
            }else{
                next.next=list2;
                next=next.next;
                list2=list2.next;
            }
        }
            if(list1==null){
                next.next=list2;
                list2=list2.next;
            }else if(list2==null){
                next.next=list1;
                list1=list1.next;
            }
        return head.next;
        */
         
        /*
递归
运行时间：27ms
占用内存：10476k
        */
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<=list2.val){
            list1.next=Merge(list1.next,list2);
            return list1;
        }else{
            list2.next=Merge(list1,list2.next);
            return list2;
        }
    }
}
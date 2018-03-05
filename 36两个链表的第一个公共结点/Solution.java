/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.Set;
import java.util.HashSet;
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            Set<ListNode> set=new HashSet<>();
            ListNode p1=pHead1;
            ListNode p2=pHead2;
            while(p1!=null){
                set.add(p1);
                p1=p1.next;
            }
            while(p2!=null){
                if(set.add(p2)==true){
                    p2=p2.next;
                }else{
                    return p2;
                }
            }
            return null;
    }
}
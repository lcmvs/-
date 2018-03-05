/*
 public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}
*/
//import java.util.HashSet;
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
/*
运行时间：21ms
占用内存：8956k
追击，slow跑环的长度，再跑总长度-环长度找到入口
时间O(n)
空间O(1)
*/
        if(pHead==null) return null;
        ListNode slow=pHead;
        ListNode fast=pHead.next;
        while(fast!=null){
            if(fast==slow){
                fast=pHead;
                slow=slow.next;
                while(fast!=slow){
                    fast=fast.next;
                    slow=slow.next;
                }
                return fast;
            }else{
                slow=slow.next;
                fast=fast.next;
                if(fast!=null){
                    fast=fast.next;
                }
            }
        }
        return null;
    }
}
 
/*
HashSet
运行时间：17ms
占用内存：12812k
 
        HashSet<ListNode> set=new HashSet<>();
        while(pHead!=null){
            if(set.contains(pHead)){
                return pHead;
            }else{
                set.add(pHead);
                pHead=pHead.next;
            }
        }
        return null;
*/
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        printHelper(list,listNode);
        return list;
    }
     
    private void printHelper(ArrayList<Integer> list,ListNode listNode){
        if(listNode!=null){
            printHelper(list,listNode.next);
            list.add(listNode.val);
        };
    }
}
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;
 
    RandomListNode(int label) {
        this.label = label;
    }
}
*/
//import java.util.HashMap;
public class Solution {
    //HashMap<RandomListNode,RandomListNode> map=new HashMap<>();
/*
旧链表中复制新链表
运行时间：31ms
占用内存：9164k
*/
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
            return null;
        RandomListNode pCur = pHead;
        //复制next 如原来是A->B->C 变成A->A'->B->B'->C->C'
        while(pCur!=null){
            RandomListNode node = new RandomListNode(pCur.label);
            node.next = pCur.next;
            pCur.next = node;
            pCur = node.next;
        }
        pCur = pHead;
        //复制random pCur是原来链表的结点 pCur.next是复制pCur的结点
        while(pCur!=null){
            if(pCur.random!=null)
                pCur.next.random = pCur.random.next;
            pCur = pCur.next.next;
        }
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        pCur = pHead;
        //拆分链表
        while(pCur!=null){
            pCur.next = pCur.next.next;
            if(cur.next!=null)
                cur.next = cur.next.next;
            cur = cur.next;
            pCur = pCur.next;
        }
        return head;       
    }
}
        /*
递归，使用HashMap记录 被复制者-复制者 关系
运行时间：20ms
占用内存：12936k
            if(pHead==null) return null;
            if(map.containsKey(pHead)){
                return map.get(pHead);
            }
            RandomListNode next=new RandomListNode(pHead.label);
            map.put(pHead,next);
            next.next=Clone(pHead.next);
            next.random=Clone(pHead.random);
            return next;
        */
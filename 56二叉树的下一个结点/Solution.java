/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
 
    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
/*
运行时间：29ms
占用内存：8804k
*/
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
            if(pNode==null) return null;
            //父节点
            if(pNode.right!=null){
                if(pNode.right.left==null){
                    return pNode.right;
                }else{
                    pNode=pNode.right.left;
                    while(pNode.left!=null){
                         pNode=pNode.left;
                    }
                    return pNode;
                }
            }
            //没有右子树的根节点
            if(pNode.next==null) return null;
            //左节点
            if(pNode==pNode.next.left){
                return pNode.next;
            }else{
                //右节点
                pNode=pNode.next;
                while(pNode.next!=null&&pNode==pNode.next.right){
                    pNode=pNode.next;
                }
                return pNode.next;
            }
    }
}
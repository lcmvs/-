import java.util.ArrayList;
import java.util.LinkedList;
 
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
 
}
*/
public class Solution {
/*
运行时间：24ms
占用内存：8836k
*/
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        depth(pRoot, 1, list);
        return list;
    }
     
     private void depth(TreeNode root, int depth, ArrayList<ArrayList<Integer>> list) {
        if(root == null) return;
        if(depth > list.size())
            list.add(new ArrayList<Integer>());
        list.get(depth -1).add(root.val);
          
        depth(root.left, depth + 1, list);
        depth(root.right, depth + 1, list);
    }
}
 
/*
运行时间：29ms
占用内存：9128k
二叉树的层次遍历，使用链表维护
 
        ArrayList<ArrayList<Integer> > list=new ArrayList<>();
        if(pRoot==null) return list;
        LinkedList<TreeNode> treeList=new LinkedList<>();
        ArrayList<Integer> temp=new ArrayList<>(1);
        temp.add(pRoot.val);
        list.add(temp);
        treeList.add(pRoot);
        int len=1;
        while(treeList.size()>0){
            int tempLen=0;
            temp=new ArrayList<>();
            while(len>0){
                TreeNode first=treeList.removeFirst();
                if(first.left!=null){
                    temp.add(first.left.val);
                    treeList.addLast(first.left);
                    tempLen++;
                }
                if(first.right!=null){
                    temp.add(first.right.val);
                    treeList.addLast(first.right);
                    tempLen++;
                }
                len--;
            }
            if(tempLen>0){
                len=tempLen;
                list.add(temp);
            }
        }
        return list;
*/
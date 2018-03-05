/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
 
}
*/
/*
运行时间：19ms
占用内存：8732k
*/
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null) return false;
        return compare(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    boolean compare(TreeNode root1,TreeNode root2){
        if(root2 == null) return true;
        if(root1 == null) return false;
        if(root1.val!=root2.val)  return false;
        return compare(root1.left,root2.left)&&compare(root1.right,root2.right);
    }
}
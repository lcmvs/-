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
先序遍历和对称先序遍历比较
运行时间：16ms
占用内存：10112k
*/
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) return true;
        return treeCompare(pRoot.left,pRoot.right);
    }
     
    boolean treeCompare(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null||left.val!=right.val) return false;
        return treeCompare(left.left,right.right)&&treeCompare(left.right,right.left);
    }
}
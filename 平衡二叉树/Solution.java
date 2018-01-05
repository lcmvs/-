public class Solution {
/*
运行时间：15ms
占用内存：11772k
*/
    boolean bj=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        depth(root);
        return bj;
    }
    
    int depth(TreeNode root){
        if(root==null) return 0;
        int left=depth(root.left);
        int right=depth(root.right);
        if(Math.abs(left-right)>1){
            bj=false;
        }
        return 1+Math.max(left,right);
    }
}
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
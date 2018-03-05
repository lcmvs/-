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
运行时间：32ms
占用内存：8888k
 
中序遍历二叉树，用长度为1的数组记录k值
*/
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        int[] i=new int[]{k};
        return helpNode(pRoot,i);
    }
 
    TreeNode helpNode(TreeNode root, int[] i){
        if(root==null) return null;
        TreeNode left=helpNode(root.left,i);
        if(left!=null){
            return left;
        }
        i[0]=i[0]-1;
        if(i[0]==0){
            return root;
        }
        TreeNode right=helpNode(root.right,i);
        if(right!=null){
            return right;
        }
        return null;
    }
 
}
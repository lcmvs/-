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
public class Solution {
       TreeNode first=null;
       TreeNode end=null;
       public TreeNode Convert(TreeNode pRootOfTree) {
           if(pRootOfTree==null) return null;
           Convert(pRootOfTree.left);
           if(end==null) {
               end=first=pRootOfTree;
           }else{
               end.right=pRootOfTree;
               pRootOfTree.left=end;
               end=pRootOfTree;
           }
           Convert(pRootOfTree.right);
           return first;
       }
}
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//import java.util.Arrays;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null||in==null) return null;
        TreeNode node=helper(pre,in,0,pre.length-1,0,in.length-1);
        return node;
    }
     
    private TreeNode helper(int [] pre,int [] in,int pleft,int pright,int ileft,int iright){
        TreeNode node=new TreeNode(pre[pleft]);
        int len=0;
        for(int i=ileft;i<iright;i++){
            if(in[i]==pre[pleft]){
                break;
            }
            len++;
        }
        if(len==0){
            node.left=null;
        }else{
            node.left=helper(pre,in,pleft+1,pleft+len,ileft,ileft+len-1);
        }
        if(pleft+len==pright){
            node.right=null;
        }else{
            node.right=helper(pre,in,pleft+len+1,pright,ileft+len+1,iright);
        }
        return node;
    }
}
/*
递归
运行时间：270ms
占用内存：22184k
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode node=new TreeNode(pre[0]);
            int i=0;
            for(;i<in.length;i++){
                if(in[i]==pre[0]) break;
            }
            if(i==0){
                node.left=null;
            }else{
                node.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
            }
            if(i+1==in.length){
                node.right=null;
            }else{
                node.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,in.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        return node;
    }
*/
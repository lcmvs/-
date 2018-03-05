import java.util.ArrayList;
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
    ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null) return list;
        ArrayList<Integer> temp=new ArrayList<>();
        path(temp,root,0,target);
        return list;
    }
    void path(ArrayList<Integer> temp,TreeNode root,int sum,int target){
        sum=sum+root.val;
        temp.add(root.val);
        if(root.left==null&&root.right==null&&sum==target){
            list.add(new ArrayList<Integer>(temp));
        }
        if(root.left!=null){
            path(temp,root.left,sum,target);
            temp.remove(temp.size()-1);
        }
        if(root.right!=null){
            path(temp,root.right,sum,target);
            temp.remove(temp.size()-1);
        }
    }
}
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
    
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        ArrayList<TreeNode> node=new ArrayList<>();
        list.add(root.val);
        node.add(root);
        int i=0;
        while(i<node.size()){
            if(node.get(i).left!=null){
                list.add(node.get(i).left.val);
                node.add(node.get(i).left);
            } 
            if(node.get(i).right!=null){
                list.add(node.get(i).right.val);
                node.add(node.get(i).right);
            } 
            i++;
        }
        return list;
    }
     
}
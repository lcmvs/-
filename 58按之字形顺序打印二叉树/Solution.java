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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
/*
运行时间：30ms
占用内存：8788k
利用LinkedList的栈结构
*/
           ArrayList<ArrayList<Integer>> list=new ArrayList<>();
           if(pRoot==null) return list;
           LinkedList<TreeNode> treeList=new LinkedList<>();         //存放一层节点
           LinkedList<TreeNode> treeHelp=new LinkedList<>(treeList); //作为一个temp，存放一层节点
           treeList.add(pRoot);
           int i=1;
           ArrayList<Integer> temp=new ArrayList<>(1);
           temp.add(pRoot.val);
           list.add(temp);
           int len=1;
           while(treeList.size()>0){
               temp=new ArrayList<>();
               int tempLen=0;
               i++;
               treeHelp.clear();
               treeHelp.addAll(treeList);
               treeList.clear();
               if(i%2==1){
                   while(len>0){
                       TreeNode first=treeHelp.removeFirst();
                       if(first.left!=null){
                           tempLen++;
                           temp.add(first.left.val);
                           treeList.addFirst(first.left);
                       }
                       if(first.right!=null){
                           tempLen++;
                           temp.add(first.right.val);
                           treeList.addFirst(first.right);
                       }
                       len--;
                   }
               }else{
                       while(len>0){
                       TreeNode first=treeHelp.removeFirst();
                       if(first.right!=null){
                           tempLen++;
                           temp.add(first.right.val);
                           treeList.addFirst(first.right);
                       }
                       if(first.left!=null){
                           tempLen++;
                           temp.add(first.left.val);
                           treeList.addFirst(first.left);
                       }
                       len--;
                   }
               }
               if(tempLen>0){
                  len=tempLen;
                  list.add(temp);
               }         
           }
           return list;
    }
  
}
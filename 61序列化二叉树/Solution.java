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
String Serialize(TreeNode root) {
       StringBuilder sb = new StringBuilder();
       SerializeHelp(root,sb);
       return sb.toString();
   }
   void SerializeHelp(TreeNode root,StringBuilder sb){
       if (root == null) {
           sb.append("#,");
       } else {
           sb.append(root.val+",");
           SerializeHelp(root.left,sb);
           SerializeHelp(root.right,sb);
       }
   }
    
    public int index = -1;
    TreeNode Deserialize(String str) {
       String[] s = str.split(",");
       index++;
       if(index>=str.length()){
           return null;
       }
       if(s[index].equals("#")){
           return null;
       }
       TreeNode root = new TreeNode(new Integer(s[index]));
       root.left = Deserialize(str);
       root.right = Deserialize(str);
       return root;
   }
}
/*
    String Serialize(TreeNode root) {
        if(root==null) return "#,";
        StringBuffer sb=new StringBuffer();
        serHelp(root,sb);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
  }
    void serHelp(TreeNode root,StringBuffer sb){
        if(root==null){
            sb.append("#,");
        }else{
            sb.append(root.val+",");
            serHelp(root.left,sb);
            serHelp(root.right,sb);
        }
    }
     
    TreeNode Deserialize(String str) {
        if(str==null||str=="#") return null;
        String[] strs=str.split(",");
        int[] i=new int[]{0};
        return desHelp(strs,i);
  }
    TreeNode desHelp(String[] strs,int[] i){
        if(i[0]>=strs.length||strs[i[0]].equals("#")){
            i[0]=i[0]+1;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(strs[i[0]]));
        i[0]=i[0]+1;
        root.left=desHelp(strs,i);
        i[0]=i[0]+1;
        root.right=desHelp(strs,i);
        return root;
    }
*/
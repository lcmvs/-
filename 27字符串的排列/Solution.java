import java.util.ArrayList;
import java.util.Collections;
public class Solution {
/*
String str=String.valueOf(ch);
if(!list.contains(str)) list.add(str);
运行时间：192ms
占用内存：11296k
  
优化少一次contains(str)判断;
运行时间：133ms
占用内存：11048k
  
递归，回溯
*/
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> list=new ArrayList<>();
       if(str.length()==0) return list;
       char[] ch=str.toCharArray();
        
       Helper(list,ch,0);
       Collections.sort(list);
       return list;
    }
      
    void Helper(ArrayList<String> list,char[] ch,int left){
        if(left==ch.length){
            list.add(String.valueOf(ch));
            return;
        }
        for(int i=left;i<ch.length;i++){
            if(ch[left]!=ch[i]||left==i){//不同字符或者第一次
                swap(left,i,ch);
                Helper(list,ch,left+1);
                swap(left,i,ch);
            }
         }
    }
      
    void swap(int left,int i,char[] ch){
        char temp=ch[left];
        ch[left]=ch[i];
        ch[i]=temp;
    }
}
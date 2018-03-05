//import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
/*
运行时间：9ms
占用内存：12696k
*/
         Stack<Integer> s=new Stack<>();
         for(int i=0,j=0;i<pushA.length;i++){
             s.push(pushA[i]);
             while(j<popA.length&&popA[j]==s.peek()){
                 s.pop();
                 j++;
             }
         }
         return s.empty();
    }
}
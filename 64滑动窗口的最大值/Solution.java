import java.util.ArrayList;
import java.util.LinkedList;
public class Solution {
/*
方法一
两个栈实现队列
最大值栈：max栈+main栈
双端队列
*/
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
/*
方法二
双端队列存数组下标
*/
        ArrayList<Integer> list=new ArrayList<>();
        if(num==null||size==0||num.length<size) return list;
        LinkedList<Integer> link=new LinkedList<>();
        //link.add(0);
        for(int i=0;i<num.length;i++){
            if(link.isEmpty()||num[i]>=num[link.getFirst()]){
                link.clear();
                link.addFirst(i);
            }else{
                while(num[i]>=num[link.getLast()]){
                    link.removeLast();
                }
                link.addLast(i);
            }
            if(link.getFirst()<=i-size){
                link.removeFirst();
            }
            if(i>=size-1){
                list.add(num[link.getFirst()]);
            }
        }
        return list;
    }
}
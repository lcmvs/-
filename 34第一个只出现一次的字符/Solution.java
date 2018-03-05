import java.util.HashMap;
import java.util.Map.Entry;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
/*
空间换时间，hashmap存 字母-位置，出现第二次位置置-1，然后找>0的最小值
运行时间：47ms
占用内存：8868k
*/
        if(str.length()==0) return -1;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),-1);
            }else{
                map.put(str.charAt(i),i);
            }
        }
        int min=str.length();
        for(Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>=0&&entry.getValue()<min) min=entry.getValue();
        }
        return min;
    }
}
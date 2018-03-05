import java.util.Map;
import java.util.HashMap;
public class Solution {
/*
运行时间：23ms
占用内存：9036k
 
也可以自己用数组映射hash
*/
    //Insert one char from stringstream
    HashMap<Character,Integer> map=new HashMap<>();
    int i=0;
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,-1);
        }else{
            i++;
            map.put(ch,i);
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int min=i;
        char result='#';
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=-1&&entry.getValue()<=min){
                result=entry.getKey();
                min=entry.getValue();
            }
        }
        return result;
    }
}
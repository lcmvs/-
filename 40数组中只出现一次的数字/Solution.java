//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.HashMap;
import java.util.Map;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
/*
时间O(n)，空间O(1)
异或方法^，同为0，不同1
>>带符号右移
>>>不带符号右移
运行时间：18ms
占用内存：8976k
*/
        int sum=0;
        for(int i:array){
            sum^=i;
        }
        int index=0;//按第一个不同二进制位分组
        while(sum%2!=1){
            index++;
            sum>>=1;
        }
        for(int i:array){
            if((i>>index)%2==1){
                num1[0]^=i;
            }else{
                num2[0]^=i;
            }
        }
     }
}
    

/*
Hash方法  时间O(n) 空间O(n)
运行时间：19ms
占用内存：8932k

HashMap<Integer,Boolean> map=new HashMap<>(array.length,1f);
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],false);
            }else{
                map.put(array[i],true);
            }
        }
        boolean bj=false;
        for(Map.Entry<Integer,Boolean> entry:map.entrySet()){
            if(entry.getValue()==true){
                if(bj==false){
                    num1[0]=entry.getKey();
                    bj=true;
                }else{
                    num2[0]=entry.getKey();
                }
            }
        }
*/
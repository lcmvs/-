//import java.util.Map;
//import java.util.HashMap;
//import java.util.Arrays;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
/*
利用数组特性，大于数组长度一半的必然留下
时间复杂度O(n)
运行时间：17ms
占用内存：8744k
*/
        int result=0;
        for(int i=0,j=0;i<array.length;i++){
            if(j==0){
                result=array[i];
                j++;
            }else if(result==array[i]){
                j++;
            }else{
                j--;
            }
        }
         
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==result){
                count++;
            }
        }
        if(count>array.length/2){
            return result;
        }else{
            return 0;
        }
    }
     
     
}
 
/*
部分快排找到中间值，然后计算中间值数量
运行时间：14ms
占用内存：8716k
public int MoreThanHalfNum_Solution(int [] array) {
        sort(array,0,array.length-1);
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==array[array.length/2]){
                count++;
            }
        }
        if(count>array.length/2){
            return array[array.length/2];
        }else{
            return 0;
        }
    }
        void sort(int[] array,int left,int right){
        if(left<=0||right>=array.length) return;
        int i=left;
        int j=right;
        while(left<right){
            while(left<right&&array[right]>=array[i]){
                right--;
            }
            array[left]=array[right];
            while(left<right&&array[left]<array[i]){
                left++;
            }
            array[right]=array[left];
        }
        if(left==(array.length+1)/2){
            return;
        }else if(left<(array.length+1)/2){
            sort(array,left+1,j);
        }else{
            sort(array,i,left-1);
        }
    }
 
 
 
使用哈希
运行时间：19ms
占用内存：8580k
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>array.length/2) return entry.getKey();
        }
        return 0;
 
因为数和字母比较少，所以可以直接这么来，其实也是hash
运行时间：14ms
占用内存：8788k
        int[] count=new int[]{0,0,0,0,0,0,0,0,0};
        for(int i=0;i<array.length;i++){
            count[array[i]-1]=++count[array[i]-1];
        }
        for(int i=0;i<9;i++){
            if(count[i]>array.length/2) return ++i;
        }
        return 0;
*/
         
/*
先排序，再计算
运行时间：15ms
占用内存：8540k
        Arrays.sort(array);
        int count=0;
          
        for(int i=0;i<array.length;i++){
            if(array[i]==array[array.length/2]){
                count++;
            }
        }
        if(count>array.length/2){
            return array[array.length/2];
        }else{
            return 0;
        }
*/
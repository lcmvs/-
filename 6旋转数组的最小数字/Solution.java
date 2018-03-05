import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
/*
二分查找
运行时间：337ms
占用内存：28040k
*/
        int len=array.length;
        if(len==0) return 0;
        int min=0;
        int max=len-1;
        while(max>min){
            int mid=(min+max)/2;
            if(array[min]<array[mid]) {
                min=mid;
            }else{
                if(array[mid]>array[mid+1]) return array[mid+1];
                max=mid;
            }
        }
        return 0;
    }
}
        /*
运行时间：356ms
占用内存：27088k
        */
        /*
        int len=array.length;
        if(len==0) return 0;
        for(int i=0;i<len-1;i++){
            if(array[i]>array[i+1]) return array[i+1];
        }
        return array[len-1];
        */
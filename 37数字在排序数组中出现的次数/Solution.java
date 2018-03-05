import java.util.Arrays;
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
/*
利用Arrays.binarySearch()的二分查找
运行时间：18ms
占用内存：8612k
*/
       int sum=0;
       int index=Arrays.binarySearch(array,k);
       if(index<0) return 0;
       sum++;
       for(int i=index-1;i>=0;i--){
           if(array[i]==k){
              sum++;
           }else{
              break;
           }
       }
       for(int i=index+1;i<array.length;i++){
           if(array[i]==k){
              sum++;
           }else{
              break;
           }
       }
       return sum;
    }
}
/*
自己写的二分查找
运行时间：14ms
占用内存：8584k

public int GetNumberOfK(int [] array , int k) {
       int sum=0;
       int left=0,right=array.length-1;
       while(left<=right){
           int mid=(left+right)/2;
           if(array[mid]==k){
               sum++;
               for(int i=mid-1,j=mid+1;i>=0||j<array.length;i--,j++){
                   if(i>=0){
                       if(array[i]==k){
                          sum++;
                       }else{
                          i=0;
                       }
                   }
                   if(j<array.length){
                       if(array[j]==k){
                          sum++;
                       }else{
                          j=array.length;
                       }
                   }
               }
               break;
           }else if(k>array[mid]){
               left=mid+1;
           }else{
               right=mid-1;
           }
             
       }
       return sum;
    }
*/
 
/*
顺序查找
运行时间：18ms
占用内存：8560k
 
       public int GetNumberOfK(int [] array , int k) {
       int sum=0;
       for(int i=0;i<array.length;i++){
           if(k<array[i]) break;
           if(k==array[i]) sum++;
       }
       return sum;
    }
*/
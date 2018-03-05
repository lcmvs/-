public class Solution {
    public void reOrderArray(int [] array) {
        /*
运行时间：14ms
占用内存：10272k
        int len=array.length;
        int [] temp=new int[len];
        int left=0;
        int right=len-1;
        for(int i=0;i<len;i++){
            if(array[i]%2==1){
                temp[left]=array[i];
                left++;
            }else{
                temp[right]=array[i];
                right--;
            }
        }
        left--;
        right++;
        while(left>=0){
            array[left]=temp[left];
            left--;
        }
        while(right<array.length){
            array[right]=temp[len-1];
            right++;
            len--;
        }
        */
/*
插入排序
运行时间：14ms
占用内存：8712k
*/
          int bj=0;    //标记位，前bj位已排序
          for(int i=0;i<array.length;i++){
              if(array[i]%2==1){
                  int temp=array[i];
                  //bj-i之间所有数往后移一位
                  for(int j=i;j>bj;j--){
                      array[j]=array[j-1];
                  }
                  array[bj++]=temp;
              }
          }
    }
}
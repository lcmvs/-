import java.util.Arrays;
public class Solution {
/*
运行时间：848ms
占用内存：53160k
用归并排序O(nlogn)
注意int越界，要用long
*/
    public int InversePairs(int [] array) {
        return sort(array,0,array.length);
    }
     
    int sort(int[] array,int left,int right){ 
        if((right-left)/2==0) return 0;
        int mid=(right+left)/2;
        long sum=sort(array,left,mid)+sort(array,mid,right);
        int[] temp1=Arrays.copyOfRange(array,left,mid);
        int[] temp2=Arrays.copyOfRange(array,mid,right);
        int k=right-1;
        int i=temp1.length-1,j=temp2.length-1;
        for(;k>=left;k--){
            if(i==-1){
                  array[k]=temp2[j];
                  j--;               
                  continue;
            }
            if(j==-1){
                  array[k]=temp1[i];
                  i--;
                  continue;
            }
            if(temp1[i]>temp2[j]){
                sum=sum+j+1;
                array[k]=temp1[i];
                i--;
            }else{
                array[k]=temp2[j];
                j--;
            }
        }
        return (int)(sum%1000000007);
    }
}
 
 
/*
直接排，O(n^2),时间复杂度过高
        int num=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]) num++;
            }
        }
        return num%1000000007;
*/
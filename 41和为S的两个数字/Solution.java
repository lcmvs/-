import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
/*
递增数列，两个指针，从前后迫近
时间复杂度O(n)
运行时间：16ms
占用内存：8584k
*/
        ArrayList<Integer> list=new ArrayList<>(2);
        int min=0;
        int max=array.length-1;
        while(min<max){
            if((array[min]+array[max])==sum){
                list.add(array[min]);
                list.add(array[max]);
                return list;
            }else if((array[min]+array[max])>sum){
                max--;
            }else{
                min++;
            }
        }
        return list;
    }
}

/*
运行时间：17ms
占用内存：8752k

          public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list=new ArrayList<>(2);
        for(int i=0;i<array.length;i++){
            int target=sum-array[i];
            if(binarySearsh(array,target)){
                list.add(array[i]);
                list.add(target);
				return list;
            }
        }
        return list;
    }
    
    boolean binarySearsh(int[] array,int target){
        int min=0;
        int max=array.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(array[mid]==target){
                return true;
            }else if(array[mid]<target){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return false;
    }
*/
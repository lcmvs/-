import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
 
        ArrayList<Integer> list=new ArrayList<>();
        if(input.length<k||k<=0) return list;
        //初建堆
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        for(int i=k/2-1;i>=0;i--){
            adjustHeap(list,i,k-1);
        }
        for(int i=k;i<input.length;i++){
            if(input[i]<list.get(0)) list.set(0,input[i]);
            adjustHeap(list,0,list.size()-1);
        }
        return list;
    }
    //调整堆
    void adjustHeap(ArrayList<Integer> list,int s,int m){
        int temp=list.get(s);
        for(int j=2*s;j<=m;j*=2){
            if(j<m&&list.get(j+1)>list.get(j)) j++;
            if(list.get(s)>=list.get(j)) break;
            list.set(s,list.get(j));
            s=j;
        }
        list.set(s,temp);
    }
 
}
/*
PriorityQueue优先队列基于堆排序
堆排序
O(nlog(k))
运行时间：29ms
占用内存：8828k
 
        ArrayList<Integer> list=new ArrayList<>();
        if(input.length<k||k<=0) return list;
        PriorityQueue<Integer> queue=new PriorityQueue<>(k,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        //初建堆
        for(int i=0;i<k;i++){
            queue.offer(input[i]);
        }
        //调整堆
        for(int i=k;i<input.length;i++){
            if(input[i]<queue.peek()){
                queue.poll();
                queue.offer(input[i]);
            }
        }
        list.addAll(queue);
        return list;
*/
 
/*
HashMap
空间换时间，时间复杂度最低
*/
 
/*
快排思想，会改变数组的序列
O(n)
运行时间：26ms
占用内存：9036k
        ArrayList<Integer> list=new ArrayList<>();
        if(input.length<k||k<=0) return list;
        sort(input,0,input.length-1,k);
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
 
        int partition(int[] array,int left,int right){
        int mid=array[left];
        while(left<right){
            while(left<right&&array[right]>=mid) right--;
            array[left]=array[right];
            while(left<right&&array[left]<=mid) left++;
            array[right]=array[left];
        }
        array[left]=mid;
        return left;
    }
    void sort(int[] array,int left,int right,int k){
        int mid=partition(array,left,right);
        if(mid==k-1) return;
        if(mid<k-1){
            sort(array,mid+1,right,k);
        }else{
            sort(array,left,mid-1,k);
        }
    }
*/
//import java.util.Map;
//import java.util.HashMap;
 
import java.util.Comparator;
import java.util.PriorityQueue;
/*
大根堆+小根堆
O(logn)
O(1)
*/
public class Solution {
    int count;
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            //PriorityQueue默认是小顶堆，实现大顶堆，需要反转默认排序器
            return o2.compareTo(o1);
        }
    });
 
    public void Insert(Integer num) {
        count++;
        if ((count & 1) == 0) { // 判断偶数的高效写法
            if (!maxHeap.isEmpty() && num < maxHeap.peek()) {
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        } else {
            if (!minHeap.isEmpty() && num > minHeap.peek()) {
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }
    }
 
    public Double GetMedian() {
        if (count == 0)
            throw new RuntimeException("no available number!");
        double result;
        //总数为奇数时，大顶堆堆顶就是中位数
        if ((count & 1) == 1)
            result = maxHeap.peek();
        else
            result = (minHeap.peek() + maxHeap.peek()) / 2.0;
        return result;
    }
}
/*
hashmap
O(1)
O(n)
运行时间：23ms
占用内存：9116k
 
    HashMap<Integer,Integer> map=new HashMap<>();
    int count=0;
    public void Insert(Integer num) {
    if(map.containsKey(num)){
        map.put(num,map.get(num)+1);
    }else{
        map.put(num,1);
    }
        count++;
    }
 
    public Double GetMedian() {
        double result=0.0;
        int len=count;
        if(len%2==1){
            len=(len+1)/2;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                len=len-entry.getValue();
                if(len<=0){
                    result=entry.getKey().intValue();
                    break;
                }
            }
        }else{
            len=len/2;
            boolean bj=false;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                len=len-entry.getValue();
                if(bj){
                    result=(result+entry.getKey().intValue())/2;
                    break;
                }
                if(len<0){
                    result=entry.getKey().intValue();
                    break;
                }
                if(len==0){
                    result=entry.getKey().intValue();
                    bj=true;
                }
            }
        }
        return result;
    }
*/
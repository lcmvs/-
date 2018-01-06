import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
/*
小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

运行时间：20ms
占用内存：13772k
*/
        int min=1;
        int max=2;
        ArrayList<ArrayList<Integer>> allList=new ArrayList<>();
        while(min<sum){
			int result=(min+max)*(max-min+1);
            if(result!=2*sum){
              if(result<2*sum){
                 max++;
              }else{
                 min++;
              }
            }else{
			  ArrayList<Integer> list=new ArrayList<>(max-min+1);
              for(int i=min;i<=max;i++){
                 list.add(i);
              }
                 min++;
                 max++;
              allList.add(list);
			}  
        }
        return allList;
    }
}
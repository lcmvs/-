import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
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
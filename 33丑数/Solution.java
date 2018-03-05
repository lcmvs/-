public class Solution {
/*
丑数：质因子只能为2，3，5
*/   
    public int GetUglyNumber_Solution(int index) {
        if(index==0) return 0;
        int[] array=new int[index];
        array[0]=1;
        int i2=0;
        int i3=0;
        int i5=0;
        int min=0;
        for(int i=0;array[index-1]==0;){
            int m2=array[i2]*2;
            int m3=array[i3]*3;
            int m5=array[i5]*5;
            min=m2<m3?m2:m3;
            min=min<m5?min:m5;
            if(min==m2){
                if(m2>array[i]){
                   array[i+1]=array[i2++]*2;
                   i++;
                }else{
                   i2++;
                }
            }else if(min==m3){
                if(m3>array[i]){
                   array[i+1]=array[i3++]*3;
                   i++;
                }else{
                   i3++;
                }
            }else{
                if(m5>array[i]){
                   array[i+1]=array[i5++]*5;
                   i++;
                }else{
                   i5++;
                }
            }
        }
        return array[index-1];
    }
}
 
/*
超时，如果时判断某个数是否丑数，这个方法合适
public int GetUglyNumber_Solution(int index) {
        int i=1;
        for(int j=0;j<index;i++){
            int temp=i;
            while(temp%2==0){
                temp=temp/2;
            }
            while(temp%3==0){
                temp=temp/3;
            }
            while(temp%5==0){
                temp=temp/5;
            }
            if(temp==1) j++;
        }
        return --i;
    }
*/
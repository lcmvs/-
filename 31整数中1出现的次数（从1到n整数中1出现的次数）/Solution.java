public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
/*
迭代
运行时间：13ms
占用内存：8556k
*/
           if(n<=0) return 0;
           int len;
           int sum=0;
           while(n!=0){
               len=getLen(n);
               if(len==1){
                   sum=sum+1;
                   break;
               }else{
                   int temp=(int)Math.pow(10,len-1);
                   int first=n/temp;  //首位
                   int firstNum=first==1?n%temp+1:temp;
                   int otherNum=first*(len-1)*(temp/10);
                   sum=sum+firstNum+otherNum;
                   n=n%temp;
               }
           }
           return sum;
    }
    /*
    n的十进制位数
    */
    int getLen(int n){
        int i=0;
        while(n!=0){
            n=n/10;
            i++;
        }
        return i;
    }
}
/*
递归
运行时间：12ms
占用内存：11940k
 
           if(n<=0) return 0;
           int len=getLen(n);
           if(len==1) return 1;
           int temp=(int)Math.pow(10,len-1);
           int first=n/temp;  //首位
           int firstNum=first==1?n%temp+1:temp;
           int otherNum=first*(len-1)*(temp/10);
           return firstNum+otherNum+NumberOf1Between1AndN_Solution(n%temp);
*/
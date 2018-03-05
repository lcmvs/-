public class Solution {
    public int Fibonacci(int n) {
/*
迭代
运行时间：13ms
占用内存：8636k
*/
        if(n<=0) return 0;
        int f1=1;
        int f2=1;
         for(int i=3;i<=n;i++){
             f2=f1+f2;
             f1=f2-f1;
         }
        return f2;
    }
}
        /*
        递归栈爆炸,大量重复计算
        if(n==1||n==2) return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
        */
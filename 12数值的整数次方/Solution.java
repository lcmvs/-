public class Solution {
    public double Power(double base, int exponent) {
/*
运行时间：57ms
占用内存：9544k
使用递归，时间复杂度log(n)
*/
         if(base==0) return 0;
         if(exponent==0) return 1;
         if(exponent==1) return base;
         if(exponent==-1) return 1/base;
         int t=exponent;
         if(exponent%2==1||-exponent%2==1){
             return base*Power(base*base,(exponent-1)/2);
         }
         return Power(base*base,(exponent-1)/2);
  }
}
        /*
运行时间：55ms
占用内存：9776k
return Math.pow(base,exponent);
        */
 
        /*
运行时间：52ms
占用内存：9660k
时间复杂度：log(n)
    public double Power(double base, int exponent) {
         if(base==0) return 0;
         if(exponent==0) return 1;
         int t=exponent;
         double result=1.0;
         if(exponent<0){
             t=-t;
         }
         if(t%2==1){
             t--;
         }
         t=t/2;
         while(t>0){
             result=result*base;
             t--;
         }
         result*=result;
         if(exponent%2==1||-exponent%2==1) result=result*base;
         if(exponent<0) result=1/result;
         return result;
        */
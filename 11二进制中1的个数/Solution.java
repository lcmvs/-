public class Solution {
    public int NumberOf1(int n) {
/*
1.String str=Integer.toBinaryString(n);
2.Integer.bitCount(n);
3.与运算
运行时间：12ms
占用内存：8656k
*/          
/*
                int sum=0;
                while(n!=0){
                    ++sum;
                    n=n&(n-1);
                }
                return sum;
*/
/*
‘>>’和‘>>>’:https://zhidao.baidu.com/question/14164447.html
运行时间：14ms
占用内存：8792k
*/
        int sum=0;
        while(n!=0){
            sum=sum+(n&1);
            n=n>>>1;
        }
        return sum;
    }
}
        /*
先转成二进制字符串，再计算
运行时间：15ms
占用内存：8552k
            String str=Integer.toBinaryString(n);
            int sum=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1') sum++;
            }
            return sum;
        */
            /*
运行时间：15ms
占用内存：8804k
return Integer.toBinaryString(n).replaceAll("0","").length();
            */
        /*
运行时间：13ms
占用内存：8720k
return Integer.bitCount(n);
        */
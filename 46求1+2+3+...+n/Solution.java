public class Solution {
    public int Sum_Solution(int n) {
/*
逻辑与短路特性
运行时间：17ms
占用内存：8696k
*/
        int sum=n;
        boolean b=(n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }
}
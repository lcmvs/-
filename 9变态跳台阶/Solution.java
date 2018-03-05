public class Solution {
    public int JumpFloorII(int target) {
        /*
运行时间：17ms
占用内存：8732k
return (int)Math.pow(2,target-1);
        */
/*
运行时间：15ms
占用内存：8612k
*/    
        return 1<<--target;
    }
}
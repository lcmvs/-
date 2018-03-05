public class Solution {
    public int RectCover(int target) {
        /*
运行时间：14ms
占用内存：8660k
        */
           if(target<=0) return 0;
           if(target==1) return 1;
           if(target==2) return 2;
           int rc1=1;
           int rc2=2;
           for(int i=3;i<=target;i++){
               rc2=rc1+rc2;
               rc1=rc2-rc1;
           }
        return rc2;
    }
}
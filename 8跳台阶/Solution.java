public class Solution {
    public int JumpFloor(int target) {
           if(target==1){
               return 1;
           }else if(target==2){
               return 2;
           }else{
               int jf1=1;
               int jf2=2;
               for(int i=3;i<=target;i++){
                   jf2=jf1+jf2;
                   jf1=jf2-jf1;
               }
               return jf2;
           }
    }
}

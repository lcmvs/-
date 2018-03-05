import java.util.Arrays;
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
/*
运行时间：9ms
占用内存：15752k
*/
        if(sequence.length==0) return false;
        int root=sequence[sequence.length-1];
        int i=0;
        for(;i<sequence.length-1;i++){
            if(root<sequence[i]) break;
        }
        for(int j=i+1;j<sequence.length;j++){
            if(root>sequence[j]) return false;
        }
        boolean left=true;
        boolean right=true;
        if(i>1) left=VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        if(sequence.length-1-i>1) right=VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,sequence.length-1));
        return left&&right;
    }
}
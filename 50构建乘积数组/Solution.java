import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
/*
分两半进行类乘
*/
        if(A==null||A.length<2) return null;
        int[] B=new int[A.length];
        int temp=1;
        for(int i=0;i<A.length;i++){
            B[i]=temp;
            temp=temp*A[i];
        }
        temp=1;
        for(int i=A.length-1;i>=0;i--){
            B[i]=temp*B[i];
            temp=A[i]*temp;
        }
        return B;
    }
}
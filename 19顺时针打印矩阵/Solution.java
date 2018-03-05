import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        /*
运行时间：24ms
占用内存：8680k
        */
        if(matrix==null) return null;
        int y = matrix.length,x = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<Integer> (x*y);
        int circle=((x<y?x:y)+1)/2;
        for(int i=0;i<circle;i++){
            for(int j=i;j<x-i;j++)  list.add(matrix[i][j]);
            for(int k=i+1;k<y-i;k++) list.add(matrix[k][x-i-1]);
            for(int j=x-i-2;j>=i&&y-1-i>i;j--) list.add(matrix[y-i-1][j]);
            for(int k=y-i-2;k>i&&x-i-1>i;k--) list.add(matrix[k][i]);
        }
        return list;
    }
}
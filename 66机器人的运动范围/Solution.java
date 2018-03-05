public class Solution {
/*
回溯法
*/
    public int movingCount(int threshold, int rows, int cols)
    {
        if(rows<=0||cols<=0||threshold<0) return 0;
        boolean[][] b=new boolean[rows][cols];
        return help(0,0,threshold,b);
    }
    
    int help(int i,int j,int threshold,boolean[][] b){
        if(i>=0&&i<b.length&&j>=0&&j<b[i].length&&!b[i][j]&&add(i,j)<=threshold){
            b[i][j]=true;
        return 1+help(i-1,j,threshold,b)
                +help(i+1,j,threshold,b)
                +help(i,j-1,threshold,b)
                +help(i,j+1,threshold,b);
        }else{
            return 0;
        }
    }
    
    int add(int i,int j){
        int result=0;
        while(i!=0){
            result=result+i%10;
            i=i/10;
        }
        while(j!=0){
            result=result+j%10;
            j=j/10;
        }
        return result;
    }
}
public class Solution {
    public boolean Find(int target, int [][] array) {
           int i=array.length-1;
           int j=0;
           while(i>=0&&j<array[0].length){ 
                     if(target==array[i][j]) return true;
                     if(target>array[i][j]) {
                         j++;
                     }else if(target<array[i][j]) i--;
           }
        return false;
    }
}
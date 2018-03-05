public class Solution {
/*
运行时间：23ms
占用内存：8804k
*/
    public String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        reverse(chars,0,chars.length - 1);
        int blank = -1;
        for(int i = 0;i < chars.length;i++){
            if(chars[i] == ' '){ 
                int nextBlank = i;
                reverse(chars,blank + 1,nextBlank - 1);
                blank = nextBlank;
            }
        }
        reverse(chars,blank + 1,chars.length - 1);//最后一个单词单独进行反转
        return new String(chars);
         
    }
    public void reverse(char[] chars,int low,int high){
        while(low < high){
            char temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }
}
/*
运行时间：17ms
占用内存：8960k

    public String ReverseSentence(String str) {
        StringBuffer sb=new StringBuffer();
        int right=str.length();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                sb.append(str.substring(i+1,right)+" ");
                right=i;
            }
        }
        sb.append(str.substring(0,right));
        return sb.toString();
    }
*/
public class Solution {
public String LeftRotateString(String str,int n) {
/*
运行时间：23ms
占用内存：9100k
*/
        if(str==null||str.length()<=1) return str;
        StringBuilder sb = new StringBuilder(str);
        sb.append(sb.substring(0, n));
        return sb.substring(n, sb.length());
    }
}
/*
运行时间：22ms
占用内存：8648k

public String LeftRotateString(String str,int n) {
        char[] chars = str.toCharArray();        
        if(chars.length < n) return "";
        reverse(chars, 0, n-1);
        reverse(chars, n, chars.length-1);
        reverse(chars, 0, chars.length-1);
        StringBuilder sb = new StringBuilder(chars.length);
        for(char c:chars){
            sb.append(c);
        }
        return sb.toString();
    }
     
    public void reverse(char[] chars,int low,int high){
        char temp;
        while(low<high){
            temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }
*/
/*
运行时间：17ms
占用内存：13420k
String substring(int start);
String substring(int start,int end);

        if(str==null||str.length()<=1) return str;
        return str.substring(n)+str.substring(0,n);
*/
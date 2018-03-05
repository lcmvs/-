public class Solution {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ","%20");
        /*
运行时间：23ms
占用内存：8988k
        */
/*
运行时间：22ms
占用内存：8736k
 
        int len=str.length()-1;
        int addLen=0;
        for(int i=0;i<=len;i++){
            if(str.charAt(i)==' ') addLen++;
        }
        int newLen=len+2*addLen;
        str.setLength(newLen+1);
        while(len>=0){
            if(str.charAt(len)==' '){
                str.setCharAt(newLen--,'0');
                str.setCharAt(newLen--,'2');
                str.setCharAt(newLen--,'%');
            }else{
                str.setCharAt(newLen--,str.charAt(len));
            }
            len--;
        }
        return str.toString();
*/
    }
}
 
        /*
        运行时间：18ms
        占用内存：8852k
        String sti = str.toString();
        char[] strChar = sti.toCharArray();
        StringBuffer stb = new StringBuffer();
        for(int i=0;i<strChar.length;i++){
            if(strChar[i]==' '){
                stb.append("%20");
            }else{
                stb.append(strChar[i]);
            }
        }
        return stb.toString();
        */
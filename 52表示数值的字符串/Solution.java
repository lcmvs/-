public class Solution {
/*
编译原理中自动机
运行时间：16ms
占用内存：8768k
*/
    public boolean isNumeric(char[] str) {
        if(str==null) return false;
        int i=0;
        if(str[0]=='+'||str[0]=='-'){
            i=1;
        }
        boolean left=false;
        for(;i<str.length;i++){
            if(str[i]=='.'){
                if(left==true){
                    return false;
                }else{
                    left=true;
                    continue;
                }
            }
            if(str[i]<48||str[i]>57){
                if(str[i]=='E'||str[i]=='e'){
                    if(i==str.length-1) return false;
                    i++;
                    for(;i<str.length;i++){
                        if(str[i]=='+'||str[i]=='-'){
                            if(i==str.length-1) return false;
                            continue;
                        }
                        if(str[i]<48||str[i]>57){
                            return false;
                        }
                    }
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
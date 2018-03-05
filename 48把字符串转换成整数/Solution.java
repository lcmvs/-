public class Solution {
    public int StrToInt(String str) {
        if(!str.matches("[+-1-9]\\d*")) return 0;
        boolean plus=true;
        int result=0;
        if(str.charAt(0)=='-'){
            plus=false;
        }else if(str.charAt(0)!='+'){
            result=(int)((str.charAt(0)-48)*Math.pow(10.0,str.length()-1));
        }
        for(int i=1;i<str.length();i++){
            result=result+(int)((str.charAt(i)-48)*Math.pow(10.0,str.length()-i-1));
        }
        if(plus){
            return result;
        }else{
            return -1*result;
        }
    }
}

/*
运行时间：16ms
占用内存：8788k

        if(!str.matches("[+-1-9]\\d*")) return 0;
        boolean plus=true;
        int result=0;
        if(str.charAt(0)=='-'){
            plus=false;
        }else if(str.charAt(0)!='+'){
            result=(int)((str.charAt(0)-48)*Math.pow(10.0,str.length()-1));
        }
        for(int i=1;i<str.length();i++){
            result=result+(int)((str.charAt(i)-48)*Math.pow(10.0,str.length()-i-1));
        }
        if(plus){
            return result;
        }else{
            return -1*result;
        }
*/

/*
运行时间：16ms
占用内存：8688k

        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int fuhao = 0;
        if (a[0] == '-')
            fuhao = 1;
        int sum = 0;
        for (int i = fuhao; i < a.length; i++)
        {
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return fuhao == 0 ? sum : sum * -1;
*/
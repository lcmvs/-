//import java.util.TreeSet;
import java.util.Comparator;
import java.util.Arrays;
public class Solution {
/*
运行时间：23ms
占用内存：9000k
*/
    public String PrintMinNumber(int [] numbers) {
          Integer[] array=new Integer[numbers.length];
          for(int i=0;i<numbers.length;i++){
              array[i]=numbers[i];
          }
          Arrays.sort(array,new Comparator<Integer>(){
              @Override
              public int compare(Integer o1,Integer o2){
                  String str1=o1+""+o2;
                  String str2=o2+""+o1;
                  if(str1.equals(str2)) return 1;
                  return str1.compareTo(str2);
              }
          });
          String result="";
          for(Integer i:array){
              result=result+i;
          }
          return result;
    }
}
/*
运行时间：23ms
占用内存：9032k
int可能长度不够,
字符串CompareTo()字典排序
              TreeSet<String> set=new TreeSet<>(new Comparator<String>(){
              @Override
              public int compare(String o1,String o2){
                  String str1=o1+o2;
                  String str2=o2+o1;
                  if(str1.equals(str2)) return 1;
                  return str1.compareTo(str2);
              }
          });
          for(int i=0;i<numbers.length;i++){
              set.add(numbers[i]+"");
          }
          String result="";
          for(String str:set){
              result=result+str;
          }
          return result;
*/
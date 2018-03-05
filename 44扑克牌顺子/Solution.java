import java.util.Arrays;
public class Solution {
    public boolean isContinuous(int [] numbers) {
/*
1. 除0外没有重复的数
2. max - min < 5 
运行时间：14ms
占用内存：8544k
*/
          if(numbers.length<5) return false;
          int king=0;
          int min=14;
          int max=0;
          int repeat=0;
          for(int i=0;i<numbers.length;i++){
              if(numbers[i]==0){
                  king++;
              }else {
                  if(repeat==numbers[i]){
                      return false;
                  }else{
                      repeat=numbers[i];
                  }
                  if(numbers[i]<min) min=numbers[i];
                  if(numbers[i]>max) max=numbers[i];
              }
          }
          if((max-min)<5){
              return true;
          }else{
              return false;
          }
    }
}

/*
运行时间：20ms
占用内存：8740k

public boolean isContinuous(int [] numbers) {
          if(numbers.length<5) return false;
          Arrays.sort(numbers);
          int king=0;
          int repeat=0;
          for(int i=0;i<numbers.length;i++){
              if(numbers[i]==0){
                  king++;
              }else if(repeat==numbers[i]){
                  return false;
              }else{
                  repeat=numbers[i];
              }
          }
          if(numbers[4]-numbers[king]+1<=5){
              return true;
          }else{
              return false;
          }
    }
*/
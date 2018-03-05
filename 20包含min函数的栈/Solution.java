import java.util.Stack;
 
public class Solution {
/*
运行时间：14ms
占用内存：8724k
*/
    Stack<Integer> main=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public void push(int node) {
        if(min.empty()||node<min.peek()){
            min.push(node);
        }
        main.push(node);
    }
     
    public void pop() {
        if(min.peek()==main.peek()){
            min.pop();
        }
        main.pop();
    }
     
    public int top() {
        return main.peek();
    }
     
    public int min() {
        return min.peek();
    }
}
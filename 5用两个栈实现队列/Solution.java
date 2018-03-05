import java.util.Deque;
import java.util.LinkedList;
/*
双端队列，即可用作队列，也可用作栈
优先使用deque接口，而不是Stack类
*/
public class Solution {
    Deque<Integer> stack1 = new LinkedList<>();
    Deque<Integer> stack2 = new LinkedList<>();
    public void push(int node) {
        stack1.addFirst(node);
    }
     
    public int pop() {
        if(stack2.isEmpty()){
           while(!stack1.isEmpty()){
              stack2.addFirst(stack1.removeFirst());
           }
        }
        return stack2.removeFirst();
    }
}
/*
运行时间：14ms
占用内存：8644k
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
            stack1.push(node);
    }
     
    public int pop() {
            if(stack2.empty()){
                while(!stack1.empty()){
                stack2.push(stack1.pop());
              }
            }
            return stack2.pop();
    }
}
*/
package sharpener.stack;
import java.util.*;
public class operations {
    public static void main(String[] args) {
        // ! This one is an inbuilt dynamic way to create and push pop in a stack.
        // Stack<String> stack = new Stack<String>();
        // stack.push("apple");
        // stack.push("banana");
        // stack.set(0,"mango");
        // System.out.println(stack);
        Stacks stack = new Stacks(5);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(10);

        for(int i = stack.top;i>=0;i--){
            System.out.println(stack.stackArray[i]);
        }
       

    }}
    class Stacks{
        int maxSize;
        int stackArray[];
        int top;
        Stacks(int size){
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1;

        }
        public void push(int value){
            if(!isFull()){
                top = top + 1;
               stackArray[top] = value;
            }else{
               System.out.println("stack is full, it can't push"+value); 
            }
        }
        public void pop(){
            if(!isEmpty()){
               top--;
                
            }else{
               System.out.println("stack is full, it can't be pushed"); 
            }
        }
        public int peak(){
            if(!isEmpty()){
                return stackArray[top];
            }else{
                return -1;
            }
        }
        public boolean isFull(){
           return top == maxSize -1;
        }
        public boolean isEmpty(){
          return top == -1;
        }
    }


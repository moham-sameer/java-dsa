package sharpener.stack;

import java.util.Arrays;

public class Container {
   public static void main(String[] args) {
    Containing st = new Containing(5);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.pop();
    for(int i = st.top;i>=0;i--){
        System.out.println(st.arr[i]);
    }
   } 
}
   class Containing{
    int value;
    int arr[];
    int size;
    int top;
    int maxSize;
    Containing(int size){
        int maxSize = size;
        this.arr = new int[maxSize];
        this.top = -1;
    }
    public void push(int value){
        top++;
        arr[top] = value;
        size++;
    }
    public int pop(){
        int value = arr[top];
        top--;
        size--;
        return value;
    }
   }


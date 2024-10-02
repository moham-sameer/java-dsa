package sharpener.Queue;
import java.util.*;
public class Nodes {
    public static void main(String[] args) {
        kulai queue = new kulai();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.rem();
        queue.rem();
        queue.rem();
       System.out.println(queue.queue);
    }
}
 class kulai{
    ArrayDeque<Integer> queue;
    kulai(){
     queue = new ArrayDeque<>();
    }
   
    public void add(int value){
       queue.offer(value);
    }
    public void rem(){
       queue.poll();
       

    }
    
}

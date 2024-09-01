package sharpener.Queue;
import java.util.ArrayList;
public class Demo{
    public static void main(String[] args) {
           Queues obj = new Queues();
           obj.enqueue(3);
           obj.enqueue(4);
           obj.enqueue(5);
           obj.enqueue(6);
           System.out.println(obj.q);
           obj.dequeue();
           obj.dequeue();
           
           System.out.println(obj.q);
           obj.getFirst();


    }

    
}

class Queues{
   
    ArrayList<Integer> q;
    Queues(){
    
    q = new ArrayList<>();
    
    }
    public void enqueue(int val){
        q.add(val);
    
    }
    public void dequeue(){
        if(q.isEmpty()){
            System.out.println("the queue is empty");
        }
        q.remove(0);
    }
    public void is_empty(){
        if(q.isEmpty()){
            System.out.println("the queue is empty");
        }
    }
    public void getFirst(){
        System.out.println(q.get(0));
    }
}

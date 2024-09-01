package sharpener.Queue;
/**
 * practice
 */
import java.util.ArrayList;
public class practice {

    public static void main(String[] args) {
       ArrayList<Integer> queue = new ArrayList<Integer>();
       queue.add(1); 
       queue.add(2); 
       queue.add(3); 
       queue.remove(queue.size());
       System.out.println(queue);
    }

}        
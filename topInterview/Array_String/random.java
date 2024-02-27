package topInterview.Array_String;
import java.util.*;
public class random{
   private ArrayList<Integer> items;
   private HashMap<Integer, Integer> map;
   private Random rand;

   public random(){
    items = new ArrayList<>();
    map = new HashMap<>();
    rand = new Random();
   }
    
    public boolean insert (int val){
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,items.size());
        items.add(val);
        return true;
    }
    public boolean remove(int val){
        if(!map.containsKey(val)){
            return false;
        } 
        int indexToRemove = map.get(val);
        int lastElement = items.get(items.size() - 1);
        items.set(indexToRemove,lastElement);
        map.put(lastElement,indexToRemove);
        items.remove(items.size() - 1);
        map.remove(val);
        return true;
    }
    public int getRandom(){
        int randomIndex = rand.nextInt(items.size());
        return items.get(randomIndex);
    }
    public static void main(String[] args) {
     random files = new random();
     System.out.println(files.insert(1));
     System.out.println(files.remove(2));
     System.out.println(files.insert(2));
     System.out.println(files.getRandom());
     System.out.println(files.remove(1));
     System.out.println(files.insert(2));
     System.out.println(files.getRandom());


        
        
    
    }
    
}
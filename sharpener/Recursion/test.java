package sharpener.Recursion;

public class test {
   public static void main(String[] args) {
    System.out.println(count(1));
   } 
   public static int count(int i) //count function

   {
 
     if(i>5)
 
     {
 
  //Print the elements inside the stack from top to bottom 
 
       return 0;
 
     }
 
     else 
 
     {
 
       return count(i+1);
 
     }
 
   }
 
 }


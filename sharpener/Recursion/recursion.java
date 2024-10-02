package sharpener.Recursion;
public class recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculateSum(0,n,0));
    }

        public static int calculateSum(int i, int n, int sum){
        
        if (i >= 10 || i == n)
        
         { 
        
        return sum;
        
         }
        
         // Add current i to sum and recurse with i + 2
        
        
        
        return calculateSum(i + 2, n, sum + i); }
        
        }
        
        
    



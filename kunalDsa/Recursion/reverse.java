package kunalDsa.Recursion;
public class reverse {
   public static void main(String[] args) {
   //  fac(3456);
    System.out.println(revers(1245));
   } 
   public static int rev(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
   }
   private static int helper(int n,int digits){
      if(n%10 == n){
         return n;
      }
      int rem = n%10;
      return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
   }
   // ! this is basic method of recursion.
   public static int sum = 0;
   public static int revers(int n){
           if(n == 0){
            return 0;
           }
         int rem = n % 10;
         sum = sum * 10 + rem;
           revers(n/10);
          return sum;
   }
}

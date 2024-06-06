package kunalDsa.Recursion;

class practice{
  public static void main(String[] args) {
    System.out.println(reverse(3456));
  }
  public static int reverse(int n){
     int digits = (int)(Math.log10(n))+1;
     return helper(n, digits);
      
  }
  private static int helper(int n , int digits){
       if(n==0){
        return 0;
       }
       int rem = n%10;
       return rem*(int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
  }
}
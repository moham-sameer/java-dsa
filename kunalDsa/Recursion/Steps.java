package kunalDsa.Recursion;

public class Steps {
    public static void main(String[] args) {
        // ! we have to count the steps required for a number to reduced to zero.
       System.out.println(step(15));
    }
    public static int step(int n){
        return helper(n,0);
    }
    private static int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2 == 0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);

    }
}

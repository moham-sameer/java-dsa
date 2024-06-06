package kunalDsa.Recursion;

public class add {
    public static void main(String[] args) {
        //! for adding the n digit of numbers.
        int ans = adding(3471);
        System.out.println(ans);
    }
    public static int adding(int n){
        if(n%10 == n){
            return n;
        }
        return adding(n%10) + adding(n/10);
    }
}

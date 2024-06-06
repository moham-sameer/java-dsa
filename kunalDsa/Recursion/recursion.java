package kunalDsa.Recursion;

public class recursion {
    public static void main(String[] args) {
            fun(1);
            System.out.println(fun(4));
    } 
    public static int fun(int n ){
        
         if(n <= 1){
          return n;
        }else{

            return fun(n-1)+ fun(n-2);
        }
    }
}

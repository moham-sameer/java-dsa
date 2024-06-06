package kunalDsa.Recursion;

public class pattern {
    public static void main(String[] args) {
        triangle(5, 5);
    }
    public static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            triangle(r,c+1);
        }else{
            System.out.println("");
            triangle(r-1, 0);
        }
    }
}
